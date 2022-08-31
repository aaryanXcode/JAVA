import java.awt.*;
import java.awt.event.*;

public class Demo_Action_Event extends Frame implements ActionListener
{
	Button but1,but2;
	Label lb;	
	Button A,B,C;
	int x,y,z;
	Demo_Action_Event()
	{
		super("DEMO ACTION EVENT");
		setSize(1000,1000);
		setVisible(true);
		
		but1=new Button("RED");
		but2=new Button("GREEN");
		A=new Button("1");
		B=new Button("2");
		C=new Button("+");
		add(A);
		add(B);
		add(C);
		lb=new Label("                       					            ");
		setLayout(new FlowLayout());
		add(but1);
		add(but2);
		add(lb);
		
		A.addActionListener(this);
		B.addActionListener(this);
		C.addActionListener(this);

		but1.addActionListener( new MyEvent(this));
		but2.addActionListener((this));
		
		show();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println(ae.getActionCommand());
		if(ae.getSource()==but1)
		{
			setBackground(Color.red);
			lb.setText("Action from [ Demo_Action_Event ] class "+but1.getLabel());
		}
		else if(ae.getActionCommand()==but2.getLabel())
		{
			setBackground(Color.green);
			lb.setText("Action from [ Demo_Action_Event ] class "+but2.getLabel());
		}
		else if(ae.getSource()==A)
		{
			lb.setText(A.getLabel());
			x=Integer.parseInt(A.getLabel());

		 }
		else if(ae.getSource()==B)
		{
			lb.setText(B.getLabel());
			y=Integer.parseInt(B.getLabel());
		}
		else if(ae.getSource()==C)
		{
			System.out.println("DD:"+x);
			z=x+y;
			lb.setText(" "+z);			
		}		
	}
	public static void main(String a[])
	{
		new Demo_Action_Event();
	}
}

class MyEvent implements ActionListener
{
	Demo_Action_Event e;
	MyEvent(Demo_Action_Event e)
	{
		this.e=e;
	}	
	public void actionPerformed(ActionEvent ae)
	{
		e.setBackground(Color.red);
		e.lb.setText("Action from [ My_Event ] class "+ae.getActionCommand());
	}
}