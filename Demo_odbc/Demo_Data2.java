import java.sql.*;
import java.util.*;

class Demo_Data2
{	
	Connection cn;
	Statement st;
	Driver dr;
	Demo_Data2()
	{
		
		try
		{                  
			Driver dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(dr);
			Connection cn=DriverManager.getConnection("jdbc:odbc:xx","","");
			st=cn.createStatement();
			String sql=new String("insert into std1 values(6,'Priya')");
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
		new Demo_Data2();
	}

}