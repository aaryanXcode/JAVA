
/*<applet code="TrafficLight.class"  width=1280 height=700>
			</applet>
	*/
 
import java.awt.*;
import java.applet.*;

public class TrafficLight extends Applet implements Runnable
{
	Thread t;Color c1,c2,c3;
	int h;
	public void paint(Graphics g)
	{
		//g.setColor(Color.gray);
		//g.fillRect(70,0,170,400);
		g.setColor(Color.blue);
		g.drawRect(20,20,60,180);
		g.setColor(Color.black);
		g.fillRect(20,20,60,180);
		if(h==1)
		{	
			c3=new Color(255,0,0);
			g.setColor(c3.brighter());
			g.fillOval(20,20,60,60);
			c1=new Color(255,255,0);
			g.setColor(c1.darker());
			g.fillOval(20,80,60,60);
			c2=new Color(0,255,0);
			g.setColor(c2.darker());
			g.fillOval(20,140,60,60);
		}
		else if(h==2)
		{
			c1=new Color(255,0,0);
			g.setColor(c1.darker());
			g.fillOval(20,20,60,60);
			c3=new Color(255,255,0);
			g.setColor(c3.brighter());
			g.fillOval(20,80,60,60);
			c2=new Color(0,255,0);
			g.setColor(c2.darker());
			g.fillOval(20,140,60,60);
		}
		else if(h==3)
		{
			c1=new Color(255,0,0);
			g.setColor(c1.darker());
			g.fillOval(20,20,60,60);
			c2=new Color(255,255,0);
			g.setColor(c2.darker());
			g.fillOval(20,80,60,60);
			c3=new Color(0,255,0);
			g.setColor(c3.brighter());
			g.fillOval(20,140,60,60);
		}		
		g.setColor(Color.black);
		g.fillRect(40,200,20,80);
		g.fillRect(10,280,80,20);
	}
	public void start()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(h=3;h<12;h++)
		{
			if(h==1 || h==3)
			{
				repaint();
				try
				{
					Thread.sleep(5000);
				}				
				catch(Exception e)
				{}
			}
			if(h==2)
			{
				repaint();
				try
				{
					Thread.sleep(1000);
				}				
				catch(Exception e)
				{}
			}
			if(h==4)
			{
				h=0;
			}
		}
	}	
}