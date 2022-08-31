import java.awt.*;
import java.applet.*;
/*<applet code=rectangle.class  width=600 height=600>
</applet>*/
public class rectangle extends Applet
{
	String str;
	int x,y,h,w;
	public void init()
	{
		str="Rectangle";
		
		
		x=100;
		y=200;
		h=200;
		w=200;
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,200);
		g.drawRect(x,y,w,h);
		g.fillRect(x,y,w,h);
	}
	
}


