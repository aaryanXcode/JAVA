class add
{
	int a,b,c;
	void getData(int x,int y)
	{
		this.a=x;
		this.b=y;
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
class Addition
{	
	public static void main(String args[])
	{

		add x;
		my_io in=new my_io();
		x=new add();
		x.getData(in.read_Int("enter 1st number"),in.read_Int("enter second number"));
		x.sum();
		x.show();
	}
}

	