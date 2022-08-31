
import java.awt.*;

class Demo_FlowLayout extends Frame
{
	Button b1,b2,b3;
	Demo_FlowLayout()
	{
		super("Demo FlowLayout");
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		b1=new Button("hello1");
		b2=new Button("hello2");
		b3=new Button("hello3");
		add(b1);
		add(b2);
		add(b3);
		show();
	}
	public static void main(String a[])
	{
		new Demo_FlowLayout();
	}
		
}
