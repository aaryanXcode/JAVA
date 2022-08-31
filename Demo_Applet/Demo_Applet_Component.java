import java.applet.*;
import java.awt.*;
/*<applet code="Demo_Applet_Component" width=400 height=400></applet>*/

public class Demo_Applet_Component extends Applet
{
	Label f1,f2,f3;
	Button b1;
	public void init()
	{
		
		f1=new Label("hello");
		Font ar=new Font("Arial",Font.BOLD,30);
		f1.setFont(ar);
		f1.setForeground(Color.blue);

		f2=new Label("hay");
		f3=new Label("welcome");
		b1=new Button("click me!");
		b1.setFont(ar);
		b1.setForeground(Color.yellow);
		b1.setBackground(Color.red);
		
		add(b1);
		add(f1);
		add(f2);
		add(f3);
	}
}