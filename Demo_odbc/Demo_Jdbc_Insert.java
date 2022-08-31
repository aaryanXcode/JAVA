import java.io.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class Demo_Jdbc_Insert extends Frame implements ActionListener
{
	TextField uid,roll,city;
	Button insert;
	Statement st;
	Demo_Jdbc_Insert()
	{
		setSize(400,400);	
		setLayout(new FlowLayout());
		setVisible(true); 
		uid=new TextField(10);
		roll=new TextField(10);
		city=new TextField(10);

		insert=new Button("INSERT");
		add(uid);
		add(roll);
		add(city);

		add(insert);
		insert.addActionListener(this);
		show();
		try
		{
		
			Driver dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(dr);
			Connection cn=DriverManager.getConnection("jdbc:odbc:data1","","");
			st=cn.createStatement();
		}
		catch(Exception e)
		{
			System.out.println("Exception connection :"+e);
		}
	}
	public void actionPerformed(ActionEvent e)
	{


		try
		{
			String sql=new String("insert into student(nam,rollno,city) values('"+uid.getText()+"','"+roll.getText()+"','"+city.getText()+"')");
			System.out.println(sql);
			int x=st.executeUpdate(sql);
			System.out.println("Inserterd :"+x);
		}
		catch(Exception e1)
		{
			System.out.println("Exception sql :"+e1	);
		}

	}
	public static void main(String a[])
	{
		new Demo_Jdbc_Insert();	
	}
}

	

			