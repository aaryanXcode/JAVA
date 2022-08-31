import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo_InputPane extends JFrame implements ActionListener
{
	JButton jb;
	JComboBox jbox;
	Demo_InputPane()
	{
		setSize(200,200);
		setVisible(true);	
		setTitle("DemoInputPane");
		jb=new JButton("CLICK");
		jbox=new JComboBox();
		setLayout(new FlowLayout());
		add(jb);	
		add(jbox);
		jb.addActionListener(this);
		show();
	}
	public void actionPerformed(ActionEvent a)
	{
		String ss=JOptionPane.showInputDialog(this,"Enter Your Name:","Input",JOptionPane.INFORMATION_MESSAGE);
		if(ss!=null)
		jbox.addItem(ss);
		
	}
	public static void main(String a[])
	{
		new Demo_InputPane();
	}
}