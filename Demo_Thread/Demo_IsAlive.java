class Demo_IsAlive extends Thread
{
	int no;
	int range;
	Demo_IsAlive(char x,int range)
	{
		super("[ THREAD :"+x+"]");
		this.range=range;
		start();
	}
	public void run()
	{
		for(int i=1;i<=range;i++)
		{
			System.out.println("OUTPUT OF "+getName()+" :"+i);
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		
		}
		stop();
	}
	void threadStatus()
	{
		if(isAlive())
		{
			System.out.println("OUTPUT OF "+getName()+" :"+getName()+" is Live");	
		}
		else
		{
			System.out.println("OUTPUT OF "+getName()+" :"+getName()+" is Dead");	
		}
	}
	public static void main(String a[])
	{
		boolean ru=true;
		while(ru)
		{
			Demo_IsAlive A[]=new Demo_IsAlive[4];
			A[0]=new Demo_IsAlive('A',7);
			A[1]=new Demo_IsAlive('B',10);
			A[2]=new Demo_IsAlive('C',15);
			A[3]=new Demo_IsAlive('D',30);
			for(int i=0;i<4;i++)
			{
				A[i].threadStatus();
			}
			try
			{
				for(int j=0;j<4;j++)
				{
					A[j].join();
					System.out.println("OUTPUT OF Main Thread"+Thread.currentThread().getName()+" :"+A[j].getName()+"  is Dead");
					for(int i=0;i<4;i++)
					{
						A[i].threadStatus();
					}
				}	
				for(int i=0;i<4;i++)
				{
					A[i].stop();
				}
		
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			ru=false;
			System.out.println("Final Status of Threads Are:");
			for(int i=0;i<4;i++)
			{
				A[i].threadStatus();
			}
		}
	}
	
}

			
			

