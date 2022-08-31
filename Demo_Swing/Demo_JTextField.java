import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<applet code="Demo_JTextField" width=700 height="500"></applet>*/
public class Demo_JTextField extends JApplet implements ActionListener
{	
	JTextField tx;
	JButton but,cut,copy,paste;
	JTextArea ta;
	public void init()
	{	
		but=new JButton("Replace");
		cut=new JButton("Cut");
		paste=new JButton("Paste");
		copy=new JButton("Copy");

		tx=new JTextField(50);
		setLayout(new FlowLayout());
		tx.setBackground(Color.yellow);
		tx.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,20));
		ta=new JTextArea(20,50);
		
		add(tx);
		add(but);
		add(ta);
		add(cut);		
		add(paste);
		add(copy);
		but.addActionListener(this);
		cut.addActionListener(this);
		paste.addActionListener(this);
		copy.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==cut)
		{
			ta.cut();
		}
		else if(a.getSource()==paste)
		{
			ta.paste();
		}
		else if(a.getSource()==copy)
		{
			ta.copy();
		}
		else if(a.getSource()==but)
		{
			ta.replaceSelection("HELOO");
		}
	}
}