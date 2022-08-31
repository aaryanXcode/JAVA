class num
{
	int a,b,c;
	void setData(int x,int y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		c=a+b;
	}
	void show()
	{
		System.out.println("sum is="+c);
	}
}
class sum
{
	public static void main(String args[])
	{
		num x;
		x=new num();
		x.setData(4,7);
		x.add();
		x.show();
	}
}