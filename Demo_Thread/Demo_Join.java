class Demo_Join extends Thread
{
	int n,r;
	Demo_Join(int x,int r)
	{
		setName("Genrating Table Of ["+x+"]");
		System.out.println("Instance Genrated For Thread:"+getName());
		n=x;
		this.r=r;
	}
	public void run()
	{
		for(int i=1;i<=r;i++)
		{
			System.out.println(getName()+": "+(n*i));
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{}

		}
				
	}
	public static void main(String a[])
	{
		Demo_Join ch1=new Demo_Join(4,3);
		Demo_Join ch2=new Demo_Join(5,10);
		Demo_Join ch3=new Demo_Join(6,10);
		ch1.start();
		try
		{
			ch1.join();
			System.out.println(" Ch1 is Dead");
		}
		catch(Exception e)
		{}
		ch2.start();
		try
		{
			ch2.join();
			System.out.println(" Ch2 is Dead");
		}
		catch(Exception e)
		{}
		ch3.start();
		try
		{
			ch3.join();
			System.out.println(" Ch3 is Dead");
		}
		catch(Exception e)
		{}
	}
}
