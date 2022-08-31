import java.applet.*;
import java.awt.*;
/*<applet code=demo_applet.class width=600 height=200></applet>*/
public class demo_applet extends Applet
{
	String s;
	int i;
	public void init()
	{
		i=0;
		s="HELLO THIS IS APPLET DEMO MADE BY students";
		setBackground(new Color(0,255,100));
		setForeground(Color.red);
		
	}
	public void paint(Graphics f)
	{
		i++;
		f.drawString(s+"="+i,200,100);	
		f.drawString(s,50,356);	
		
	}
}
