 import java.awt.*;
import java.awt.event.*;
class calculator extends Frame implements ActionListener
{
	Panel display,east,south,west,center,keypad,numkey1,numkey2,numkey3,numkey4,numkey5,numkey6,operatorKey,operators;
	Button bn1,bn2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDot,bEqual,bs,bd,bf,bg;
	Button temp1,temp2;
	Button minus,multiply,divide,add,clear;
	TextField disp;
	String numbers="";
	double c=0;
	int a=0;
	int b=0;
	int m=1;
	int d=1;
	Object prev;
	int addKeyStroke=0;
	int subKeyStroke=0;
	int multiplyKeyStroke=0;
	int divideKeyStroke=0;
	calculator()
	{
		super("calculator");
		setVisible(true);
		setSize(400,400);
		setLayout(new BorderLayout());

		

		display=new Panel();
		display.setLayout(new GridLayout(1,1));
		
		disp=new TextField(10);
		disp.setFont(new Font("Arial", Font. PLAIN, 40));
		//disp.setBounds(0,0,700,300);
		display.setSize(500,500);
		disp.setBounds(0, 0, 1200, 400);
		display.add(disp);
		add(display,BorderLayout.NORTH);

		keypad=new Panel();
		keypad.setLayout(new GridLayout(1,5));
		
		
		numkey1=new Panel();
		numkey1.setLayout(new GridLayout(3,1));
		
		b1=new Button("1");
		b1. setFont(new Font("Arial", Font. PLAIN, 40));
		b1.addActionListener(this);
		b4=new Button("4");
		b4. setFont(new Font("Arial", Font. PLAIN, 40));
		b4.addActionListener(this);
		b7=new Button("7");
		b7. setFont(new Font("Arial", Font. PLAIN, 40));
		b7.addActionListener(this);
		numkey1.add(b1);
		numkey1.add(b4);
		numkey1.add(b7);
	
		numkey2=new Panel();
		numkey2.setLayout(new GridLayout(3,1));
		
		b2=new Button("2");
		b2. setFont(new Font("Arial", Font. PLAIN, 40));
		b2.addActionListener(this);
		b5=new Button("5");
		b5. setFont(new Font("Arial", Font. PLAIN, 40));
		b5.addActionListener(this);
		b8=new Button("8");
		b8. setFont(new Font("Arial", Font. PLAIN, 40));
		b8.addActionListener(this);
		numkey2.add(b2);
		numkey2.add(b5);
		numkey2.add(b8);

		numkey3=new Panel();
		numkey3.setLayout(new GridLayout(3,1));
		
		b3=new Button("3");
		b3. setFont(new Font("Arial", Font. PLAIN, 40));
		b3.addActionListener(this);
		b6=new Button("6");
		b6. setFont(new Font("Arial", Font. PLAIN, 40));
		b6.addActionListener(this);
		b9=new Button("9");
		b9. setFont(new Font("Arial", Font. PLAIN, 40));
		b9.addActionListener(this);
		numkey3.add(b3);
		numkey3.add(b6);
		numkey3.add(b9);

		numkey4=new Panel();
		numkey4.setLayout(new GridLayout(3,1));
		
		bDot=new Button(".");
		bDot. setFont(new Font("Arial", Font. PLAIN, 40));
		bDot.addActionListener(this);
		b0=new Button("0");
		b0. setFont(new Font("Arial", Font. PLAIN, 40));
		b0.addActionListener(this);
		bEqual=new Button("=");
		bEqual. setFont(new Font("Arial", Font. PLAIN, 40));
		bEqual.addActionListener(this);
		numkey4.add(bDot);
		numkey4.add(b0);
		numkey4.add(bEqual);
		
		numkey5=new Panel();
		numkey5.setLayout(new GridLayout(2,1));
		
		numkey6=new Panel();
		numkey6.setLayout(new GridLayout(4,1));
		
		clear=new Button("C");
		clear. setFont(new Font("Arial", Font. PLAIN, 40));
		clear.addActionListener(this);
		minus=new Button("-");
		minus. setFont(new Font("Arial", Font. PLAIN, 40));
		minus.addActionListener(this);
		divide=new Button("/");
		divide. setFont(new Font("Arial", Font. PLAIN, 40));
		divide.addActionListener(this);
		multiply=new Button("*");
		multiply. setFont(new Font("Arial", Font. PLAIN, 40));
		multiply.addActionListener(this);
		numkey6.add(clear);
		numkey6.add(minus);
		numkey6.add(divide);
		numkey6.add(multiply);
		add=new Button("+");
		add. setFont(new Font("Arial", Font. PLAIN, 40));
		add.addActionListener(this);
		
		numkey5.add(numkey6);
		numkey5.add(add);
		
		
		
		
		keypad.add(numkey1);
		keypad.add(numkey2);
		keypad.add(numkey3);
		keypad.add(numkey4);
		keypad.add(numkey5);

		add(keypad,BorderLayout.CENTER);		
		show();
	}
	public double add(int a,int b)
	{
		return a+b;
	}
	public double minus(int a,int b)
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
	
	public void actionPerformed(ActionEvent ae)
	{
		
			
		
		Object obj=ae.getSource();
		
		
		if(obj==b0)
		{
			numbers=numbers+b0.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b1)
		{
			numbers=numbers+b1.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b2)
		{
			numbers=numbers+b2.getActionCommand();
			disp.setText(numbers);
			
		}
		if(obj==b3)
		{
			numbers=numbers+b3.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b4)
		{
			numbers=numbers+b4.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b5)
		{
			numbers=numbers+b5.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b6)
		{
			numbers=numbers+b6.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b7)
		{
			numbers=numbers+b7.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b8)
		{
			numbers=numbers+b8.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==b9)
		{
			numbers=numbers+b9.getActionCommand();
			disp.setText(numbers);
			
			
		}
		if(obj==add)
		{
			addKeyStroke++;
			if(addKeyStroke>1)
			{
				
				a+=Integer.parseInt(numbers);
			}
			else
			{
				
				a=Integer.parseInt(numbers);

			}
			numbers="";
			disp.setText("");
			prev=add;	
		}
		if(obj==minus)
		{	
			subKeyStroke++;
			if(subKeyStroke>1)
			{
				a=Integer.parseInt(numbers);
			}
			else
			{
				a-=Integer.parseInt(numbers);
			}
			numbers="";
			disp.setText("");
			prev=minus;	
		}
		if(obj==multiply)
		{
			multiplyKeyStroke++;
			if(multiplyKeyStroke>1)
			{
				
				a*=Integer.parseInt(numbers);
			}
			else
			{
				
				a=Integer.parseInt(numbers);
			}
			//a=Integer.parseInt(numbers);
			//System.out.println("m="+m);
			numbers="";
			disp.setText("");
			prev=multiply;	
		}
		if(obj==divide)
		{
			divideKeyStroke++;
			if(divideKeyStroke>1)
			{
				a/=Integer.parseInt(numbers);
			}
			else
			{
				a=Integer.parseInt(numbers);
			}
			//a=Integer.parseInt(numbers);
			numbers="";
			disp.setText("");
			prev=divide;	
		}
		if(obj==bEqual )
		{
			b=Integer.parseInt(numbers);
		
			if(prev==add)
			{

				c=add(a,b);
			}
			if(prev==minus)
			{
				c=minus(a,b);
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
	
		
		
		else if(obj==clear)
		{
			a=0;
			b=0;
			addKeyStroke=0;
			subKeyStroke=0;
			multiplyKeyStroke=0;
			divideKeyStroke=0;
			numbers="";
			String total="";
			disp.setText(total);
		}
		double result=c;
		
		
		if(obj==bEqual)
		{
			
			String total=String.valueOf(result);
			disp.setText(total);
		}

		System.out.println("value of a="+a);
		
	}
	public static void main(String a[])
	{
		new calculator();
	}
}