class demo_input
{
	public static void main(String m[])
	{
		int x,y,z;
		my_io in=new my_io();
		x=in.read_Int("ENTER 1st NUMBER");
		y=in.read_Int("ENTER 2nd NUMBER");
		z=x+y;
		System.out.println("The Sum of "+z);
	
	}
}