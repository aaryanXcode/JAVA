import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo_Split extends JFrame implements ActionListener
{

	JSplitPane js;
	JDesktopPane jdesk;
	Demo_Split()
	{
		super();
		setSize(400,400);
		setVisible(true);
		jdesk=new JDesktopPane();

		JInternalFrame ji2=new JInternalFrame("Internal Frame TWO",true,true,true,true);
		ji2.setVisible(true);
		ji2.setSize(300,100);

		jdesk.add(ji2);
		
		JPanel jp=new JPanel();
		int h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		//////////////////
		
		//////////////////
		JScrollPane jsp=new JScrollPane(jp,v,h);

		jp.setLayout(new GridLayout(5,2));
		for(int i=0;i<10;i++)
		{
			JButton jb=new JButton("BUTTON"+i);
			jb.addActionListener(this);
			jp.add(jb);
		}
		
		
		
		js=new JSplitPane(1,jsp,jdesk);
		js.setDividerSize(10);
		js.setDividerLocation(50);
		js.setOneTouchExpandable(true);
		add(js);
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{
		JInternalFrame ji1=new JInternalFrame(ae.getActionCommand(),true,true,true,true);
		ji1.setVisible(true);
		ji1.setSize(300,100);
		jdesk.add(ji1);
				
	}
	public static void main(String a[])
	{
		new Demo_Split();
	}
}	
	