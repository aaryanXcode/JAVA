import java.awt.*;
import java.awt.event.*;
class Panel_class extends Panel  implements ActionListener
{
	Panel south,center;
	Button add,sub,divide,multiply,equal,clear;
	Label number1,number2,result;
	double c=0.0;
	Object prev;
	TextField tx1,tx2,tx3;
	double finalResult=0;
	
	Panel_class()
	{
		
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		
			center =new Panel();
			center.setLayout(new FlowLayout());
			number1=new Label("1st number");
			number1.setFont(new Font("Arial", Font. PLAIN, 20));
	
			tx1=new TextField(10);
			tx1.setFont(new Font("Arial", Font. PLAIN, 20));
		
			add=new Button("+");
			add.setFont(new Font("Arial", Font. PLAIN, 20));
			add.addActionListener(this);
			sub=new Button("-");
			sub.setFont(new Font("Arial", Font. PLAIN, 20));
			sub.addActionListener(this);
			divide=new Button("/");
			divide.setFont(new Font("Arial", Font. PLAIN, 20));
			divide.addActionListener(this);
			multiply=new Button("*");
			multiply.setFont(new Font("Arial", Font. PLAIN, 20));
			multiply.addActionListener(this);

			number2=new Label("2nd number");
			number2.setFont(new Font("Arial", Font. PLAIN, 20));
			tx2=new TextField(10);
			tx2.setFont(new Font("Arial", Font. PLAIN, 20));
		
			equal=new Button("=");
			equal.setFont(new Font("Arial", Font. PLAIN, 20));
			equal.addActionListener(this);
			result=new Label("result");
			result.setFont(new Font("Arial", Font. PLAIN, 20));
			tx3=new TextField(10);
			tx3.setFont(new Font("Arial", Font. PLAIN, 20));
			
			clear=new Button("C");
			clear.setFont(new Font("Arial", Font. PLAIN, 20));
			clear.addActionListener(this);
			center.add(number1);
			center.add(tx1);
			center.add(add);
			center.add(sub);
			center.add(divide);
			center.add(multiply);
			center.add(number2);
			center.add(tx2);
			center.add(equal);
			center.add(result);
			center.add(tx3);
			add(center);
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
	
	public void actionPerformed(ActionEvent ae)
	{
		int a =0;
		int b =0;
		Object obj1=prev;	
		String s1=tx1.getText();	
		
		String s2=tx2.getText();	

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
		
		Object obj=ae.getSource();
		if(obj==add)
		{
			prev=add;	
		}
		if(obj==sub)
		{
			prev=sub;	
		}
		if(obj==multiply)
		{
			prev=multiply;	
		}
		if(obj==divide)
		{
			prev=divide;	
		}
	
		
		if(obj==equal )
		{
			if(prev==add)
			{
				c=add(a,b);
			}
			if(prev==sub)
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
		
		if(obj==clear)
		{
			
			String total="";
			tx1.setText(total);	
			tx2.setText(total);	
			tx3.setText(total);
			
		}
		double resultValue=c;
		finalResult+=c;
		if(obj==equal)
		{
			
			String total=String.valueOf(resultValue);
			tx3.setText(total);
		}
		
		

		
		
	}
	public int getAllresult()
	{
		try
		{
			return (int)Double.parseDouble(tx3.getText());
		}
		catch(NumberFormatException ae)
		{
			return(0);
		}
	}
	
	
	

}

class multiplePanel extends Frame implements ActionListener
{
	
	Panel_class p[];
	Button TotalSum;
	TextField tx4;
	Panel south;
	
	multiplePanel()
	{
		setLayout(new GridLayout(5,1));
		p=new Panel_class[3];
		for(int i=0;i<3;i++)
		{
			p[i]=new Panel_class();
			add(p[i]);
		}
		
		south=new Panel();
		south.setLayout(new GridLayout(1,1));
		TotalSum=new Button("Total Sum");
		TotalSum.setFont(new Font("Arial", Font. PLAIN, 20));
		TotalSum.addActionListener(this);
		tx4=new TextField(10);
		south.add(TotalSum);
		south.add(tx4);
		add(south,BorderLayout.SOUTH);
		show();
	}	
	public void actionPerformed(ActionEvent ae)
	{
		Object obj=ae.getSource();
	
		if(obj==TotalSum)
		{
			System.out.println(obj);
			System.out.println(getFinalResult());
			String sum=String.valueOf(getFinalResult());
			tx4.setText(sum);
		}
			
	}
	public int getFinalResult()
	{	
		int ans=0;

		for(int i=0;i<3;i++)
		{
			ans+=p[i].getAllresult();
		}
		
		return ans;
	}
	public static void main(String a[])
	{
		
		new multiplePanel();
		
	}
}
 