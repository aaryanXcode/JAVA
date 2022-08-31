
import java.applet.*;
import java.awt.*;
/*<applet code=balloon.class width=1080 height=1080>
	
</applet>*/


public class balloon extends Applet implements Runnable
{
	balloon_class b;
	Thread t;
	int [][]X=new int[3][9];
	int [][]Y=new int[3][9];
		
	public void init()
	{
		//setBackground(Color.blue);
		//setForeground(Color.yellow);
		int x=100;
		int y=100;
    		for(int m=0,a=0;m<3;m++,a++)
    		{
        			for(int i=0,b=0;i<8;x+=200,i++,b++)
        			{
            			X[a][b]=x;
				Y[a][b]=y;
       			}
        			x=100;
        			y=y+300;
    		}
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		
      		while(true) 
		{
      			try
			 {
         				repaint();
         				Thread.sleep(200);
      			}
      			catch(InterruptedException e)
			{
			}
			
      		}
		
        	}
	
	public void paint(Graphics g)
	{
		
		try
		{
			new balloon_class(X,Y,g).join();
			new balloon_class(X,Y,g).join();
		}
		catch(Exception e)
		{
			System.out.println("ERRR:"+e);
		}
		
    		
		
		
	}
	
}
