
import java.awt.*;
import java.awt.event.*;
class Demo_Window_Event extends Frame implements TextListener
{
	TextField tx1,tx2;
	Label dd1,dd2;
	Demo_Window_Event()
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
		this.addWindowListener(new WinEvents(this));

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
		new Demo_Window_Event();
	}

}

public class WinEvents implements WindowListener
{
	Demo_Window_Event ff;
	WinEvents(Demo_Window_Event ff)
	{	
		this.ff=ff;
	}
	public void windowActivated(WindowEvent we)
	{
		ff.dd1.setText("activated");
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.println("CLOSED");
		System.exit(0);	
	}
	public void windowClosed(WindowEvent we)
	{
			
	}
	public void windowDeactivated(WindowEvent we)
	{
		ff.dd1.setText("deactivated");
	}

	public void windowIconified(WindowEvent we)
	{
		
		Frame f=new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(new Label("minimize"));
		f.show();
		
	}
	public void windowDeiconified(WindowEvent we)
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(new Label("maximize"));
		f.show();
	}

	public void windowOpened(WindowEvent we)
	{
	}
}

				
