import java.applet.*;
import java.awt.*;
/*<applet code="Demo_Face" width=400 height=400></applet>*/
public class Demo_Face extends Applet implements Runnable
{
	Thread th;
	int h;
	boolean t;
   	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.pink);
		th=new Thread (this);
		h=0;
		th.start();
	}
	public void run()
	{
		while(true)
		{
			if(h==0)
				t=true;	
			else if(h==12)
				t=false;
			
			if(t==true)
				h++;
			else 
				h--;
			repaint();	
			try
			{
				th.sleep(50);
			}
			catch(Exception e)
			{
				System.out.println("Exception:"+e);
			} 
		
		}
	}
	public void paint(Graphics g)
	{
		g.fillOval(100,100,200,200);
	        
        		Color black =new Color(0,0,0);

	       	g.setColor(black);
	        	g.fillOval(150,150,15,25);
		g.fillOval(235,150,15,25);

		g.drawLine(195,200,195,220);
		g.drawLine(196,200,196,220);
	       	g.drawArc(170,248,50,20,180,200);  
		g.drawArc(170,249,50,20,180,200); 
		g.drawLine(196,220,206,220); 
		g.drawLine(196,221,206,221); 
        		g.drawLine(196,100,196,60); 
	       	g.drawLine(120,120,100,100); 

		open_eye(g,h);
	}
	void open_eye(Graphics g,int h)
	{
		Color white =new Color(255,255,255);
		g.setColor(white);
		g.fillOval(150,160,12,12-h);
		g.fillOval(235,160,12,12-h);
	}
	
}

