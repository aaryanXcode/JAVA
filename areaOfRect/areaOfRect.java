class rectParameter
{
	int l,b,a;
	void setData(int x,int y)
	{
		l=x;
		b=y;
	}
	void area()
	{
		a=l*b;
	}
	void show()
	{
		System.out.println("area  of rectangle is="+a);
	}
}
class areaOfRect
{
	public static void main(String args[])
	{
		rectParameter R;
		R=new rectParameter();
		R.setData(3,4);
		R.area();
		R.show();
	}
}