class demo_ex_hand
{
	int a,b,c;
	demo_ex_hand()
	{
		a=6;
		b=0;
		c=0;
	}
	void div()
	{
		try
		{
			c=a/b;
		}
		catch(ArithmeticException Ae)
		{
			System.out.println(Ae+"Zero divide error");
			c=0;
		}
		show();
		System.out.println("Program Sucessfully Execuated");
		
	}
	void show()
	{
		System.out.println("The division is"+c);
	}
	public static void main(String a[])
	{
		new demo_ex_hand().div();	
	}
}