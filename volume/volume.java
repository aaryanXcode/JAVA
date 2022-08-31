class cylinder extends circle
{
	int h;
	double vol;
	cylinder()
	{
		super(); //this is call to super and parent class default constructor and this should be very first statement in derived class constructor
		h=10;
	}
	cylinder(int h,int r)
	{
		super(r);
		this.h=h;
	}
	void volume()
	{
		area();
		vol=a*h;
	}
	void  show()
	{
		System.out.println("volume of cylinder is="+vol);
	}
}
class volume
{
	public static void main(String args[])
	{
		cylinder c=new cylinder(4,2);
		c.volume();
		c.show();
		c.show();
	}
}
	