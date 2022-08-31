import java.awt.*;
import java.awt.event.*;
class Demo_Panel extends Frame
{
	Panel north,east,center,west;
	Button bn1,bn2;
	Button be1,be2,be3;
	Button bw1,bw2,bw3;
	Button bc1,bc2,bc3,bc4;
	Button bs;
	Demo_Panel()
	{
		super("Demo Panel");
		setVisible(true);
		setSize(400,400);
		setLayout(new BorderLayout());
		
		north=new Panel();
		north.setLayout(new GridLayout(1,2));
		bn1=new Button("A");
		bn2=new Button("B");
		north.add(bn1);
		north.add(bn2);
		add(north,BorderLayout.NORTH);
		
				
		east=new Panel();
		east.setLayout(new GridLayout(3,1));
		be1=new Button("1");
		be2=new Button("2");
		be3=new Button("3");
		east.add(be1);
		east.add(be2);
		east.add(be3);
		add(east,BorderLayout.EAST);

		west=new Panel();
		west.setLayout(new GridLayout(3,1));
		bw1=new Button("X");
		bw2=new Button("Y");
		bw3=new Button("Z");
		west.add(bw1);
		west.add(bw2);
		west.add(bw3);
		add(west,BorderLayout.WEST);
			
		center=new Panel();
		center.setLayout(new GridLayout(2,2));
		bc1=new Button("a");
		bc2=new Button("b");
		bc3=new Button("c");
		bc4=new Button("d");
		center.add(bc1);
		center.add(bc2);
		center.add(bc3);
		center.add(bc4);
		add(center,BorderLayout.CENTER);
		
		bs=new Button("M");
		add(bs,BorderLayout.SOUTH);
	
		show();
		
	}
	public static void main(String a[])
	{
		new Demo_Panel();
	}
}	
		

