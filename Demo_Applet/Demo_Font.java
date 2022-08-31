import java.awt.*;
import java.applet.*;
/*<applet code="Demo_Font" width=400 height=600></applet>*/
public class Demo_Font extends Applet implements Runnable
{
	GraphicsEnvironment ge;
	long  font_height;
	int y;
	int index,no_of_fonts;
	Font f[];
	Thread t;
	public void init()
	{
		setBackground(new Color(150,150,105));
		t=new Thread(this);
		y=10;
		try
		{
			ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		}
		catch(Exception e)
		{
			System.out.println("exception graphics : "+e);
		}
		f=ge.getAllFonts();
		index=0;
		no_of_fonts=f.length;
		t.start();
	}
	public void run()
	{
		while(index<no_of_fonts-1)
		{
			y+=font_height;
			index++;
			repaint();
			try
			{
				t.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("exception thread: "+e);
			}
		}
	}
	public void update(Graphics g)
	{	
		try
		{
			String name=f[index].getFontName();
			Font ff=new Font(name);
			g.setFont(name,Font.BOLD,20);
			g.drawString(f[index].getFontName()+"  "+index,100,y);
			FontMetrics fm=g.getFontMetrics();
			font_height=fm.getHeight();

		}
		catch(Exception e)
		{
			System.out.println("exception font: "+e);
		}
	
	}
	
}
			