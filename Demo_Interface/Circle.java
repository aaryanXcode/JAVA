class Circle  implements Shape
{
	int r,a,p;
	Circle(int r)
	{
		this.r=r;
	}
	public int area()
	{
		a=(int)(pi*r*r);
		return(a);
	}
	public int perimeter()
	{
		p=(int)(2*pi*r);
		return(p);	
	}
	public void show()
	{
		
		System.out.println("The Perimeter of Circle="+p);
		System.out.println("The Area of Circle="+a);

	}
}