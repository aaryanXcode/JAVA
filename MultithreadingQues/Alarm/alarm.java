class hh extends Thread
{
	int HH;
    	ss S;
    	hh(ss S)
    	{
        		this.S=S;
        		start();
    	}
    	public void run()
    	{
        		try
        		{
       	   		synchronized(this)
        	   		{
           			wait();
        	   		}
        		}
        		catch(Exception e)
        		{
              		System.out.println("Exception from hh "+e);
        		}	
        		synchronized(this)
        		{
	        		for(;;)
	        		{
	            		HH++;
	            		S.noti();
	
	            		try
	            		{
	                			wait();
	            		}
	            		catch(Exception e)
	            		{
        	        				System.out.print("exe from HH"+e);
	            		}

	         		}
        		}
     }
     synchronized void noti()
     {
        	try
        	{
           	notify();
        	}
        	catch(Exception e)
        	{
              	System.out.print("exception from notify HH"+e);
        	}
    }

}
class mm extends Thread
{
	int MM;
	hh H;
    	ss S;
    	mm(ss S,hh H)
    	{
        		this.S=S;
        		this.H=H;
        		start();
    	}
    	public void run()
    	{
        		try
        		{
	        		synchronized(this)
	        		{
	            		wait();
	        		}
        		}
        		catch(Exception e)
        		{
			System.out.print("Exception from mm"+e);	
		}
        		synchronized(this)
        		{
	        		for(;;)
	        		{
	            		MM++;
	            		try
	            		{
	                			if(MM>59)
	                			{
	                    			MM=0;
	                    			H.noti();
	                    			wait();
	                 			}
	                 			else
	                 			{
	                    			S.noti();
        	            				wait();
	                 			}
	
	            		}
	            		catch(Exception e)
	            		{
	                			System.out.print("exe from MM"+e);
	            		}
	
        			}
        		}
	 }
	synchronized void noti()
	{
		try
        		{
            		notify();
        		}
        		catch(Exception e)
        		{
              		System.out.print("exception from notify HH"+e);
        		}
	}			
}

class ss extends Thread
{
	 int SS;
	mm M;
    	hh H;
    	ss()
    	{
		H=new hh(this);		        
		M=new mm(this,H);
		System.out.print(H.HH+":"+M.MM+":"+SS);
		start();
    	}
    	public void run()
    	{
        		synchronized(this)
        		{
     	   		for(;;)
	   		{
        	    			SS++;
	    			try
	    			{

	                			if(SS>59)
	                			{
	                    			SS=0;
	                    			M.noti();
	                    			wait();
	                 			}
	                			else
	                			{
		                			sleep(1000);
	        	        				String s=" "+H.HH+":"+M.MM+":"+SS;
		                			for(int i=1;i<=s.length();i++)
		                				System.out.print("\b");

		                			System.out.print(" "+H.HH+":"+M.MM+":"+SS);
                				}
		              
            	   		}
	           		catch(Exception e)
	           		{
	
                				System.out.print("exe from MM"+e);
		   		}
	   		}
        		}
     	}
	synchronized void noti()
     	{
        		try
        		{
            		notify();
        		}
        		catch(Exception e)
        		{
              		System.out.print("exception from notify HH"+e);
        		}
     	}
    	void init_sec(hh H)
	{
		this.H=H;
	}
}

class alarm
{

	int time=5;
     public static void main(String s[])
     {
	
        	new ss();
     }
}
