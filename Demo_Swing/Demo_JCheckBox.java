import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Demo_JCheckBox" width=700 height="500"></applet>*/
public class Demo_JCheckBox extends JApplet 
{	
	JCheckBox jc,jc1;
	public void init()
	{	
		
		
		setLayout(new FlowLayout());
		

		
		jc=new JCheckBox("SSS",true);
		jc1=new JCheckBox("SSS1");
		jc.setBackground(Color.white);
		jc.setForeground(Color.blue);
		jc.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
		
		jc1.setBackground(Color.white);
		jc1.setForeground(Color.blue);
		jc1.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
	
		
		//jc.setBounds(100,100,300,35);	
		add(jc);
		add(jc1);

	}
	
}