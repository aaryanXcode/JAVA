class demo_userdefine_exe
{
	int per;
	demo_userdefine_exe()
	{
		my_io in=new my_io();
		per=in.read_Int("Enter percentage:");
		
		try
		{
			if(per<0 || per>100)
			{
				throw new PercentFormatException(per);
			}
			
		}
		catch(PercentFormatException e)
		{
			System.out.println("Exception is:"+e);
			per=100;
		}
		System.out.println(per);
		System.out.println("program sucessfully completed");
	}
	public static void main(String a[])
	{
		new demo_userdefine_exe();
	}
}