import javax.swing.*;
import java.awt.*;


public class Demo_ImageIcon extends JFrame
{
	Demo_ImageIcon()
	{
		super("Demo_ImageIcon");
		setVisible(true);setEnabled(true);
		setSize(500,500);setLayout(new FlowLayout());

		ImageIcon ii=new ImageIcon("login.gif");
		JButton btn=new JButton("Click",ii);
		add(btn);

		show();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

	public static void main(String args[])
	{
		new Demo_ImageIcon();
	}
	
}