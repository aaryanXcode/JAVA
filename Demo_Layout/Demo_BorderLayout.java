
import java.awt.*;

class Demo_BorderLayout extends Frame
{
	Button e,w,n,s,c;
	Demo_BorderLayout()
	{
		//super("Demo BorderLayout");
		setSize(300,300);
		setVisible(false);
		setLayout(new BorderLayout());
		e=new Button("EAST");
		w=new Button("WEST");
		n=new Button("NORTH");
		s=new Button("SOUTH");
		c=new Button("CENTER");
		add(c,BorderLayout.CENTER);
		add(s,BorderLayout.SOUTH);
		add(n,BorderLayout.NORTH);
		add(w,BorderLayout.WEST);
		add(e,BorderLayout.EAST);
		show();
	}
	public static void main(String a[])
	{
		new Demo_BorderLayout();
	}
		
}
