import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class demo_dbase_conn_map  extends Frame implements ActionListener
{

	Button  btadd,btsave,btnext,btprev;
	Label lb1,lb2;
	TextField t1,t2;
	Driver dr;
	Connection cn;
	Statement st;

	int nxt,prev;
	int rows;
	Map data;
	demo_dbase_conn_map()
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
			dr=(Driver)Class.forName("net.ucanaccess.jdbc.UcanaccessDriver").newInstance();
			DriverManager.registerDriver(dr);
			cn=DriverManager.getConnection("jdbc:ucanaccess://jdbc.mdb;","","");
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
				String ss=JOptionPane.showInputDialog(this,"Enter Roll NO:","Search",JOptionPane.INFORMATION_MESSAGE);
				StudentData dt=(StudentData)data.get(ss);
				if(dt!=null)
				{
					t1.setText(dt.getName());
					t2.setText(dt.getRoll());		
				}	
				else
					JOptionPane.showMessageDialog(this,"No Data Found for RollNO :"+ss,"Info",JOptionPane.ERROR_MESSAGE);			
				
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
	Map fetch_data() throws Exception
	{
		HashMap data=new HashMap();
		rows=0;
		ResultSet rs=st.executeQuery("select *  from student");
		
		rs=st.executeQuery("select *  from student");
		
		while(rs.next())
		{
			try
			{
				String rol=rs.getString(2);
				StudentData dt=new StudentData(rs.getString(1),rol,rs.getString(3));
				data.put(rol,dt);
			}
			catch(Exception e)
			{
				System.out.println("Retrival Failed:"+e);
			}
			
		}
		rows=data.size();
		return(data);
	}	
	public static void main(String [ ] arr)
	{
		new 	demo_dbase_conn_map();
	}

}