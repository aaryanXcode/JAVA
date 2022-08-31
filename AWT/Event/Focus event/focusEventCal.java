import java.awt.*;
import java.awt.event.*;
class focusEventCal extends Frame implements ActionListener,FocusListener
{	
	Button b1,b2,addition,multiply,subtract,divide,clear,equal;
	Panel box;
	Label l1,l2,l3,result;
	TextField tx1,tx2,tx3;
	double c=0.0;
	Object prev;
	focusEventCal()
	{	
		
		setLayout(new FlowLayout());
		setVisible(true);
		setEnabled(true);
		setSize(500,500);

		
		l1=new Label("Enter 1st number");
		tx1=new TextField(10);
		tx1.addFocusListener(this);
		l2=new Label("Enter 2nd Number");
		tx2=new TextField(10);
		tx2.addFocusListener(this);
		result=new Label("result");
		
		tx3=new TextField(10);
		tx3.addFocusListener(this);
		
		//textlistener
		/*
		tx1.addTextListener(this);
		tx2.addTextListener(this);
		tx3.addTextListener(this);
		*/
		
		add(l1);
		add(tx1);
		add(l2);
		add(tx2);
		add(result);
		add(tx3);
		equal=new Button("=");
		equal.addActionListener(this);
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
		add(equal);
		add(addition);
		add(subtract);
		add(multiply);
		add(divide);
		add(clear);
		
		show();



	}
	public double add(int a,int b)
	{
		return a+b;
	}
	public double sub(int a,int b)
	{
		return a-b;
	}
	public double multiply(int a,int b)
	{
		return a*b;
	}
	public double divide(int a,int b)
	{
		try 
		{
            		return a/b;
      		}
        		catch (ArithmeticException e)
		{
            
            		return Double.POSITIVE_INFINITY ;
        		}
		
	}
	
	public void focusLost(FocusEvent fe)
	{
		try
		{
			int a=Integer.parseInt(tx1.getText());
			int b=Integer.parseInt(tx2.getText());
			if(prev==addition)
			{
				c=add(a,b);
			}
			if(prev==subtract)
			{
				c=sub(a,b);
			}
			if(prev==multiply)
			{
				c=multiply(a,b);
			}
			if(prev==divide)
			{
				c=divide(a,b);
			}
			tx3.setText(c+"");
		}
		catch(NumberFormatException e)
		{
			tx3.setText("Err ");
		}
		catch(ArithmeticException ae)
		{
			tx3.setText("Infinity");
		}
	}
	public void focusGained(FocusEvent fe)
	{

		TextField tx=(TextField)fe.getSource();
		tx.select(0,tx.getText().length());
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a =0;
		int b =0;
		Object obj1=prev;	
		String s1=tx1.getText();	
		
		String s2=tx2.getText();	
		/*
		try
		{
   		 	a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);    
		  
		}
		catch(NumberFormatException ex)
		{ 
  		 	tx1.setText("invalid");	
			tx2.setText("invalid");	
			tx3.setText("invalid");
		}
		
        */
		
		Object obj=ae.getSource();
		if(obj==addition)
		{
			prev=addition;	
		}
		if(obj==subtract)
		{
			prev=subtract;	
		}
		if(obj==multiply)
		{
			prev=multiply;	
		}
		if(obj==divide)
		{
			prev=divide;	
		}
	
		/*
		if(obj==equal )
		{
			if(prev==addition)
			{
				c=add(a,b);
			}
			if(prev==subtract)
			{
				c=sub(a,b);
			}
			if(prev==multiply)
			{
				c=multiply(a,b);
			}
			if(prev==divide)
			{
				c=divide(a,b);
			}
		}
		*/
		
		if(obj==clear)
		{
			
			String total="";
			tx1.setText(total);	
			tx2.setText(total);	
			tx3.setText(total);
			
		}
		double result=c;
		if(obj==equal)
		{
			
			String total=String.valueOf(result);
			tx3.setText(total);
		}
	}
	
	public static void main(String a[])
	{
		new focusEventCal();
	}
}