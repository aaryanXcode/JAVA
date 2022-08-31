
import java.awt.*;
import java.applet.*;
/*<applet code=Demo_GridLayout1_Applet.class width=200 height=300></applet>*/
public class Demo_GridLayout1_Applet extends Applet
{
	Button b1[]=new Button[30];
	public void init()
	{
		setLayout(new GridLayout(5,5));

		for(int i=0;i<25;i++)
		{
			b1[i]=new Button("Button "+i);
			add(b1[i]);
		}

	}

		
}
