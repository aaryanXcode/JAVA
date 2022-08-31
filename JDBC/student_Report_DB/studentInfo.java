import java.sql.*;
import java.util.*;
public class studentInfo
{
	int Rollno;
	int physicsMarks;
	int chemistryMarks;
	int mathMarks;
	int totalMarks;
	int percentage;
	String division;
	Vector v = new Vector();  
	studentInfo()
	{
	}
	studentInfo(int roll,int phy,int chem,int math)
	{
		
		Rollno=roll;
		physicsMarks=phy;
		chemistryMarks=chem;
		mathMarks=math;
		totalMarks=0;
		percentage=0;
		division="";
	}
	////////////////////////////////////////////////////////////////////////////////
	/*
	public boolean firstDivision()
	{
    	if(division=="1st division")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean secondDivision()
	{

    	if(division=="2nd division")
        {
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean thirdDivision()
	{
		if(division=="3rd division")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean fail()
	{
		if(division=="fail")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	*/
	public void processResult()
	{
		
		totalMarks=physicsMarks+chemistryMarks+mathMarks;
		percentage=totalMarks/3;
		
		
		if(physicsMarks>=35)
		{
				if(chemistryMarks>=35)
				{
						if(mathMarks>=35)
						{
							if(percentage>=35)
							{ 
								if(percentage<=45)
								{ 
					
									division="3rd division";
								}	
							}
							if(percentage>45)
							{
								if(percentage<=60)
								{ 
									division="2nd division";
								}   
							}
							if(percentage>60)
							{   
								division="1st division";
							}
							
 
						}	 
						if(mathMarks<35)
						{
						
							division= "fail";
						}
				}
				if(chemistryMarks<35)
				{
				
					division= "fail";
				}	
		}
		if(physicsMarks<35)
		{
			division= "fail";
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	//below db function
	public void getData()
	{
		try
		{
			
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from students_info");
			
			while(rs.next())
			{
				//new studentList(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				Vector data=new Vector();
				System.out.println(" "+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
				data.add(rs.getString(1));
				data.add(rs.getString(2));
				data.add(rs.getString(3));
				data.add(rs.getString(4));
				data.add(rs.getString(5));
				data.add(rs.getString(6));
				data.add(rs.getString(7));
				v.add(data);
			}
			for(int i=0;i<v.size();i++)
			{
				System.out.println(v.get(i));
			}
			new list(v);
				
		}
		catch(Exception e)
		{
				System.out.println("EX"+e);
		}
		
	}
	
	public void insertData()
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			processResult();
			
			System.out.println(Rollno+" "+physicsMarks+" "+chemistryMarks+" "+mathMarks+" "+totalMarks+" "+percentage+" "+division);
			
			if(!st.execute("insert into students_Info (Rollno,physicsMarks,chemistryMarks,mathMarks,totalMarks,percentage,division)values('"+Rollno+"','"+physicsMarks+"','"+chemistryMarks+"','"+mathMarks+"','"+totalMarks+"','"+percentage+"','"+division+"')"))
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
	}
	public void getStudentData(int roll)
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from students_info where Rollno=' "+roll+"' ");
			
			while(rs.next())
			{
				//System.out.println(" "+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
				new updateStudent().updateData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("EX"+e);
		}
	}
		
	//update data
	public void updateData(int rollno,int phys,int chems,int maths,int tt,int pcent,String div)
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			System.out.println(rollno+" "+phys+" "+chems+" "+maths+" "+tt+" "+pcent+" "+div);
			boolean res=st.execute("update students_info set Rollno='"+rollno+"', physicsMarks='"+phys+"',chemistryMarks='"+chems+"',mathMarks='"+maths+"',totalMarks='"+tt+"',percentage='"+pcent+"',division='"+div+"' where Rollno='"+rollno+"'");
			
			
			
			if(!res)
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
	public void deleteData(int rollno)
	{
		try
		{
			Connection con=new dbconn().connection();
			Statement st=con.createStatement();
			System.out.println(rollno);
			if(!st.execute("delete from students_Info where Rollno='"+rollno+"'"))
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
}
		
	
	  