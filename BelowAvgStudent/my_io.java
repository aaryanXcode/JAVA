import java.io.*;
class my_io
{
	BufferedReader br;
	String val;
	int x;
	float y;
	my_io()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
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
			System.out.println("exception"+e);
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