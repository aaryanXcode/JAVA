import java.io.*;
import java.util.*;
import java.sql.*;
class Demo_Jdbc
{
	Demo_Jdbc()
	{
		try
		{
		
			Driver dr=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver(dr);
			Connection cn=DriverManager.getConnection("jdbc:odbc:data","","");
			Statement st=cn.createStatement();
			//ResultSet rs=st.executeQuery("SELECT `Sheet1$`.* FROM `Sheet1$`");
			ResultSet rs=st.executeQuery("select * from stud_marks"); 
			while(rs.next())
			{
			 	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString("English"));
			}
			/*rs.first();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}	*/
			rs.close();
		
		}
		catch(Exception e)
		{
			System.out.println("ex "+e);	
		}
	}
	public static void main(String a[])
	{
		new Demo_Jdbc();
	}
}

	