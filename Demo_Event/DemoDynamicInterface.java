import java.awt.*;
import java.awt.event.*;
class  DemoDynamicInterface extends Frame implements ActionListener
{
	Button load;
	TextField tx;
	MyPanel mp;
	DemoDynamicInterface()
	{
		setSize(300,500);
		setLayout(new BorderLayout());
		setVisible(true);
		load=new Button("Load");
		tx=new TextField(10);
		Panel p=new Panel();
		p.setLayout(new FlowLayout());
		p.add(tx);
		p.add(load);
		add(p,BorderLayout.NORTH);
		mp=new MyPanel();
		add(mp,BorderLayout.CENTER);
		show();
		load.addActionListener(this);
		
	}	
	public void actionPerformed(ActionEvent a)
	{
		try
		{
			int x=Integer.parseInt(tx.getText());
			remove(mp);
			mp=new MyPanel(x);
			add(mp,BorderLayout.CENTER);
			show();	
		}	
		catch(Exception e)
		{
		}
	}
	public static void main(String a[])
	{	
		new DemoDynamicInterface();
	}	
}