import java.applet.*;
import java.awt.*;
/*<applet code=circleInSquare.class width=600 height=600>
</applet>*/
public class circleInSquare extends Applet
{
	
	int x=300;
	int y=300;
	int h=400;
	int w=400;
	int ch=(x)/5;
	

	public void init()
	{
		
	}
	public void paint(Graphics g)
	{	
		//g.setXORMode(new Color(255,0,0));
		g.drawRect(x,y,h,w);
		//g.setColor(new Color(0,255,255));
		int a=ch/2;
		int b=ch/2;
		g.drawRect(x+a,y+b,h-ch,w-ch);
		g.drawOval(x+a,y+b,h-ch,w-ch);
		//g.setColor(new Color(255,0,255));
		g.drawOval(x,y,h,w);
		


		/*g.drawRect(125,125,75,75);
		g.drawOval(125,125,75,75);
		g.drawRect(100,100,100,100);
		g.drawOval(100,100,100,100);
		*/
		

		//g.drawRect(x+45,y+45,h-115,w-115);
		//g.drawOval(x+45,y+45,h-115,w-115);
		//g.drawRect(x,y,h,w);
		//g.drawOval(x,y,h,w);
	/*
		//four squares
		
		g.drawRect(x,y,h,w);
		g.drawRect(x,y,h/2,w/2);
		g.drawOval(x,y,h/2,w/2);
		
		
		g.drawRect(x+(h/2),y,h/2,w/2);
		g.drawOval(x+(h/2),y,h/2,w/2);

		g.drawRect(x,y+(h/2),h/2,w/2);
		g.drawOval(x,y+(h/2),h/2,w/2);

		g.drawRect(x+(h/2),y+(h/2),h/2,w/2);
		g.drawOval(x+(h/2),y+(h/2),h/2,w/2);
	*/
		//g.drawRoundRect(500,100,200,200,30,30);
		//g.draw3DRect(800,100,200,200,true);

	}
	
}