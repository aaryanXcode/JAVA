import java.awt.*;
import java.awt.event.*;
class Demo_MouseEvent extends Frame implements MouseListener,MouseMotionListener,Runnable
{
	Button b1;
	Label sch;
	int x,y;

	Label ch[];
	Thread th;
	int score=0;
	Demo_MouseEvent()
	{
		super("Demo Mouse Event ");
		th=new Thread(this);
	                ch=new Label[100];
		
		sch=new Label("You Are Score : "+score);
		x=0;
		y=0;
		setVisible(true);
		setSize(400,400);
		setLayout(null);
		b1=new Button("Click Me Please");
		b1.setBounds(0,0,100,20);
		sch.setBounds(50,50,200,30);
		sch.setFont(new Font("ArialNarrow",Font.BOLD,14));
		sch.setBackground(Color.red);
		sch.setForeground(Color.yellow);
		add(b1);
		add(sch);
		show();
		b1.addMouseListener(this);
		addMouseMotionListener(this);
		show();
		th.start();
	}
	public void run()
	{	
		
		for(int i=0;i<100;i++)
		{
			
			ch[i]=new Label("$"+(int)(Math.random()*100));
			ch[i].setFont(new Font("ArialNarrow",Font.BOLD,25));
			ch[i].setBackground(new Color(0,0,255));
			ch[i].setForeground(Color.green);
			ch[i].setBounds((int)(getWidth()*Math.random()),(int)(getHeight()*Math.random()),50,30);
			add(ch[i]);
			
			show();
			try
			{
				th.sleep(500);
			}
			catch(Exception e)
			{	
				System.out.println("Exception thread :"+e);
			}
			
		}
				
	}
	
	public void mouseMoved(MouseEvent me)
	{
		show();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		b1.setLocation((int)(x),(int)(y));
		for(int i=0;i<100;i++)
		{
			try
			{
				if( (x>=ch[i].getX()&&x<=ch[i].getX()+20) && (y>=ch[i].getY()&&y<=ch[i].getY()+20))
				{
					remove(ch[i]);
					
					sch.setText("You Are Score :"+score);
					score++;
					show();
					
					break;
				}
			}
			catch(Exception e)
			{
			}
		}
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		//b1.setLabel("Mouse Entered");
		
		//show();
	}
	public void mouseExited(MouseEvent me)
	{
		//b1.setLabel("Mouse Exited");
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public static void main(String a[])
	{
		new Demo_MouseEvent();	
	}
}
		