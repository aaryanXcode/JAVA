import java.awt.*;
import java.awt.event.*;
class calci extends Frame
{
	Panel display,east,south,west,center,keypad,numkey1,numkey2,numkey3,numkey4,numkey5,numkey6,operatorKey,operators;
	Button bn1,bn2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDot,bEqual,bs,bd,bf,bg;
	Button temp1,temp2;
	Button minus,multiply,divide,add;
	TextField disp;
	
	calci()
	{
		super("Demo calci");
		setVisible(true);
		setSize(400,400);
		setLayout(new BorderLayout());

		

		display=new Panel();
		display.setLayout(new GridLayout(1,1));
		disp=new TextField(10);
		display.add(disp);
		add(display,BorderLayout.NORTH);

		keypad=new Panel();
		keypad.setLayout(new GridLayout(1,5));
		
		
		numkey1=new Panel();
		numkey1.setLayout(new GridLayout(3,1));
		
		b1=new Button("1");
		b4=new Button("4");
		b7=new Button("7");
		numkey1.add(b1);
		numkey1.add(b4);
		numkey1.add(b7);
	
		numkey2=new Panel();
		numkey2.setLayout(new GridLayout(3,1));
		
		b2=new Button("2");
		b5=new Button("5");
		b8=new Button("8");
		numkey2.add(b2);
		numkey2.add(b5);
		numkey2.add(b8);

		numkey3=new Panel();
		numkey3.setLayout(new GridLayout(3,1));
		
		b3=new Button("3");
		b6=new Button("6");
		b9=new Button("9");
		numkey3.add(b3);
		numkey3.add(b6);
		numkey3.add(b9);

		numkey4=new Panel();
		numkey4.setLayout(new GridLayout(3,1));
		
		bDot=new Button(".");
		b0=new Button("0");
		bEqual=new Button("=");
		numkey4.add(bDot);
		numkey4.add(b0);
		numkey4.add(bEqual);
		
		numkey5=new Panel();
		numkey5.setLayout(new GridLayout(2,1));
		
		numkey6=new Panel();
		numkey6.setLayout(new GridLayout(3,1));
		
		minus=new Button("-");
		divide=new Button("/");
		multiply=new Button("*");
		numkey6.add(minus);
		numkey6.add(divide);
		numkey6.add(multiply);
		add=new Button("+");
		
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
	public static void main(String a[])
	{
		new calci();
	}
}