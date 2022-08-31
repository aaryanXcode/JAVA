import javax.swing.*;
import java.awt.event.*;

class MainFrame extends JFrame implements ActionListener
{
	JMenu menu;
	JMenuItem open,find;
	JDesktopPane jp;	
	MainFrame()
	{
		menu=new JMenu("File");
		open=new JMenuItem("Open");
		find=new JMenuItem("Find");
		menu.add(open);
		menu.add(find);
		JMenuBar mb=new JMenuBar();
		mb.add(menu);
		setSize(400,100);
		jp=new JDesktopPane();
		add(jp);
		open.addActionListener(this);
		find.addActionListener(this);
		setJMenuBar(mb);
		show();

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==find)
		{
			MyPane m=(MyPane)jp.getSelectedFrame();
			m.setText("hello");		
		}
		else if(e.getSource()==open)
		{

			jp.add(new MyPane());
			System.out.println("Helo");		
			show();
		}
	}
	public static void main(String a[])	
	{
		new MainFrame();
	}
	
	
}

class MyPane extends JInternalFrame
{
	JTextArea jt;
	MyPane()
	{
		super("Internal Frame ",true,true,true,true);
		setVisible(true);
		setSize(100,100);
		jt=new JTextArea();
		add(jt);
		show();
	}
	void setText(String hh)
	{
		jt.setText(hh);
	}

}