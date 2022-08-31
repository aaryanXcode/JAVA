import java.awt.*;
import java.awt.event.*;
public class Panel_class extends Frame implements ActionListener
{
	Panel south,center;
	Button add,sub,divide,multiply,EqualTo;
	Label number1,number2,result;
	
	TextField tx1,tx2,tx3;
	
	Panel_class()
	{
		super("multiplePanel");
		setVisible(true);
		setSize(400,400);
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

		tx2=new TextField(10);
		tx2.setFont(new Font("Arial", Font. PLAIN, 20));
		
		EqualTo=new Button("=");
		EqualTo.setFont(new Font("Arial", Font. PLAIN, 20));
		EqualTo.addActionListener(this);
		result=new Label("result");
		result.setFont(new Font("Arial", Font. PLAIN, 20));
		tx3=new TextField(10);
		tx3.setFont(new Font("Arial", Font. PLAIN, 20));
			
		center.add(number1);
		center.add(tx1);
		center.add(add);
		center.add(sub);
		center.add(divide);
		center.add(multiply);
		center.add(tx2);
		center.add(EqualTo);
		center.add(result);
		center.add(tx3);
		add(center);
		
	}
	
}