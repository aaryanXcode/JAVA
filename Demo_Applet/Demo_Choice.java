import java.awt.*;
import java.applet.*;
/*<applet code=Demo_Choice width=100 height=300></applet>*/
public class Demo_Choice extends Applet
{
	Choice ch;
	public void init()
	{
		ch=new Choice();
		ch.addItem("XXX");
		ch.addItem("yyy");
		ch.addItem("zzz");
		add(ch);
	}
}
