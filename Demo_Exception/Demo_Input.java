class  Demo_Input
{
	public static void main(String a[])
	{	
		int x;
		my_io A=new my_io();
		x=A.read_Int("Enter Number:");
		System.out.println("You Are Entered:"+x);
		String s=A.read_Str("Enter String :");
		System.out.println("You Are Entered:"+s);
	}
}
