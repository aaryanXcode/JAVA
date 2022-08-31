class demo_interface
{
	public static void main(String a[])
	{
		Shape x;
		Circle c=new Circle(4);		
		x=c;
		x.perimeter();
		x.area();
		x.show();

		Rect r=new Rect(4,5);
		x=r;
		x.perimeter();
		x.area();
		x.show();
		
	}
}

	
