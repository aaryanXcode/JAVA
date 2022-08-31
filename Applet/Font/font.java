import java.applet.*;
import java.awt.*;
/*<applet code=font.class width=1080 height=1080>
</applet>*/
public class font extends Applet
{
	
	int x=100;
	int rectY=100;
	int y=100;
	int h=300;
	int w=200;
	int font_height;
	int font_ascent;
	int font_descent;
	int font_maxAscent;
	int font_leading;
	int font_baseline;
	int stringWidth;
	
	
	String str = "A paragraph is a series of sentences that are organized and coherent ";
	String[] arrOfStr = str.split(" ");
	String newStr="";

	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.white);
	}
	public void paint(Graphics g)
	{	
		//Color c=new Color(0,0,255);
//or
		g.setColor(Color.white);
		
		Font f=new Font("arial",2,22);
		
		g.setFont(f);
		
		FontMetrics font=g.getFontMetrics();
		font_height=font.getHeight();
		font_ascent=font.getAscent();
		font_descent=font.getDescent();
		font_leading=font.getLeading();
		font_maxAscent=font.getMaxAscent();
		font_baseline= font_leading+font_ascent;

		//w=w+font_height;
		stringWidth=font.stringWidth(str);
		
		int stringWidth=0;
		String s="";
		
		for(int i=0;i<arrOfStr.length;i++)
		{
			
			
			s=s+arrOfStr[i]+" ";
			g.drawString(s,x,y+30);
			stringWidth=font.stringWidth(s);
			if(stringWidth>(h-rectY))
			{
				y=y+font_height;
				s="";
				
			}
			w=y;
                     	
		}
		g.drawRect(x,rectY,h,w);
                    
		

	}
	
}