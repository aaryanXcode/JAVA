 import java.sql.*;
import java.util.*;

class Demo_Data1
{	
	Connection cn;
	Statement st;
	Driver dr;
	Demo_Data1()
	{
		
		try
		{                  
			Driver dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(dr);
			Connection cn=DriverManager.getConnection("jdbc:odbc:data1","","");
			st=cn.createStatement();
			String sql=new String("insert into student1 values(12,'bhilai')");
			System.out.println(sql);
			int x=st.executeUpdate(sql);	

			System.out.println("Save Successfully"+x);
		}
		catch(Exception e1)
		{
			System.out.println("Exception sql :"+e1);
		}
	
	}
	public static void main(String s[])
	{
		new Demo_Data1();
	}

}