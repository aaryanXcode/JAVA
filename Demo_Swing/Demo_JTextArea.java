import java.awt.*;
import javax.swing.*;
//import javax.swing.plaf.metal.*;
import java.awt.event.*;

public class Demo_JTextArea extends JFrame implements ActionListener
{	
	JTextArea ta;
	JScrollPane js;
	Demo_JTextArea()
	{	
		setSize(300,300);
		setVisible(true);
		ta=new JTextArea();
		ta.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,20));
		ta.setMargin(new Insets(50,50,50,50));
		ta.setLineWrap(true);
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;		
		js=new JScrollPane(ta,v,h);	
		/*JWindow win=new JWindow(this);
		win.setBounds(100,100,200,200);
		win.show();*/
		
		add(js);	
		show();
	}
	public void actionPerformed(ActionEvent a)
	{
	
	}
	public static void main(String a[])
	{
		new Demo_JTextArea();
	}
}