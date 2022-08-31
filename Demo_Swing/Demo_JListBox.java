import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
/*<applet code="Demo_JListBox" width=700 height="500"></applet>*/
public class Demo_JListBox extends JApplet 
{	
	
	JComboBox jc;
	JList  jl;
	public void init()
	{	
		setLayout(new FlowLayout());
		
		Vector dat=new Vector();
	
									
		jc=new JComboBox(dat);
		jl=new JList(dat);
		add(jl);

		//jc.setBackground(Color.black);
		//jc.setForeground(Color.blue);
		//jc.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));

		//jc.setBounds(100,100,300,35);	
		add(jc);
		dat.add("Hello1");
		dat.add("Hay");
		dat.add("Bye");		
		
		
		//jc.setListData(dat);
		//dat.removeAllElements();
		dat.add("Hello1");
		dat.add("Hay2");
		dat.add("Bye3");		
		
	}
	
}