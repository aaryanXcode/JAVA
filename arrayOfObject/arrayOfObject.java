class array
{
	int a,b,c;
	void getData(int a ,int b)
	{
		this.a=a;
		this.b=b;
	}
	void sum()
	{
		c=a+b;
	}
	void show()
	{
		System.out.println("sum of  "+a+"and "+b+"is="+c);
	}
}
class arrayOfObject
{
	public static void main(String args[])
	{
		int i;
		array x[]=new array[10];
		my_io in=new my_io();
		for(i=0;i<10;i++)
		{
			 x[i]=new array();
			x[i].getData(in.read_Int("enter 1st number"),in.read_Int("enter second number"));
			x[i].sum();
			x[i].show();
		}
	}
}
			