import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo_JSplitPane extends JFrame
{
	JSplitPane js;
	JButton b1,b2;
	JDesktopPane jdesk;
	Demo_JSplitPane()
	{
		super();
		setSize(400,400);
		setVisible(true);
		jdesk=new JDesktopPane();
		
		b2=new JButton("right Button");
		b1=new JButton("left Button");
		
		JPanel jp1=new JPanel();
		jp1.add(b1);
		int h1=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v1=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp1=new JScrollPane(jp1,v1,h1);
		
		JPanel jp2=new JPanel();
		jp2.add(b2);
		int h2=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v2=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp2=new JScrollPane(jp2,v2,h2);
		
		js=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jsp1,jsp2);
		js.setDividerSize(10);
		js.setDividerLocation(50);
		js.setOneTouchExpandable(true);
		add(js);
		show();
	}
	public static void main(String args[])
	{
		new Demo_JSplitPane();
	}
}
		