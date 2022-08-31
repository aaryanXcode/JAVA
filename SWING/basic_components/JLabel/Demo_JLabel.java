import javax.swing.*;
import java.awt.*;
public class Demo_JLabel extends JFrame
{
	JLabel label;
	public Demo_JLabel()
	{
		setSize(400,400);
		setLayout(new FlowLayout());
		label=new JLabel("this is a Label");
		add(label);
		show();
	}
	public static void main(String args[])
	{
		new Demo_JLabel();
	}
}