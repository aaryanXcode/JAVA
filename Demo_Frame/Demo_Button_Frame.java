import java.awt.*;


class Demo_Button_Frame extends Frame
{
	Button b,g;
	Label l;
	Demo_Button_Frame()
	{
		super("Demo Frame");
		setSize(100,200);
		setVisible(true);

		setLayout(new FlowLayout());

		b=new Button("HELLO Click Me!!");
		g=new Button("GaUr@v");

		l=new Label("Hello See ME!!",Label.CENTER);

		l.setBackground(Color.blue);
		g.setBackground(Color.red);
		g.setForeground(Color.black);
		l.setForeground(Color.yellow);

		add(b);
		add(l);
		add(g);

		show();
	}
	public static void main(String a[])
	{
		new Demo_Button_Frame();
	}
}











			
                      