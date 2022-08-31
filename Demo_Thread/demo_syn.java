class TablePrinter extends  Thread  
{
	
	
	public void table(int n)
	{	
		
		System.out.println("table of "+n+" is:");
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(n+"*"+i+"="+i*n);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}		
class Process extends Thread
{	
	TablePrinter sn;
	int no;
	Process (String name,TablePrinter  snn,int x)
	{
		setName(name);
		no=x;
		sn=snn;
		System.out.println("Instance Created For "+x);
		start();
	}
	public void run()
	{
		synchronized(sn)
		{
			sn.table(no);
		}
			
	}
	
	
}
class demo_syn
{
	public static void main(String a[])
	{
		TablePrinter x=new TablePrinter ();
		new Process ("A",x,11);
		new Process ("B",x,22);
		new Process ("C",x,3);
		new  Process ("D",x,5);
		

	}
}
			
                       		