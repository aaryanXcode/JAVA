 
import java.sql.*;
import java.util.*;

class Demo_Data 
{	
	Connection cn;
	Statement st;
	Driver dr;
	Demo_Data()
	{
		
		try
		{
			Driver dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(dr);
			cn=DriverManager.getConnection("jdbc:odbc:data1","","");
			st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from stud_marks");
			while(rs.next())
			{
				String s1=rs.getString(1);
				String s2=rs.getString("roll");
				String s3=rs.getString(3);
				System.out.println(s1+"\t"+s2+"\t"+s3);
			}	
 
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
	
	}
	public static void main(String s[])
	{
		new Demo_Data();
	}

}