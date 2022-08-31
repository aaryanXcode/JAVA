
import java.awt.*;
import java.awt.event.*;

class comboBox extends Frame implements ActionListener
{
	Panel north,center;
	Choice ch2;
	Choice ch1;
	Button add,result;
	TextField tx1,tx2;
	Label numberLabel,Numbers,operations;
	public comboBox()
	{
		super("Demo List");
		setSize(1000,400);
		setVisible(true);
		setLayout(new BorderLayout());   
 
		north=new Panel();
		north.setLayout(new FlowLayout());
		numberLabel=new Label("Enter No.");
		tx1=new TextField(10);
		add=new Button("Add");
		add.addActionListener(this);
		north.add(numberLabel);
		north.add(tx1);
		north.add(add);
		
		center=new Panel();
		center.setLayout(new FlowLayout());
		Numbers=new Label();
		ch1=new Choice();
		
		operations=new Label();
		ch2=new Choice();
		ch2.add("Factorial");
		ch2.add("Prime");
		ch2.add("Reverse");

		result=new Button("result");
		result.addActionListener(this);
		tx2=new TextField(10);
		center.add(Numbers);
		center.add(ch1);
		center.add(operations);
		center.add(ch2);
		center.add(result);
		center.add(tx2);
		
		add(center,BorderLayout.CENTER);
		
		add(north,BorderLayout.NORTH);
		show();
	}
	public void addChoice(String number)
	{
		
		ch1.add(number);
		
		//show();
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
		if(obj==add)
		{
			System.out.println("hello");
			addChoice(tx1.getText());
		}
		if(obj==result)
		{
			System.out.println("hello");
			int n=Integer.parseInt(ch1.getSelectedItem());
			if(ch2.getSelectedItem()=="Reverse")
			{
				
				int rev=reverse(n);
				tx2.setText(""+rev);
			}
			if(ch2.getSelectedItem()=="Factorial")
			{
				int fact=factorial(n);
				tx2.setText(fact+"");
			}
			if(ch2.getSelectedItem()=="Prime")
			{
				prime(n);
				
			}
		}
	}
	public int reverse(int n)
	{
		int y=n;
		int s=0;
		int x=0;
		while(n>0)
		{
			s=s*10;
			x=n%10;
			n=(int)(n/10);
			s=x+s;
		}
		
		return s;
	}
	public void prime(int n)
	{	
		int c=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			
			}
		}
		if(c==0)
		{
			tx2.setText("prime");
		}
		else
		{
			tx2.setText("not prime");
		}
		
	}
	public int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*factorial(n-1);
	}	
	public static void main(String a[])
	{
		new comboBox();
	}
}
