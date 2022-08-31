import java.awt.*;
import java.awt.event.*;
class Demo_Mouse1_Event extends Frame implements MouseListener
{
	Button b;
	int x,y;
	Demo_Mouse1_Event()
	{
		super("Draw");	
		setSize(400,400);
		setVisible(true);
		b=new Button("                         ");
		
		setLayout(new FlowLayout());
		add(b);
		
		b.addMouseListener(this);
		
		show();
	}
	public void mouseClicked(MouseEvent me)
	{
		//b.setLabel("Clicked");
		
	}
	public void mousePressed(MouseEvent me)
	{
		b.setLabel("Pressed");
	}
	public void mouseEntered(MouseEvent me)
	{
		b.setLabel("Entered");
		b.setBackground(Color.yellow);
		
	}
	public void mouseExited(MouseEvent me)
	{
		b.setLabel("Exited");
		b.setBackground(Color.gray);
	}
	public void mouseReleased(MouseEvent me)
	{
		b.setLabel("Realesed");
	}
	public static void main(String a[])
	{
		new Demo_Mouse1_Event();
	}
}