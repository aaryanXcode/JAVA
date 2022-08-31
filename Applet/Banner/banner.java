import java.applet.*;
import java.awt.*;
/*<applet code=banner.class width=1080 height=1080>

	<param name="txt" value="java is a object oriented . is a object oriented .">
	<param name="font_name" value="Calibari">
	<param name="font_style" value="PLAIN">
	<param name="font_size" value="40">
	
</applet>*/
public class banner extends Applet implements Runnable
{
	int x,y,h,w,strX,strY,stringWidth;
	String str,f_name,f_style;
	int f_size;
	Thread tt;
	
	
	public void init()
	{
		
		strX=200;
		strY=200;
		x=200;
		y=200;
		h=600;
		w=400;
		tt=new Thread (this);
		tt.start();
		f_name=getParameter("font_name");
		f_style=getParameter("font_style");
		f_size=Integer.parseInt(getParameter("font_size"));
	
		str=getParameter("txt");
		setBackground(Color.black);
		setForeground(Color.yellow);
	}
	public void run()
	{
		char ch;
      		while(true) 
		{
      			try
			 {
         				repaint();
         				Thread.sleep(200);
         				ch = str.charAt(0);
         				str = str.substring(1, str.length());
         				str = str + ch;
      			}
      			catch(InterruptedException e)
			{
			}
			
      		}
		
        	}
	
	public void paint(Graphics g)
	{
		Font f=new Font(f_name,1,f_size);
		FontMetrics font=g.getFontMetrics();
		stringWidth=font.stringWidth(str);
		g.setFont(f);
		g.drawRect(x,y,h,w);
		g.drawRect(x,y+w/4,h,w/2);
		g.drawString(str,strX,strY+50+w/4);
		
	}
}