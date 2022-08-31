import java.awt.*;
import java.applet.*;
/*<applet code=demo_button.class width=400 height=400></applet>*/
public class demo_button extends Applet
{
	Button b;
	Button k;
	Label l;
	Label A;
	public void init()
	{
		b=new Button("button1!!");
		k=new Button("button2");
		
		l=new Label("1st label",Label.LEFT);
		l.setBackground(Color.red);
		A=new Label("2nd label!!",Label.RIGHT);
		A.setBackground(Color.yellow);
		add(b);
		add(k);
		add(l);
		add(A);
	}
}

			
