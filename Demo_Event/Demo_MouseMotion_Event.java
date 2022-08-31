import java.awt.*;
import java.awt.event.*;
class Demo_MouseMotion_Event extends Frame implements MouseMotionListener
{
	Label l;
	Label l1;
	Label ll;
	int x,y;
	Demo_MouseMotion_Event()
	{
		super("Draw");	
		setSize(400,400);
		setVisible(true);
		l=new Label("You r :                                                 ");
		l1=new Label("[  0 , 0  ]                                               ");
		ll=new Label("                                       ");
		setLayout(new FlowLayout());
		add(l);
		add(l1);
		add(ll);
		addMouseMotionListener(this);
		y=x=0;
		show();
	}
	public void mouseMoved(MouseEvent me)
	{
		l.setText("You r Moving Mouse");
		x=me.getX();
		y=me.getY();
		l1.setText("["+x+","+y+"]");
		repaint();
		
	}
	String msg="by pressing ";
	public void mouseDragged(MouseEvent me)
	{
		
		l.setText("You r Draging Mouse");
		x=me.getX();
		y=me.getY();
		msg=""+me.getButton();
		if(me.getButton()==0)
			msg+="Left Button"+me.getButton();
		else if(me.getButton()==1)
			msg+="Right Button"+me.getButton();
		else if(me.getButton()==2)
			msg+="Center Button"+me.getButton();
			
			
		l1.setText("["+x+","+y+"]");
		ll.setText(msg);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(l.getText(),x,y);
	}
	public  static void main(String a[])
	{
		new Demo_MouseMotion_Event();
	}
}