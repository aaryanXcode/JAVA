import java.awt.*;
import java.awt.event.*;
class Demo_Mouse_Event extends Frame implements ActionListener
{
	Menu col;
	MenuBar mb;
	MenuItem red,green,blue;
	int x,y;
	Color color;
	Draw dr;
	Demo_Mouse_Event()
	{
		
		super("Demo Mouse Event");	
		
		setSize(400,400);
		setVisible(true);
		color=new Color(125,125,125);

		col=new Menu("COLOR");
		red=new MenuItem("RED");
		green=new MenuItem("GREEN");
		blue=new MenuItem("BLUE");
		
		mb=new MenuBar();
	
		col.add(red);
		col.add(green);
		col.add(blue);
		mb.add(col);
		setMenuBar(mb);
		
	
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		dr=new Draw();	
		
		show();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()==red.getLabel())
		{
			color=new Color(255,0,0);	
			dr.setForeground(color);
			
		}
		else if(ae.getActionCommand()==green.getLabel())
		{
			color=new Color(0,255,0);
			dr.setForeground(color);
			
		}
		else if(ae.getActionCommand()==blue.getLabel())
		{
			color=new Color(0,0,255);
			dr.setForeground(color);
			
		}
	}
	
	public static void main(String g[])
	{
		new Demo_Mouse_Event();
	}

}
class Draw extends Frame implements MouseMotionListener
{
	
	int x,y;
	
	Draw()
	{
		super("Draw");	
		setSize(400,400);
		setVisible(true);
		
		addMouseMotionListener(this);
		show();
	}
	public void update(Graphics g)
	{
		paint(g);
		
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{}
	public void paint(Graphics g)
	{
		//setForeground(color);
		g.setFont(new Font("ArialNarrow",Font.BOLD,30));
		g.drawString(".",x,y);
		
	}
	
}	
	