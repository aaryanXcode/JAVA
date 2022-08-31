   class demo_Exep_Ini
{
	int x;
	int  y,z;
	String val;
	demo_Exep_Ini()	
	{
		my_io in=new my_io();
		val=" Result : ";
		x=in.read_Int("Enter The no:");
		y=in.read_Int("Enter The no:");
		try
		{
			z=x/y;
			val=val+z;
		}
		catch(ArithmeticException e)
		{
			//System.out.println("Exception :"+e);
			val=val+" Infinity ";
		}

		System.out.println(val);
		System.out.println("<<PROGRAM SUCESSFULLY COMPLETED>>");
		
	}
	public static void main(String a[])
	{	
		demo_Exep_Ini z=new demo_Exep_Ini();
	}
}
 

	