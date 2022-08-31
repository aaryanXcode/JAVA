import java.awt.*;
import java.awt.event.*;
class demo_event extends Frame
{
	Button b;
	demo_event()
	{
		super();
		setSize(300,300);
		setVisible(true);
		b=new MyButton();
		add(b);
		this.enableEvents(AWTEvent.KEY_EVENT_MASK);
		show();
	}
	public void processKeyEvent(KeyEvent ke)
	{
		
		super.processKeyEvent(ke);
		b.setLabel(" "+ke.getKeyCode()+" "+ke.getKeyChar());
	}
	public static void main(String a[])
	{
		new demo_event();
	}
}
class MyButton extends Button
{
	public MyButton()
	{
		super("Add");
	//	enableEvents(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
	}
	public void processKeyEvent(KeyEvent ke)
	{
		
		super.processKeyEvent(ke);
		setLabel(" "+ke.getKeyCode()+" "+ke.getKeyChar());
	}
	
} 