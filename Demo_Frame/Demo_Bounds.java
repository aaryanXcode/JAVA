
import java.awt.*;

class Demo_Bounds extends Frame
{
	Button b[]=new Button[10];
	Demo_Bounds()
	{
		super("Demo Bounds");
		setSize(300,300);
		setVisible(true);
		setLayout(null);
		int h=20;

		for(int i=0;i<10;i++)
		{
			b[i]=new Button("Button "+i);
			b[i].setBounds(50,10+h,100,20);
			h+=30;
			b[i].setFont(new Font("Arial Narrow",Font.BOLD+Font.ITALIC,15));
			b[i].setForeground(Color.green);
			b[i].setBackground(Color.black);
			add(b[i]);
		}
		Button bt=new Button("DD");

		Rectangle r=b[0].getBounds();
		bt.setBounds((int)(r.getX()+r.getWidth()),(int)r.getY(),(int)r.getWidth(),(int)r.getHeight());
		add(bt);
		show();
	}
	public static void main(String a[])
	{
		new Demo_Bounds();
	}
		
}
