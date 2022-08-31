
import java.awt.*;

class Java_Calculator extends Frame
{
	Button b1[]=new Button[25];
	TextField tx;
	Java_Calculator()
	{
		super("Java Calculator");
		
		setSize(250,180);
		setVisible(true);
		setResizable(false);

		Panel top=new Panel();
		top.setBackground(Color.pink);
		tx=new TextField(20);
		top.add(tx);

		Panel bottom=new Panel();	
		bottom.setLayout(new GridLayout(5,5));
		String str[]={"OFF","MRC","M-","M+","/","+/-","7","8","9","*","%","4","5","6",
				"-","ON/AC","1","2","3","+","CE","0",".","=","Sqrt"};
		
		for(int i=0;i<25;i++)
		{
			b1[i]=new Button(str[i]);
			bottom.add(b1[i]);	
		}
		setLayout(new BorderLayout());
		add(top,BorderLayout.NORTH);
		add(bottom,BorderLayout.CENTER);
		

		show();
	}
	public static void main(String a[])
	{
		new Java_Calculator();
	}
		
}
