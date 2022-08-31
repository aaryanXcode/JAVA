import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Demo_JScrollPane" width=700 height="500"></applet>*/
public class Demo_JScrollPane extends JApplet
{	

	JPanel p1;
	JScrollPane js;
	public void init()
	{	
		
		setLayout(new GridLayout(1,1));
		p1=new JPanel();
		p1.setLayout(new GridLayout(20,10));
		for(int i=1;i<=200;i++)
		{
			p1.add(new JButton("Button"+i));
		}
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;		
		js=new JScrollPane(p1,v,h);	
			
		add(js);
		
	}
	
}