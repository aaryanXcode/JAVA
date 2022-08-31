
import java.sql.*;
class Demo_Data 	
{
	public static void main(String a[])
	{
		try
		{
			DriverManager.registerDriver((Driver)Class.forName("net.ucanaccess.jdbc.UcanaccessDriver").newInstance());
			Connection con=DriverManager.getConnection("jdbc:ucanaccess://db.accdb;showSchema=true ");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from stud");
			while(rs.next())
			{
					System.out.println(" "+rs.getString(1)+"\t"+rs.getString("roll"));
			}
		}
		catch(Exception e)
		{
				System.out.println("EX"+e);
		}
	}
}
     