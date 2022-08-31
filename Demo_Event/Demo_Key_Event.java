import java.awt.*;
import java.awt.event.*;
class Demo_Key_Event extends Frame implements KeyListener
{
	Button hi,hello;
	Label dd;
	TextField tx;
	Label txe;
	String ss="";
	Demo_Key_Event()
	{
		super("Demo Key Event");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		hi=new Button("hi");
		hello=new Button("hello");
		dd=new Label("              ");
		txe=new Label("                                                  ");
		tx=new TextField(20);
		add(dd);
		add(hi);
		add(tx);
		add(txe);
		add(hello);
		hi.addKeyListener(this);
		hello.addKeyListener(this);	
		tx.addKeyListener(this);

		show();
	}
	public void keyPressed(KeyEvent ke)
	{
		print=false;
		

		if(ke.getSource()==tx)
		if(ke.getKeyChar()>=97&&ke.getKeyChar()<=122)
		print=true;
			
		
				
			
	}
	boolean print;
	public void keyReleased(KeyEvent ke)
	{
		print=false;
		if(ke.getSource()==tx)
		if(ke.getKeyChar()>=97&&ke.getKeyChar()<=122)
		{
			print=true;
			tx.setText(tx.getText().substring(0,tx.getText().length()-1));	
			tx.select(tx.getText().length(),tx.getText().length());

		}	
	}
	String msg="" ;
	public void keyTyped(KeyEvent ke)
	{

		if(print==true)
		{
			try
			{
				tx.setText(tx.getText().substring(0,tx.getText().length()-1));	
				tx.select(tx.getText().length(),tx.getText().length());
			}
			catch(Exception e)
			{
			}

		}	
		
	}

	public static void main(String a[])
	{
		new Demo_Key_Event();
	}

}

				
