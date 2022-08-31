class Rect  implements Shape
{
	int a,h,w,p;
	Rect(int h,int w)
	{
		this.h=h;
		this.w=w;
	}
	public int area()
	{
		a=h*w;
		return(a);
	}
	public int perimeter()
	{
		p=2*(h+w);
		return(p);	
	}
	public void show()
	{
		System.out.println("The Perimeter of Rectangle  is="+p);
		System.out.println("The Area of Rectangle  is="+a);
	}
}
		