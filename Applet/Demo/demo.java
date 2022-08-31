import java.applet.*;
import java.awt.*;
public class demo extends Applet 
{
	String str;
	public void init()
	{
		str="This is my 1st applet";
	}
	public void paint(Graphics g) 
	{
		g.drawString(str, 50, 25);
   	}
}