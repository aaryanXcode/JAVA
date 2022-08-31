 import java.awt.*;
import java.awt.event.*;

class Demo_Action extends Frame implements ActionListener
{	
	Button b1,b2;
	TextField tx1,tx2;

	Demo_Action()
	{
		ss=new String();		
		setLayout(new FlowLayout());
		setVisible(true);
		setEnabled(true);
		setSize(500,500);


		b1=new Button("Click me1");
		b1.addActionListener(this);

		add(b1);

		b2=new Button("Click  Me2");

		b2.addActionListener(this);

		tx1=new TextField(10);

		add(b2);
		add(tx1);
		
		show();



	}
	
	String ss;
	public void actionPerformed(ActionEvent ae)
	{
		Object obj=ae.getSource();
		if(obj==b1)
		{
			ss="Hello World1";
			//tx1.setText("B1");
			tx1.setText(b1.getActionCommand());	
			
			//System.out.println("Hello World1");
		}
		if(obj==b2)
		{
			tx1.setText("B2");	
			ss="Hello World2";
//			System.out.println("Hello World2");
		}
		setTitle(ss);
		
		
	}


	public static void main(String a[])
	{
		new Demo_Action();
	}



}
