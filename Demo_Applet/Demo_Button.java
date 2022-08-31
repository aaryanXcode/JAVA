import java.awt.*;
import java.applet.*;
/*<applet code=Demo_Button.class width=100 height=200></applet>*/
public class Demo_Button extends Applet
{
	Button b;
	Button k;
	Label l;
	Label A;
	public void init()
	{
		b=new Button("HELLO Click Me!!");
		k=new Button("zingalala");
		
		l=new Label("Hello See ME!!",Label.LEFT);
		l.setBackground(Color.green);
		A=new Label("Hello See ME!!",Label.RIGHT);
		A.setBackground(Color.green);
		add(b);
		add(k);
		add(l);
		add(A);
	}
}

			
