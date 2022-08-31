import java.sql.*;
class demo_crud 	
{
	String name;
	demo_crud()
	{
		name="Aryan";
	}
	public static void getData()
	{
		try
		{
			Connection con=new dbconn().connection();
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
	public  void insertData()
	{
		try
		{ 
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			//inserting data
			if(!st.execute("insert into author (author_name)values('"+name+"')"))
			{
				System.out.println("successfully inserted");
			}
			else
			{
				System.out.println("please Re-insert ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("EX"+e);
		}
		//"insert into users ('author_name')"+ "values('" + name+ "')"
		//"insert into users ('u_fname', 'u_lname', 'u_uname', 'u_pass', 'u_age', 'u_adderess')"+ "values('" + s.getFirstname() + "','" + s.getLastname()+ "','" + s.getUsername() + "','" + s.getPassword() + "','" + s.getAge() + "','" + s.getAdderss() + "')";
	}
	//update data
	public static void updateData()
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			if(!st.execute("update author set author_name='Aryan raj' where author_id=23"))
			{
				System.out.println("successfully updated");
			}
			else
			{
				System.out.println("re-update ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("EX"+e);
		}
	}
	
	//delete data
	public static void deleteData()
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			if(!st.execute("delete from author where author_id=22"))
			{
				System.out.println("successfully deleted");
			}
			else
			{
				System.out.println("re-delete ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("EX"+e);
		}
	}
		
	public static void main(String args[])
	{
		//getData();
		new demo_crud().insertData();
		getData();
		//updateData();
		//deleteData();
		//getData();
	}
}
     
	 