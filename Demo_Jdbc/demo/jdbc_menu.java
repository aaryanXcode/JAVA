import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class jdbc_menu extends Frame implements ActionListener
{
	MenuBar m_bar;
	Menu Edit,search;
	MenuItem Add,delete;
	MenuItem roll,name;
	jdbc_menu()
	{
		super("jdbc_menu");
		setVisible(true);
		setSize(500,500);
		m_bar=new MenuBar();
		setMenuBar(m_bar);
		Edit=new Menu("Edit");
		search=new Menu("Search");
		Add=new MenuItem("ADD");
		delete=new MenuItem("Delete");
		roll=new MenuItem("By rollno");
		name=new MenuItem("By name");
		Edit.add(Add);
		Edit.add(delete);
		search.add(roll);
		search.add(name);
		m_bar.add(Edit);
		m_bar.add(search);
		show();
		Add.addActionListener(this);
		roll.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		/*if(ae.getSource()==Add)
		{
			Interface_menu Im;
			Im=new interface_menu();
		
		}*/
		if(ae.getSource()==roll)
		{
			Demo_Data dd;
			dd=new Demo_Data();
		}
		
	}
	public static void main(String a[])
	{
		new jdbc_menu();
	}
}