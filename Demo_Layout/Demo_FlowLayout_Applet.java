
import java.awt.*;
import java.applet.*;
/*<applet code=Demo_FlowLayout_Applet.class width=200 height=300></applet>*/
public class Demo_FlowLayout_Applet extends Applet
{
	Button b1,b2,b3;
	public void init()
	{
		//setLayout(new FlowLayout());
		b1=new Button("hello1");
		b2=new Button("hello2");
		b3=new Button("hello3");
		add(b1);
		add(b2);
		add(b3);
		show();
	}
	
		
}
