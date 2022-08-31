import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo_JTabbed_gaurav extends JFrame
{	
	JButton jb1,jb2,jb3,jb4;
	JPanel p1,p2;
	JTabbedPane jb;
	Demo_JTabbed_gaurav()
	{	
		setVisible(true);
		setSize(400,600);
		jb=new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);		
		
		p1=new JPanel();
		p2=new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		
		jb1=new JButton("HELLO");
		jb2=new JButton("HAY");
		p1.add(jb1);
		p1.add(jb2);

	//	jb3=new JButton("WELCOME");
	//	jb4=new JButton("GET LOST");		

//		p2.add(jb3);
//		p2.add(jb4);

		jb1.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
		jb2.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));		
//		jb3.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
//		jb4.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
				
		jb.addTab("TAB1",p1);
//		jb.addTab("TAB2",p2);
		
		
		
		for(char i='A';i<='Z';i++)
		{
			jb.addTab(""+i,new JPanel());
		}
	//	jb.setToolTipTextAt(2,"MERI MARJI");
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;		
		JScrollPane js=new JScrollPane(jb,v,h);	
			
		p2.add(js);
		jb.addTab("TAB2",p2);
		 		
		show();
		
	}
	public static void main(String a[])
	{
		new Demo_JTabbed_gaurav();
	}
	
}