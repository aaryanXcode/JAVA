import java.awt.*;
import java.util.*;
public class balloon_class extends Thread
{
	int X[][],Y[][],x,y,h,w,tw,th;
	Thread t;
	Graphics g;
	public balloon_class(int X[][],int Y[][],Graphics g)
	{	
		this.X=X;
		this.Y=Y;
		this.g=g;
		start();
		
	}
	public void run()
	{
		for(int a=0;a<3;a++)
    		{
        			for(int b=0;b<8;b++)
        			{
            			//int min =(int)( 1*Math.random();
     				//int max = 2;
				
      				//int f = (int)Math.floor(Math.random()*(max-min+1)+min);
				this.x=(int)(X[a][b]+(10*Math.random()));
				this.y=(int)(Y[a][b]+(20*Math.random()));
				this.h=100;
				this.w=150;
				this.tw=50;
				this.th=20;
				drawBalloon();
       			}
    		}
		
	}
	public void drawBalloon()
	{
		
		double c=Math.random();
		g.setColor(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));
		g.fillOval(x,y,h,w);
	          g.drawArc((x)+(tw/2)+th,y+w,th,tw,90,180);  
		g.drawArc((x)+(tw/2)+th,y+w+tw,th,tw,90,-180); 

		
	}
	
}