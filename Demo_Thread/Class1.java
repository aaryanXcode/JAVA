class Class1 implements MyInterface
{
	MyInterface ss;
	public Class1()
	{
		ss=this;	
		
	}	
	public Class1(MyInterface in)
	{
		ss=in;	
		
	}	
	public void start()
	{
		ss.show();	
	}
	public void show()
	{	
		System.out.println("Hello From Class1");
	}
}
	