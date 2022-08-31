import java.awt.*;
import java.awt.event.*;
class Demo_Window_Adaptar extends Frame implements TextListener
{
	TextField tx1,tx2;
	Label dd1,dd2;
	Demo_Window_Adaptar()
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

		Frame xx=new Frame("new Frame");
		xx.setVisible(true);
		xx.setSize(300,300);
		xx.addWindowListener(new Window_Event(xx));

		this.addWindowListener(new Window_Event(this));
		tx2.addMouseListener(new Mouse_Event(this));
		tx1.addMouseListener(new Mouse_Event(this));
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
		new Demo_Window_Adaptar();
	}

}

class Window_Event extends WindowAdapter
{
	Frame w;
	Window_Event(Frame w)				
	{
		this.w=w;
	}
	public void windowClosing(WindowEvent we)
	{
		w.dispose();
		//System.exit(0);
	}

}
class Mouse_Event extends MouseAdapter
{
	Demo_Window_Adaptar w;
	Mouse_Event(Demo_Window_Adaptar w)	
	{
		this.w=w;
	}
	public void mouseClicked(MouseEvent me)
	{
		TextField op=(TextField)me.getSource();
		if(w.tx1==op)
			w.tx1.setText("hello");	

		else
			w.tx2.setText("hay");			
				
	}
}
	