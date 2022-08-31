import java.awt.*;


class Demo_List extends Frame
{
	List ch2;
	Choice ch1;
	public Demo_List()
	{
		super("Demo List");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());   
 
		ch1=new Choice();
		ch1.add("XXX");
		ch1.add("yyy");
		ch1.add("hhh");
		ch1.add("bbb");
		ch1.add("ooo");
		ch1.add("aaa");
		
		ch2=new List(3,true);
		ch2.add("XXX");
		ch2.add("yyy");
		ch2.add("hhh");
		ch2.add("ooo");
		ch2.add("aaa");

		add(ch1);
		add(ch2);
		show();
	}
	public static void main(String a[])
	{
		new Demo_List();
	}
}
