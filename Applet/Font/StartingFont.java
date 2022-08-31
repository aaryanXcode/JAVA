import java.applet.*;
import java.awt.*;
/*<applet code=StartingFont.class width=1080 height=1080>
</applet>*/
public class StartingFont extends Applet
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
	int widthOfFirstChar;
	
	//splitting string and seprating first char
	String str = "paragraph is a series of sentences ";
	char first = str.charAt(0);
	String firstChar=Character.toString(first);
	String[] arrOfStr = str.split(" ");

	

	

	public void init()
	{
		
	}
	public void paint(Graphics g)
	{	
		
		int stringWidth=0;
		String s="";
		
		FontMetrics font=g.getFontMetrics();
		Font f=new Font("arial",2,48);
		
		
		int firstCharHeight=font.getHeight();
		g.setFont(f);

		g.drawString(firstChar,x,y+30);
		widthOfFirstChar=font.stringWidth(firstChar);

		Font f2=new Font("arial",2,22);
		g.setFont(f2);
		
		for(int i=0;i<arrOfStr.length;i++)
		{
			
			
			s=s+arrOfStr[i]+" ";
			g.drawString(s,font_leading+x,y+30);
			stringWidth=font.stringWidth(s);
			if(stringWidth>(h-rectY))
			{
				y=y+font_height;
				s="";
				
			}
			w=y;
                     	
		}
		//g.drawRect(x,rectY,h,w);
                    
		

	}
	
}