import java.awt.*;
import java.applet.*;
/*<applet code="Demo_Teddy" width =300 height=200 >
</applet>*/
public class Demo_Teddy extends Applet
{	
    	public void init()
       	{
	
	}
   	public void paint(Graphics g)
	{
		g.fillRect(10,10,100,100);
        		g.drawOval(20,20,80,80);  
                       	g.drawLine(60,80,60,40); 
                        	g.drawLine(40,60,80,60);
      	}
}









