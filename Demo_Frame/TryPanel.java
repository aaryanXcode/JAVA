import java.awt.*;
import java.awt.event.*;
class TryPanel extends Frame implements ActionListener
{
	Panel p1,p2;
	Button bb;
	TryPanel()
	{	
		setSize(100,100);
		setLayout(new BorderLayout());
		p1=new Panel();
		p2=new Panel();
		bb=new Button("Hello");
		p1.setLayout(new FlowLayout());
		p1.add(bb);
		add(p1,BorderLayout.CENTER);
		p2.setLayout(new FlowLayout());
		p2.add(new Button("Hay"));
		
		bb.addActionListener(this);
		show();
		
	}	
	public void actionPerformed(ActionEvent ae)		
	{
		add(p2,BorderLayout.NORTH);	
		show();
	}
	public static void main(String a[])
	{
		new TryPanel();
	}
}