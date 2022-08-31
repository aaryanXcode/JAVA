import java.awt.*;
import javax.swing.*;

class Demo_JButton_Frame extends JFrame
{	
	JButton jb;
	public  Demo_JButton_Frame()
	{	
		
		
		setLayout(null);
		
		setSize(200,200);
		//setting effects
		ImageIcon df=new ImageIcon("default.gif");

		//jb=new JButton("HELOO");

		jb=new JButton(df);

		//jb.setContentAreaFilled(false);
		//jb.setBorderPainted(false);
		//jb.setBackground(Color.yellow);
		//jb.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
	
		ImageIcon roll=new ImageIcon("roll.gif");
		jb.setRolloverIcon(roll);

		ImageIcon press=new ImageIcon("pressed.gif");
		jb.setPressedIcon(press);

		jb.setBounds(300,100,300,35);	
		add(jb);
		show();

	}
	
	public static void main(String a[])
	{
		new Demo_JButton_Frame();
	}
}