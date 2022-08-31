import java.io.*;
import java.awt.*;

public class Demo_Frame extends Frame
{	
	Label l1,l2,l3;
	
	Demo_Frame()
	{
		super("new frame");
		setSize(200,200);
		setVisible(true);
		
		l1=new Label("hello");
		
		setLayout(new FlowLayout());
		add(l1);


		show();
		

	}
	public static void main(String a[])
	{
		new Demo_Frame();
	}	
	
}
