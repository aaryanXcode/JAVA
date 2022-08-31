import java.awt.*;
import java.awt.event.*;
public class keyEvent_demo extends Frame implements KeyListener
{
	Button b1,b2;
	Label dd;
	TextField tx;
	Label txe;
	String ss="";
	keyEvent_demo()
	{
		super("Key Event");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		b1=new Button("Type here");
		b2=new Button("clear");
		dd=new Label("              ");
		txe=new Label("                                                  ");
		tx=new TextField(20);
		add(dd);
		add(b1);
		add(tx);
		add(txe);
		add(b2);
		b1.addKeyListener(this);
		b2.addKeyListener(this);	
		tx.addKeyListener(this);
		this.addWindowListener(new WinEvents(this));
		show();
	}
	boolean print;
	public void keyPressed(KeyEvent ke)
	{
		
	}
	String m="";
	public void keyReleased(KeyEvent ke)
	{
		
	}
	public void keyTyped(KeyEvent ke)
	{
		if(tx.getText=="")
		{
			if(ke.getKeyChar>=97 && ke.getKeyChar<=122)
			{
				tx.setText(ke.
				
	}

	public static void main(String a[])
	{
		new keyEvent_demo();
	}

}
class WinEvents implements WindowListener
{
	keyEvent_demo key;
	WinEvents(keyEvent_demo key)
	{	
		this.key=key;
	}
	
	public void windowActivated(WindowEvent we)
	{
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
	}

	public void windowIconified(WindowEvent we)
	{
		
	}
	public void windowDeiconified(WindowEvent we)
	{
	}
	public void windowOpened(WindowEvent we)
	{
	}
	
}


			
