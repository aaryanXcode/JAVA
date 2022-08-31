import java.awt.*;
import java.awt.event.*;
class Demo_Focus_Event extends Frame implements FocusListener,TextListener
{	
	TextField tx1,tx2,tx3;
	Demo_Focus_Event()
	{
		super("Demo_Focus_Event");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		tx1=new TextField("0",5);
		tx2=new TextField("0",5);
		tx3=new TextField("0",5);
		add(tx1);
		add(tx2);
		add(tx3);
		tx1.addFocusListener(this);
		tx2.addFocusListener(this);
		tx3.addFocusListener(this);

		tx1.addTextListener(this);
		tx2.addTextListener(this);
		tx3.addTextListener(this);
		show();
	}				
	public void focusLost(FocusEvent fe)
	{
		try
		{
			double a=Double.parseDouble(tx1.getText().trim());
			double b=Double.parseDouble(tx2.getText().trim());
			tx3.setText(""+(a/b));
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
	public void textValueChanged(TextEvent te)
	{
		try
		{
			double a=Double.parseDouble(tx1.getText().trim());
			double b=Double.parseDouble(tx2.getText().trim());
			tx3.setText(""+(a/b));
		}
		catch(NumberFormatException e)
		{
			tx3.setText("Err in Data");
		}
		catch(ArithmeticException ae)
		{	
			tx3.setText("Infinity");
		}
	}
	public static void main(String a[])
	{
		
		new Demo_Focus_Event();
	}
}