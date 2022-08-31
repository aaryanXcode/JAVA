class Table extends Thread
{
	int t;
	Table(int t)
	{
		this.t=t;
		start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+"*"+i+"="+(t*i));
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("Exception from inside"+e);
			}
		}
	}

	
}
class demo_thread
{
	public static void main(String arg[])
	{ 
		for(int i=1;i<=10;i++)
		{
			new Table(i);
		}
		new Table(3);
		new Table(5);
		new Table(6);
		

	}
}