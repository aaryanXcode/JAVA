import java.awt.*;
import java.awt.event.*;
class calciUI extends Frame
{
	Panel display,east,south,west,center,keypad,numkey,operatorKey,operators;
	Button bn1,bn2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDot,bEqual,bs,bd,bf,bg;
	Button temp1,temp2;
	Button minus,multiply,divide,add;
	TextField disp;
	
	calciUI()
	{
		super("Demo calci");
		setVisible(true);
		setSize(400,400);
		setLayout(new BorderLayout());

		//setLayout(new GridLayout(2,1));

		display=new Panel();
		display.setLayout(new GridLayout(1,1));
		disp=new TextField(10);
		display.add(disp);
		add(display,BorderLayout.NORTH);

		keypad=new Panel();
		keypad.setLayout(new GridLayout(1,2));
		//bn1=new Button("A");
		numkey=new Panel();
		numkey.setLayout(new GridLayout(4,3));
		
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b0=new Button("0");
		bDot=new Button(".");
		bEqual=new Button("=");
		numkey.add(b1);
		numkey.add(b1);
		numkey.add(b2);
		numkey.add(b3);
		numkey.add(b4);
		numkey.add(b5);
		numkey.add(b6);
		numkey.add(b7);
		numkey.add(b8);
		numkey.add(b9);
		numkey.add(bDot);
		numkey.add(b0);
		numkey.add(bEqual);

		operatorKey=new Panel();
		operatorKey.setLayout(new GridLayout(2,2));
		operators=new Panel();
		operators.setLayout(new GridLayout(3,1));
		minus=new Button("-");
		multiply=new Button("x");
		divide=new Button("/");
		operators.add(minus);
		operators.add(multiply);
		operators.add(divide);

		add=new Button("+");
		operatorKey.add(operators);
		operatorKey.add(add);

		keypad.add(numkey);
		keypad.add(operatorKey);
		add(keypad,BorderLayout.CENTER);		
		show();
	}
	public static void main(String a[])
	{
		new calciUI();
	}
}