import java.applet.*;
import java.awt.*;
/*<applet code=newFont.class width=1080 height=1080>
</applet>*/
public class newFont extends Applet
{
	
	int x=100;
	int y=100;
	int h=100;
	int w=10;
	int font_height;
	int font_ascent;
	int font_descent;
	int font_maxAscent;
	int font_leading;
	int font_baseline;
	int stringWidth;
	
	String str="this ";
	public void init()
	{
		
	}
	public void paint(Graphics g)
	{	
		//Color c=new Color(0,0,255);
//or
		//g.setColor(Color.white);
		
		Font f=new Font("arial",2,22);
		
		g.setFont(f);
		
		FontMetrics font=g.getFontMetrics();
		font_height=font.getHeight();
		font_ascent=font.getAscent();
		font_descent=font.getDescent();
		font_leading=font.getLeading();
		font_maxAscent=font.getMaxAscent();
		font_baseline= font_leading+font_ascent;
		stringWidth=font.stringWidth(str);
		
		
		/*for(int i=0;i<15;i++) 
                    { 
                        g.drawString(str+String.valueOf(i),x,y+font_baseline); 
                        font_baseline+=font_height; 
                    } 
		*/
		for(int i=0;i<20;i++)
		{
	
			str=str+'\n';
			g.drawRect(x,y,h,w+font_baseline);
			g.drawString(str+String.valueOf(i),x,y+font_baseline); 
			font_baseline+=font_height; 
		}
		

	}
	
}