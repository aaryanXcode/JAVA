import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import javax.swing.table.*;

class Demo_JTable_Vactor extends JFrame implements ActionListener
{
	
	
	JScrollPane jsp;
	JTextField tx_ro,tx_col;
	JLabel l1,l2;
	Vector data;
	Vector cols;
	//Container contantPane;
	JPanel jp;
	JButton del_row,del_col,draw;
	JTable jtb;
	
	Demo_JTable_Vactor()
	{	
		setLayout(new BorderLayout());
		
		setSize(400,400);
		data=new Vector();
		cols=new Vector();
		jp=new JPanel();

		jp.setLayout(new FlowLayout());

		draw=new JButton("Draw New");
		del_col=new JButton("Delete Column");
		del_row=new JButton("Delete Row");
		l1=new JLabel("Enter Rows:");
		tx_ro=new JTextField(3);
		l2=new JLabel("Enter Cols:");
		tx_col=new JTextField(3);
		
		jp.add(l1);
		jp.add(tx_ro);
		jp.add(l2);
		jp.add(tx_col);
		jp.add(draw);
		jp.add(del_col);
		jp.add(del_row);

		for(int i=0;i<10;i++)
		{
			
			cols.add(" "+(i+1));
			Vector ro=new Vector();
			for(int j=0;j<10;j++)
			{
				ro.add(" "+((j+1)*(i+1)));
			}
			data.add(ro);
		}
		TableModel tb=new DefaultTableModel(data,cols);
		jtb=new JTable();
		jtb.setModel(tb);
		
		int v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		int h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		//jtb.setAutoResizeMode(1);
		//jtb.setShowHorizontalLines(false);
		//	jtb.setShowVerticalLines(false);
		//jtb.sizeColumnsToFit(true);

		jsp=new JScrollPane(jtb,v,h);
				
		add(jsp,BorderLayout.CENTER);		
		add(jp,BorderLayout.NORTH);		

		/*for(int i=0;i<10;i++)
		{
			Vector ro=new Vector();
			for(int j=0;j<20;j++)
			{
					ro.add(" "+((j+1)*(i+1)));
			}
			data.add(ro);
		}*/
		del_row.addActionListener(this);		
		del_col.addActionListener(this);		
		draw.addActionListener(this);		
		show();	
		
		jtb.setColumnSelectionAllowed(true);	
		jtb.setColumnSelectionInterval(0, 2);	
	}		
	public void actionPerformed(ActionEvent ae)
	{
		
		if(del_col==ae.getSource())
		{
			jtb.removeColumn(jtb.getColumnModel().getColumn(jtb.getSelectedColumn()) );
		}
		else if(del_row==ae.getSource())
		{
			data.remove(jtb.getSelectedRow());
		}
		else if(draw==ae.getSource())
		{
			jtb.removeAll();
			TableModel tb=new DefaultTableModel(new Vector(),new Vector());
			jtb.setModel(tb);
			data.removeAllElements();
			cols.removeAllElements();
			
			int r=0,c=0;
			try
			{
				r=Integer.parseInt(tx_ro.getText());
			}
			catch(Exception e )
			{
				r=0;
			}
			try
			{
				c=Integer.parseInt(tx_col.getText());
			}
			catch(Exception e )
			{
				c=0;
			}
			for(int j=0;j<c;j++)
			{
				cols.add(" "+(j+1));
			}
			for(int i=0;i<r;i++)
			{
				
				
				Vector ro=new Vector();
				for(int j=0;j<c;j++)
				{
						ro.add(" "+((j+1)*(i+1)));
				}
				data.add(ro);
				System.out.println(ro);
			}
			tb=new DefaultTableModel(data,cols);
			jtb.setModel(tb);
		}		
		jtb.updateUI();		
		jtb.sizeColumnsToFit(true);
		jsp.updateUI();
	}
	public static void main(String s[])
	{
		new Demo_JTable_Vactor();
	}
}	