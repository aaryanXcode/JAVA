import java.sql.*;
class demo_jdbc_mysql 	
{
	public static void main(String a[])
	{
		try
		{
			DriverManager.registerDriver((Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from author");
			while(rs.next())
			{
					System.out.println(" "+rs.getString(1)+"\t"+rs.getString(2));
			}
		}
		catch(Exception e)
		{
				System.out.println("EX"+e);
		}
	}
}
     