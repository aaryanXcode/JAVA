class add
{
	int a,b,c;
	void getData()
	{
		my_io in=new my_io();
		a=in.read_Int("ENTER 1st NUMBER");
		b=in.read_Int("ENTER 2nd NUMBER");
	}
	void sum()
	{
		c=a+b;
	}
	void show()
	{
		System.out.println("sum of two number is="+c);
	}
}
class demo
{	
	public static void main(String args[])
	{

		add x;
		x=new add();
		x.getData();
		x.sum();
		x.show();
	}
}

	