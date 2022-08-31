import java.awt.*;
class Demo_Frame extends Frame
{	
	Label l1,l2,l3;
	Button b1;
	Demo_Frame()
	{
		super("new frame");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new Label("hello");
		l2=new Label("hay");
		l3=new Label("how r u");
		b1=new Button("Click ME");
		//l1.setBackground(Color.red);
		//l2.setBackground(Color.red);
		//l3.setBackground(Color.red);
		add(l1);
		add(l2);
		add(b1);
		add(l3);
		new Demo_Frame1();
			show();

	}
	public static void main(String a[])
	{
		new Demo_Frame();
	}	
	
}
class Demo_Frame1 extends Frame
{	
	Label l1,l2,l3;
	Demo_Frame1()
	{
		super("new frame");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new Label("hello");
		l2=new Label("hay");
		l3=new Label("how r u");
		l1.setBackground(Color.red);
		l2.setBackground(Color.red);
		l3.setBackground(Color.red);
		add(l1);
		add(l2);
		add(l3);
	
			show();

	}
	public void paint(Graphics g)
	{
		g.drawLine(100,100,200,200);
	
	}

}