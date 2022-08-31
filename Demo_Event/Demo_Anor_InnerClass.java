import java.awt.*;
import java.awt.event.*;
class Demo_Anor_InnerClass extends Frame implements TextListener
{
	TextField tx1,tx2;
	Label dd1,dd2;
	Demo_Anor_InnerClass()
	{
		super("Demo Key Event");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		tx1=new TextField("               ");
		tx2=new TextField("               ");
		dd1=new Label("                  ");
		dd2=new Label("                  ");
		dd1.setBackground(Color.blue);
		dd1.setForeground(Color.yellow);
		dd2.setBackground(Color.blue);
		dd2.setForeground(Color.yellow);
		
		add(tx1);
		add(dd1);
		tx1.addTextListener(this);
		add(tx2);
		add(dd2);
		tx2.addTextListener(this);
////////////////////////////////////////////////////////////////////////////
		this.addWindowListener(
					new WindowAdapter()
					{
						public void windowClosing(WindowEvent we)
						{
							//hide();
							setVisible(false);
							System.exit(0);
						}
					} 
				);
//////////////////////////////////////////////////////////////////////////////
		show();
	}
	public void textValueChanged(TextEvent te)
	{
		if(te.getSource()==tx1)
			dd1.setText(tx1.getText());
		else if(te.getSource()==tx2)
			dd2.setText(tx2.getText());
		
	}

	public static void main(String a[])
	{
		new Demo_Anor_InnerClass();
	}

}


	