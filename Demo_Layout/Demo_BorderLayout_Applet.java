
import java.awt.*;
import java.applet.*;
/*<applet code=Demo_BorderLayout_Applet.class width=200 height=300></applet>*/
public class Demo_BorderLayout_Applet extends Applet
{
	Button e,w,n,s,c;
	public void init()
	{
		setLayout(new BorderLayout());

		e=new Button("EAST");
		w=new Button("WEST");
		n=new Button("NORTH");
		s=new Button("SOUTH");
		c=new Button("CENTER");

		add(c,BorderLayout.CENTER);
		add(s,BorderLayout.NORTH);
		add(n,BorderLayout.EAST);
		add(w,BorderLayout.WEST);
		add(e,BorderLayout.SOUTH);
	
	}

		
}
