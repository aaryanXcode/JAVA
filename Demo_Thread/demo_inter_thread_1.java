class Consumar extends Thread
{
	Producer p;
	Consumar(Producer pp)
	{
		p=pp;
		start();
	}
	public void run()
	{
		synchronized(this)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println("exception from producer"+e);
			}
		}
		for(;;)
		{
	
	
			System.out.println("PRODUCT CONSUMED : ===="+p.item);
			try
			{
				sleep(200);
			}
			catch(Exception e)
			{
				System.out.println("exception from consumar"+e);
			}
			p.item--;
			
			synchronized(this)
			{
				if(p.item<1)
				{
					try
					{
						System.out.println("Producer Resumed>>>>>>>>>>>>>>>>>>>");
						p.noti();
						wait();
					}
					catch(Exception e)
					{
						System.out.println("exception from consumar"+e);
					}
	
				}
			}
		}
	}
	synchronized public void noti()
	{
		notify();
	}
}

class Producer extends Thread
{
	Consumar cc;
	int item;
	Producer()
	{
		cc=new Consumar(this);
		item=0;
		start();
		
	}
	public void run()
	{
		
		for(;;)
		{
			
			item++;
			System.out.println("PRODUCT PRODUCED : "+item);
			try
			{
				sleep(200);
			}
			catch(Exception e)
			{
				System.out.println("exception from consumar"+e);
			}
			synchronized(this)
			{
				if(item>9)
				{
					try
					{
						System.out.println("Consumar Resumed>>>>>>>>>>>>>>>>>>>");
						cc.noti();
						wait();
					}
					catch(Exception e)
					{
						System.out.println("exception from producer"+e);
					}


				}
			}
		}
	}
	synchronized public void noti()
	{
		notify();
	}
}

class demo_inter_thread_1
{
	public static void main(String s[])	
	{
		new Producer();
	}
}	