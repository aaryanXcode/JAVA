class Demo_Priority extends Thread
{
	
	public static void main(String a[])
	{
		Child ch1;
		Child ch2;
		Child ch3;
	
		boolean rn=true;
		int x=0;
		ch1=new Child("MIN PRIORITY",NORM_PRIORITY-4);
		ch2=new Child("MAX PRIORITY",NORM_PRIORITY+4);
		ch3=new Child("NORM PRIORITY",NORM_PRIORITY);
		currentThread().setPriority(MAX_PRIORITY);
		while(rn)
		{
			try
			{
				System.out.println("Running main..............");
				sleep(1000);
				
			}
			catch(Exception e)
			{
				System.out.println("Exception main "+e);
			}
			x++;
			ch1.show();
			ch2.show();
			ch3.show();

			
			if(x>30)
			{
				rn=false;
				ch1.stop();
				ch2.stop();
				ch3.stop();

			}	
		}


		System.exit(0);

	}
}

class Child extends Thread
{
	int count;
	boolean rn;
	Child(String name,int pri)
	{	
		//super(th);
		setName(name);
		setPriority(pri);
		count=0;
		rn=true;
		start();
	}
	public void run()
	{
		while(rn)	
		{
			count++;
			try
			{
				sleep(10);
			}
			catch(Exception e)
			{
				System.out.println("Exception child "+e);
			}
		}
	}
	public void stop1()
	{
		rn=false;
	}
	void show()
	{
		
		System.out.println("Execution Counter of  ["+getName()+"]"+count);
		
	}


}