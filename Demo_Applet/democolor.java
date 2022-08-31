import java.awt.*;
import java.applet.*;
/*<applet code=democolor.class  width=600 height=600>

</applet>*/
public class democolor extends Applet
{
        String s;
        public void init()
        {
                    s="REPAINT, it is a function which call paint ";
	//repaint();
        }
        public void paint(Graphics g)
        {
                int xpoints[]={100,100,200,400,500,500,400,200,100};
                int ypoints[]={200,400,500,500,400,200,100,100,200};
                int num=9;
                Color c=new Color(40,116,40);
	
                g.setColor(c);

                   //Font f= new Font("Times",Font.ITALIC,20);
                    //g.setFont(f);
                    g.drawString(s,100,100);
                    g.drawLine(150,30,300,30);
	g.setXORMode(Color.white);
               	g.fillOval(80,220,60,60);
	
	g.setColor(Color.blue);
	g.fillRect(46,220,80,80);
	Color r=new Color(100,113,234);
	g.setColor(r);	
                    g.drawRoundRect(200,150,50,20,20,20);
                    g.fillPolygon(xpoints,ypoints,num);
                    g.drawArc(300,200,100,100,100,77);
        }

}
 
