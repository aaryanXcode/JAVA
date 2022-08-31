import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class demo_dbase_conn extends Frame implements ActionListener
{

	Button  btadd,btsave,btnext,btprev;
	Label lb1,lb2;
	TextField t1,t2;
	Driver dr;
	Connection cn;
	Statement st;
	Object data[][];
	int nxt,prev;
	int rows;
	demo_dbase_conn()
	{
		super("demo_dbase_conn");
		setVisible(true);
		setSize(400,400);
		setLayout(new GridLayout(4,2));
		lb1=new Label("ENTER NAME");
		lb2=new Label("ENTER Roll No");
		t1=new TextField();
		t2=new TextField();
		add(lb1);
		add(t1);		
		add(lb2);
		add(t2);
		btadd=new Button("ADD");
		btsave=new Button("SAVE");
		btnext=new Button("NEXT");
		btprev=new Button("PREVIOUS");
		add(btadd);
		add(btsave);
		add(btnext);
		add(btprev);
		btadd.addActionListener(this);
		btsave.addActionListener(this);
		btnext.addActionListener(this);
		btprev.addActionListener(this);
		try
		{
			dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(dr);
			cn=DriverManager.getConnection("jdbc:odbc:data1","","");
			st=cn.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(" Connection failed!!"+e);
		}
		nxt=0;
		prev=0;
		try
		{
			data=fetch_data();
		}
		catch(Exception e)
		{
			System.out.println(" data retrival failed!!"+e);
		}
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btadd)
		{
			t1.setText("");
			t2.setText("");
			t1.requestFocus();
		}
		else if(ae.getSource()==btsave)
		{
			String sql=new String("insert into student values('"+t1.getText()+"','"+t2.getText()+"','00')");
			System.out.println(sql);
			try
			{
				st.executeUpdate(sql);
			}
			catch(Exception e)
			{
				System.out.println(" data insert failed!!"+e);	
			}
			try
			{
				data=fetch_data();
			}
			catch(Exception e)
			{
				System.out.println(" data retrival failed!!"+e);
			}
		}	
		else if(ae.getSource()==btnext)
		{
			try
			{
				t1.setText((String)data[nxt][0]);
				t2.setText((String)data[nxt][1]);
				prev=nxt-1;
				nxt++;
				System.out.println("Nxt "+nxt +"prev "+prev);
			}
			catch(Exception e)
			{
				if(nxt>rows-1)
					JOptionPane.showMessageDialog(this,"No More Next!!","Info",JOptionPane.INFORMATION_MESSAGE);	
				else
					JOptionPane.showMessageDialog(this,"err!!"+e ,"Info",JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		else if(ae.getSource()==btprev)
		{
			try
			{
			
				t1.setText((String)data[prev][0]);
				t2.setText((String)data[prev][1]);
				nxt=prev+1;
				prev--;
			}
			catch(Exception e)
			{
				if(prev<0)
					JOptionPane.showMessageDialog(this,"No More Previous!!","Info",JOptionPane.INFORMATION_MESSAGE);	
				else
					JOptionPane.showMessageDialog(this,"err!!"+e ,"Info",JOptionPane.INFORMATION_MESSAGE);	
			}
		}
	}	
	Object [ ][ ] fetch_data() throws Exception
	{
		Object data[][];
		rows=0;
		ResultSet rs=st.executeQuery("select *  from student");
		
		while(rs.next())
		rows++;

		System.out.println(rows);
		data=new Object[rows][2];
		rs=st.executeQuery("select *  from student");
		int i=0;
		while(rs.next())
		{
			data[i][0]=new Object();
			data[i][1]=new Object();
	
			data[i][0]=rs.getString(1);
			data[i][1]=rs.getString(2);
			i++;
		}
		return(data);
	}	
	public static void main(String [ ] arr)
	{
		new demo_dbase_conn();
	}

}