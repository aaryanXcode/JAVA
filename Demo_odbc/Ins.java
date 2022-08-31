import java.util.*;
import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class Sea extends Frame implements ActionListener
{
	Label a,b;
	TextField m,n;
	Statement st;
	Button b1;
	Button b2;
	Sea()
	{
		setLayout(new BorderLayout());
		setSize(400,400);	
		setVisible(true);
		a=new Label("NAME");
		
		c=new Label("CITY");
		
		b1=new Button("SEARCH");
		m=new TextField(10);
		n=new TextField(10);
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(2,3));
		p1.add(a);
		p1.add(m);
		p1.add(b1);
		p1.add(b);
		p1.add(n);
		p1.add(b2);
		
		add(p1,BorderLayout.CENTER);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		show();
		try
		{
		
			Driver dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(dr);
			Connection cn=DriverManager.getConnection("jdbc:odbc:data12","","");
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
			if(e.getSource==b1)
			{
			String sql=new String("select * from telephone where nam='m.getText()';
			System.out.println(sql);
			int x=st.executeUpdate(sql);
			System.out.println("Updated :"+x);
			}
			if(e.getSource==b2)
			{
			String sql=new String("select * from telephone where phone='n.getText()';
			System.out.println(sql);
			int x=st.executeUpdate(sql);
			System.out.println("Updated :"+x);
			}
		}
		catch(Exception e1)
		{
			System.out.println("Exception sql :"+e1	);
		}

	}
	public static void main(String a[])
	{
		new Sea();	
	}
}

	

	