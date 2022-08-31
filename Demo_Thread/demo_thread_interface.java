class demo_thread_interface implements Runnable
{
	Thread th;	
	int t;
	demo_thread_interface(int t)
	{
		th=new Thread(this);		
		this.t=t;
		th.start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+"*"+i+"="+(t*i));
		
			try
			{
				th.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Exception from inside"+e);
			}
		}
	}

	public static void main(String arg[])
	{ 
		new demo_thread_interface(2);
		new demo_thread_interface(4);
		new demo_thread_interface(8);
	}
}