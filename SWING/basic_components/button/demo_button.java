import java.awt.*;
import javax.swing.*;
public class demo_button extends JFrame 
{	
	JPanel p;
	JButton b;
	public demo_button()
	{	
		setLayout(null);
		
		ImageIcon df=new ImageIcon("PRESS.gif");
		b=new JButton(df);
		//b.setContentAreaFilled(true);
		b.setBorderPainted(false);
		//jb.setBackground(Color.yellow);

		b.setFont(new Font("ArialBlack",Font.BOLD+Font.ITALIC,10));
	
		ImageIcon roll=new ImageIcon("submit.jfif");
		b.setRolloverIcon(roll);

		ImageIcon press=new ImageIcon("PRESS.gif");
		b.setPressedIcon(press);
		b.setBounds(100,100,300,35);	
		add(b);
		show();

	}
	public static void main(String args[])
	{
		new demo_button();
	}
	
}
