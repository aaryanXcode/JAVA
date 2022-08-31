import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Demo_JTabbedPane" width=700 height="500"></applet>*/
public class Demo_JTabbedPane extends JApplet 
{	
	JButton jb1,jb2,jb3,jb4;
	Panel p1,p2;
	JTabbedPane jb;
	public void init()
	{	
		
		getContentPane();
		setLayout(new FlowLayout());
		jb=new JTabbedPane(JTabbedPane.BOTTOM,JTabbedPane.SCROLL_TAB_LAYOUT);		
		
		p1=new Panel();
		p2=new Panel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		
		jb1=new JButton("HELLO");
		jb2=new JButton("HAY");
		p1.add(jb1);
		p1.add(jb2);

		jb3=new JButton("WELCOME");
		jb4=new JButton("GET LOST");		

		p2.add(jb3);
		p2.add(jb4);

		jb1.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
		jb2.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));		
		jb3.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
		jb4.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
				
		jb.addTab("TAB1",p1);
		jb.addTab("TAB2",p2);
		/*for(char i=65;i<=90;i++)
		{
			jb.addTab(" "+i,p1);
		}*/

		//int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;		
		//int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;		
		//JScrollPane js=new JScrollPane(jb,v,h);	
			
		add(jb);
		show();
		
	}
	
}