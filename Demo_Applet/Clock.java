//gg
import  java.awt.*;
import java.applet.*;
/*<applet code="Clock" width=500 height=500></applet>*/
public class Clock extends Applet implements Runnable
{
	Thread th;
	int rad;
	int deg;
	int x1,y1,x2,y2;
	public  void init()
	{
		setBackground(Color.gray);
		th=new Thread(this);
		deg=0;
		rad=200;
		x1=y1=y2=0;
		x2=200;
		x1=getWidth()/2;
		y1=getHeight()/2;
		x2=x1+(int)(rad*Math.cos(deg));
		y2=y1+(int)(rad*Math.sin(deg));
		repaint();
		th.start();
	}
	int count=0;
	public void run()
	{
		while(true)
		{
			deg=deg-6;
			//if(deg<-360)
			//deg=0;
			x1=getWidth()/2;
			y1=getHeight()/2;
			x2=x1+(int)(rad*Math.cos(deg));
			y2=y1+(int)(rad*Math.sin(deg));
			count++;

			showStatus(x2+","+y2+"["+count+"]");
			
			repaint();
			try
			{
				th.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println("Exception :"+e);
			}
		}
	}
	public void update(Graphics g)
	{
		paint(g);
	}
	int x=0;
	public void paint(Graphics g)
	{
		if(deg>=-6)
		{
			g.setColor(Color.pink);
			
			g.fillOval((getWidth()/2)-200,(getHeight()/2)-200,400,400);
			x++;
		}
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.drawLine(x1,y1,x2,y2);
	
	}
}
			
			
	
		
