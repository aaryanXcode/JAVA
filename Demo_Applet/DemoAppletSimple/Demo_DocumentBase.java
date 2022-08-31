import java.awt.*;
import java.applet.*;
import java.net.*;

/*<applet code="Demo_DocumentBase" width=400 height=600></applet>*/


public class Demo_DocumentBase extends Applet 
{

	Image img;
	public void init()
	{
		URL gdb=getDocumentBase();
	
		String gcb=""+getCodeBase();
		img=getImage(gdb,"img.jpg");



		//System.out.println(gdb + "\n" + gcb);
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,50,50,this);
	}
}
			