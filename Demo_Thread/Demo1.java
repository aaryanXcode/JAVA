  class Demo1 implements MyInterface
{
	Class1 th;
	public Demo1()
	{
		th=new Class1(this);	
		th.start();
	}

	public void show()	
	{
		System.out.println("Hello From Demo1");
	}
	public static void main(String a[])
	{
		new Demo1();
	}
}