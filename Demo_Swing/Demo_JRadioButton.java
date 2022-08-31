import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Demo_JRadioButton" width=700 height="500"></applet>*/
public class Demo_JRadioButton extends JApplet 
{	
	JRadioButton jrb1,jrb2,jrb3,jrb4;
	public void init()
	{	
		

		
		setLayout(new FlowLayout());
		
		


		jrb1=new JRadioButton("RADIO1 ");
		jrb2=new JRadioButton("RADIO2 ");
		
		jrb3=new JRadioButton("Hello");
		jrb4=new JRadioButton("hay",true);	
	
		
			
		jrb1.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
		jrb2.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));		
		jrb3.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
		jrb4.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,10));
		
 		ButtonGroup rb1=new ButtonGroup();
		ButtonGroup rb2=new ButtonGroup();

		rb1.add(jrb1);
		rb1.add(jrb2);

		rb2.add(jrb3);
		rb2.add(jrb4);
		
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);
		show();

	}
	
}