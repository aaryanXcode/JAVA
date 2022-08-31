import java.awt.*;
import java.applet.*;
/*<applet code="demo_list.class" width=400 height=400></applet>*/
public class demo_list extends Applet
{
	List ch2;
	Choice ch1;
	public void init()
	{
		ch1=new Choice();
		ch1.add("XXX");
		ch1.add("yyy");
		ch1.add("hhh");
		ch1.add("bbb");
		ch1.add("ooo");
		ch1.add("aaa");
		
		ch2=new List(3);
		ch2.add("XXX");
		ch2.add("yyy");
		ch2.add("hhh");
		ch2.add("ooo");
		ch2.add("aaa");

		add(ch1);
		add(ch2);
	}
}
