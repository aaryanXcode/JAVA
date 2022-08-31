import java.awt.*;
import java.awt.event.*;
class demo_event extends Frame implements ActionListener
{	
	Button b1,b2,addition,multiply,subtract,divide,clear;
	Panel box;
	Label l1,l2,l3,result;
	TextField tx1,tx2,tx3;

	demo_event()
	{	
		
		setLayout(new FlowLayout());
		setVisible(true);
		setEnabled(true);
		setSize(500,500);

		
		l1=new Label("Enter 1st number");
		tx1=new TextField(10);
		l2=new Label("Enter 2nd Number");
		tx2=new TextField(10);
		result=new Label("result");
		
		tx3=new TextField(10);
		add(l1);
		add(tx1);
		add(l2);
		add(tx2);
		add(result);
		add(tx3);
		addition=new Button("+");
		addition.addActionListener(this);
		subtract=new Button("-");
		subtract.addActionListener(this);
		multiply=new Button("*");
		multiply.addActionListener(this);
		divide=new Button("/");		
		divide.addActionListener(this);
		clear=new Button("clear");
		clear.addActionListener(this);
		
		add(addition);
		add(subtract);
		add(multiply);
		add(divide);
		add(clear);
		
		show();



	}
	public void actionPerformed(ActionEvent ae)
	{
		
		int c=0;	
		String s1=tx1.getText();	
		
		String s2=tx2.getText();	

		int a = Integer.parseInt(s1);    
        		int b = Integer.parseInt(s2);    
		
		Object obj=ae.getSource();
		
		if(obj==addition)
		{
			c=a+b;
			
		}
		else if(obj==subtract)
		{
			c=a-b;
		}
		else if(obj==multiply)
		{
			c=a*b;
			
		}
		else if(obj==divide)
		{
			c=a/b;
			
		}
		else if(obj==clear)
		{
			tx1.setText(" ");
			tx2.setText(" ");
			tx3.setText(" ");
			
		}
		
		String total=String.valueOf(c);
		tx3.setText(total);
		
		
	}
	
	public static void main(String a[])
	{
		new demo_event();
	}



}