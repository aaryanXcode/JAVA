
import java.awt.*;

class Demo_GridLayout1 extends Frame
{
	Button b1[]=new Button[21];
	Demo_GridLayout1()
	{
		super("Demo GridLayout");
		setSize(300,300);
		setVisible(true);
		setLayout(new GridLayout(6,4));
		int i=0;
		for(i=0;i<=20;i++)
		{
			b1[i]=new Button("Button "+i);
			add(b1[i]);
		}
		
		
		show();
	}
	public static void main(String a[])
	{
		new Demo_GridLayout1();
	}
		
}
