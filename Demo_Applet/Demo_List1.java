import java.awt.*;
import java.applet.*;
/*<applet code=Demo_List1 width=100 height=300></applet>*/
public class Demo_List1 extends Applet
{
	List ch2;
	Choice ch1;
	public void init()
	{
		ch1=new Choice();
		ch1.add("XXX");
		ch1.add("YYY");
		ch2=new List(3,true);
		ch2.add("hhh");
		ch2.add("bbb");
		ch2.add("ooo");
		ch2.add("aaa");

		add(ch1);
		add(ch2);
	}
}