import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;
class Demo_m extends Frame implements ActionListener,TextListener
{
		
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1 ;
	Connection cn;
	Statement st;
	Driver dr;	
	int i=0;
	ResultSet rs;
	
	Demo_m()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setEnabled(true);
		setSize(700,700);
		
		
		l1=new Label("name");
		l2=new Label("roll");
		l3=new Label("city");
		add(l1);
		add(l2);
		add(l3);
		t1=new TextField(7);
		t1.addTextListener(this);
		add(t1);
		t2=new TextField(7);
		t2.addTextListener(this);
		add(t2);
		t3=new TextField(7);
		t3.addTextListener(this);
		add(t3);		
		b1=new Button("submit");
		b1.addActionListener(this);
		add(b1);
		
	
		show();
		try
		{
				Driver dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
				DriverManager.registerDriver(dr);
				cn=DriverManager.getConnection("jdbc:odbc:divya","","");
				st=cn.createStatement();
				rs=st.executeQuery("select * from student");
		}
		catch(Exception e)
			{
				System.out.println(e);

			}
		
	}
	public void textValueChanged(TextEvent te)
	{
	}	
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		
				
		if(ae.getSource()==b1)
		{
				
					rs.next();
					String s1=rs.getString(1);
					String s2=rs.getString("rollno");
					String s3=rs.getString("city");
					t1.setText(s1);
					t2.setText(s2);
					t3.setText(s3);
					
					
					

	}}
	catch(Exception e)
			{
				System.out.println(e);

			}		
	
			
	}
public static void main(String args[])
{
	new Demo_m();
}
}
