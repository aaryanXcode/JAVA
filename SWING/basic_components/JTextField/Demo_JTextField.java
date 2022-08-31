import java.awt.*;
import javax.swing.*;
public class Demo_JTextField extends JFrame
{
	JTextField tx1;
	JTextArea ta;
	Demo_JTextField()
	{
		setSize(200,200);
		setLayout(new FlowLayout());
		tx1=new JTextField(100);
		tx1.setBackground(Color.yellow);
		tx1.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,20));
		ta=new JTextArea(20,50);
		add(tx1);
		add(ta);
		show();
	}
	public static void main(String args[])
	{
		new Demo_JTextField();
	}
}
		
	