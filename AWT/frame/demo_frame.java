import java.awt.*;
import java.awt.event.*;
class demo_frame extends Frame
{
	Panel north,east,south,west,center,middle,southMid,southMid2;
	Button bn1,bn2,bn3,bn4;
	Button centerButton1,centerButton2,centerButton3,mb1,mb2,mb3,mb4;
	Button sb1,sb2,sb3, smb1,smb2,smb3,sm2b1,sm2b2,sm2b3;
	Label l1,l2,l3,l4;
	
	
	demo_frame()
	{
		super("Demo Panel");
		setVisible(true);
		setSize(400,400);
		setLayout(new BorderLayout());

		setLayout(new GridLayout(3,1));
		north=new Panel();
		north.setLayout(new GridLayout(1,4));
		bn1=new Button("A");
		bn2=new Button("B");
		bn3=new Button("C");
		bn4=new Button("D");
		north.add(bn1);
		north.add(bn2);
		north.add(bn3);
		north.add(bn4);
		add(north,BorderLayout.NORTH);

		center=new Panel();
		center.setLayout(new GridLayout(1,3));
		centerButton1=new Button("X");
		//new middle panel and added 4 buttons
		middle=new Panel();
		middle.setLayout(new GridLayout(2,2));
		mb1=new Button("1");
		tx=new TextField(50);mb2=new Button("2");
		mb3=new Button("3");
		mb4=new Button("4");

		centerButton3=new Button("Y");
		center.add(centerButton1);
		middle.add(mb1);
		middle.add(mb2);
		middle.add(mb3);
		middle.add(mb4);
		//add middle panel object to center panel object then add center object to center layout
		center.add(middle);
		
		center.add(centerButton3);
		add(center,BorderLayout.CENTER);
		

		south=new Panel();
		south.setLayout(new GridLayout(1,4));
		sb1=new Button("B");
		southMid=new Panel();
		southMid.setLayout(new GridLayout(3,1));
		smb1=new Button("101");

		southMid2=new Panel();
		southMid2.setLayout(new GridLayout(1,3));
		sm2b1=new Button("AA");
		sm2b2=new Button("BB");
		sm2b3=new Button("CC");
		
		
		smb3=new Button("1001");
		sb3=new Button("A");
		south.add(sb1);
		southMid2.add(sm2b1);
		southMid2.add(sm2b2);
		southMid2.add(sm2b3);
		
		southMid.add(smb1);
		southMid.add(southMid2);
		southMid.add(smb3);
		south.add(southMid);
		south.add(sb3);
		add(south,BorderLayout.SOUTH);
		
		
		show();
	}
	public static void main(String a[])
	{
		new demo_frame();
	}
}