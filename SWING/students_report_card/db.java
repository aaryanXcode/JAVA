import java.sql.*;
import java.util.*;
class db
{
	Vector classV=new Vector();
	db()
	{
		
	}
	public void getClassesInfo(Vector classData,TreeMap<String, String> map )
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student_class");
			while(rs.next())
			{
				//Vector data=new Vector();
				//data.add(rs.getString(2));
				//data.add(rs.getString(1));
				//System.out.println(" "+rs.getString(1)+"\t"+rs.getString(2));
				map.put(rs.getString(1),rs.getString(2));
				
				classData.add(rs.getString(2));
			}
			 System.out.println("Mappings of HashMap are : "+ map);
			for (Map.Entry<String, String> e : map.entrySet())
            {
				System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
			}
		}
		catch(Exception e)
		{
			System.out.println("EX"+e);
		}
		
	}
	public void getSectionInfo(Vector sectionData)
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student_section");
			
			while(rs.next())
			{
				//Vector data=new Vector();
				//data.add(rs.getString(2));
				//data.add(rs.getString(1));
				//System.out.println(" "+rs.getString(1)+"\t"+rs.getString(2));
				sectionData.add(rs.getString(1));
			}
			
		}
		catch(Exception e)
		{
			System.out.println("EX"+e);
		}
		
	}
	public void getStudentData(Vector studentData,String class_name,String section_name)
	{
		System.out.println(class_name+" "+section_name);
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student_info Where class_id='class_name' AND section_id='section_name'");
			
			while(rs.next())
			{
				
				System.out.println(" "+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("EX"+e);
		}
	}
	public static void main(String args[])
	{
		new db();
	}
}