import java.awt.*;
import javax.swing.*;
/*<applet code="Demo_JButton.class" width=700 height=500></applet>*/
public class Demo_JButton extends JApplet 
{	
	JButton jb;
	public void init()
	{	
		setLayout(null);
		//Setting effects;	
		ImageIcon df=new ImageIcon("default.gif");
		jb=new JButton(df);
		jb=new JButton(df);
		jb.setContentAreaFilled(true);
		jb.setBorderPainted(false);
		//jb.setBackground(Color.yellow);

		jb.setFont(new Font("ArialBlack",Font.BOLD+Font.ITALIC,10));
	
		ImageIcon roll=new ImageIcon("roll.gif");
		jb.setRolloverIcon(roll);

		ImageIcon press=new ImageIcon("pressed.gif");
		jb.setPressedIcon(press);
		jb.setBounds(100,100,300,35);	
		add(jb);

	}
}
