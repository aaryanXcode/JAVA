class circle
{
	int r;
	double PI,a;
	circle()
	{
		PI=3.14;
		r=4;
	}
	circle(int r)
	{
		this.r=r;
		PI=3.14;
	}
	void area()
	{
		a=PI*r*r;
	}
	void show()
	{
		System.out.println("area of circle is ="+a);
	}
}
