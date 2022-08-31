class demo_thread_inter implements Runnable
{
	int no;
	Thread t;
	demo_thread_inter(int no)
	{
		t=new Thread(this);
		this.no=no;
		t.start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*no);
			try
			{
				t.sleep(200);
			}
			catch(Exception e)
			{
				System.out.println("Exception from inside run"+e);
			}
		}
	}
	public static void main(String a[])
	{
		new demo_thread_inter(3);
		new demo_thread_inter(4);
	}
}