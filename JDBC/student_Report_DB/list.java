import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.table.*;
public class list extends JFrame
{
	JTable table;
	JScrollPane scrollPane;
	JPanel panel;
	Vector cols;
	list()
	{
	}
	list(Vector v)
	{
		setLayout(new BorderLayout());
		setSize(400,400);
		panel=new JPanel();
		
		panel.setLayout(new BorderLayout());
		cols=new Vector();
		cols.add("Rollno");
		cols.add("Physics");
		cols.add("chemistry");
		cols.add("maths");
		cols.add("Total marks");
		cols.add("Percentage");
		cols.add("division");
		
		
		TableModel tb=new DefaultTableModel(v,cols);
		table=new JTable();
		table.setModel(tb);
		
		int V=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		int H=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		scrollPane=new JScrollPane(table,V,H);
		
		add(scrollPane,BorderLayout.CENTER);
		add(panel,BorderLayout.NORTH);
		show();
		
		table.setColumnSelectionAllowed(true);
		table.setColumnSelectionInterval(0,5);
	}
}