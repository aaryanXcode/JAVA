import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class demo1 extends Frame implements ActionListener
{
	Button Badd,Bsave,Bnext;
	Label l1,l2,l3,l4;
	TextField tx1,tx2,tx3,tx4;
	Driver d;
	Connection  c;
	Statement s;
		
	demo1()
	{
		super("Demo1");
		l1=new Label("Enter name");
		l2=new Label("Enter city");
		l3=new Label("Enter phone no.");
		l4=new Label("Enter roll no.");
		tx1=new TextField(8);
		tx2=new TextField(8);
		tx3=new TextField(8);	
		tx4=new TextField(8);
		add(l1);
		add(tx1);
		add(l2);
		add(tx2);
		add(l3);
		add(tx3);
		add(l4);
		add(tx4);
		Badd=new Button("ADD");
		Bsave=new Button("SAVE");
		Bnext=new Button("NEXT");
		add(Badd);
		add(Bsave);
		add(Bnext);
		Badd.addActionListener(this);
		Bsave.addActionListener(this);
		Bnext.addActionListener(this);
		try
		{
			d=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(d);
			c=DriverManager.getConnection("Jdbc:Odbc:Priyanka","","");
			s=c.createStatement();
		}
		catch(Exception e)
		{
			System.out.println("Connection field"+e);
		}
		next=0;
		try
		{
			data=fetch_data();
		}
		catch(Exception e)
		{
			System.out.println("Data Retrive Field"+e);	
		}
	}	
	public static void main(String arg[])
	{
		new demo1();
	}
}