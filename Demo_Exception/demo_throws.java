class demo_throws
{
	int x;
	demo_throws()
	{
		x=0;
	}
	demo_throws(int  x)
	{
		this.x=x;
	}
	int div(demo_throws m) throws ArithmeticException
	{
		int d;
		
		d=x/m.x;
		
		return(d);											
	
	}
	void show()
	{
		if(x==0)
		{
			System.out.println("Result is: Infinity");
		}
		else
		{

			System.out.println("Result is:"+x);
		}
	}
	public static void main(String a[])
	{
		demo_throws A=new demo_throws(0);
		demo_throws B=new demo_throws(1);		
		demo_throws Z;
		int z1=0;
		try
		{
			z1=A.div(B);
			Z=new demo_throws(z1);
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
			Z=new demo_throws(z1);
			
		}
		
		Z.show();
	}
}
		
		