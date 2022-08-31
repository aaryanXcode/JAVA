import java.sql.*;
class dbconn 	
{
	Connection con;
	dbconn()
	{
		try
		{
			DriverManager.registerDriver((Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance());
		}
		catch(Exception e)
		{
				System.out.println("EX"+e);
		}
	}
	public Connection connection()
	{	
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
			
		}
		catch(Exception e)
		{
				System.out.println("EX"+e);
		}
		return con;
	}
}
     