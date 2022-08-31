import java.io.*;
class my_io
{
	BufferedReader br;
	String val;
	int x;
	double x1;
	float y;
	my_io()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	double read_Double(String msg)
	{
		System.out.println(msg);
		try
		{
			val=br.readLine();
			x1=Double.parseDouble(val);
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}
		return(x1);
	}
	int read_Int(String msg)
	{
		
		System.out.println(msg);
		try
		{
			val=br.readLine();
			x=Integer.parseInt(val);
		}
		catch(Exception e)
		{
			//System.out.println("exception"+e);
			x=0;
		}
		return(x);
	}
	float read_Float(String msg)
	{
		System.out.println(msg);
		try
		{
			val=br.readLine();
			y=Float.parseFloat(val);
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}
		return(y);
	}
	String read_Str(String msg)
	{
		System.out.println(msg);
		try
		{
			val=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}
		return(val);
	}
	
}			