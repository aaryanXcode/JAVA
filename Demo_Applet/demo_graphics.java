import java.applet.*;
import java.awt.*;

/*<applet code="demo_graphics"  width=500 height=400>
	<param name="txt2" value="Arman">
	<param name="txt1" value="Nikhil">
	<param name="txt0" value="Vimal">
	
	<param name="p1" value="3">
</APPLET>
*/
public class demo_graphics extends Applet implements Runnable
{
	Thread t;
	String s1[ ];
	String s2;
	String s3;
	int x,y,f;
	int data;
	int l_count;
	public void init()
	{
		t=new Thread(this);
		setBackground(Color.black);
		data=Integer.parseInt(getParameter("p1"));
		s1=new String[data];
		for(int i=0;i<data;i++)
		s1[i]=new String(getParameter("txt"+i));
		l_count=0;
		t.start();
		f=1;
		x=250;
		y=50;
	}
	
	public void run()
	{
		for(;;)
		{
			
			x-=2;
			f+=1;
			y+=2;

			if(f>100)
			{
				reset();
			
			}
			repaint();
			try
			{
				t.sleep(70);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void reset()
	{
		f=1;
		x=250;
		y=50;
		l_count++;
		if(l_count-1>data)
		l_count=0;
	}
	public void update(Graphics g)
	{	
		paint(g);
	}	

	public void paint(Graphics g)
	{
		if(f==1)
		{
			g.setColor(Color.black);
			g.fillRect(0,0,600,500);
		}
		try
		{
			g.setFont(new Font("arial narrow",Font.BOLD,5+f));
			g.setColor(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));
			g.drawString(s1[l_count],x,y);
		}
		catch(Exception e)
		{
			l_count=0;
		}


	}
}