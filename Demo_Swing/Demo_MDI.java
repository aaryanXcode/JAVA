import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Demo_MDI extends JFrame implements ActionListener
{
	JMenuBar jm;
	JMenu j_menu;
	JMenuItem j_mi2;
	JDesktopPane jp;
	JPopupMenu jpop;
	public Demo_MDI()	
	{
		super("Demo MDI");
		jp=new JDesktopPane();
		
		jm=new JMenuBar();
		j_menu=new JMenu("File",false);
		j_mi2=new JMenuItem("Open");
		j_menu.add(j_mi2);
		jm.add(j_menu);
		setJMenuBar(jm);
		//////////////////////////
		jpop=new JPopupMenu("File");
		jpop.add(new JMenuItem("HELLO"));
		jpop.add(new JMenuItem("Hay"));
		jpop.add(new JMenuItem("welcome"));

		JInternalFrame ji1=new JInternalFrame("Internal Frame ONE",true,true,true,true);
		ji1.setVisible(true);
		ji1.setSize(300,100);
		JInternalFrame ji2=new JInternalFrame("Internal Frame TWO",false,true,true,false);
		ji2.setVisible(true);
		ji2.setSize(300,100);


		setVisible(true);
		setSize(400,400);

		JTextArea j_text=new JTextArea();

		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;		
		
		JScrollPane js=new JScrollPane(j_text,v,h);	

		ji1.add(js);

		jp.add(ji1);
		jp.add(ji2);
		add(jp);	
		show();
		j_mi2.addActionListener(this);
		this.addMouseListener(new Mouse_Action(this));
		jm.setEnabled(false);
			
	}


	public void actionPerformed(ActionEvent ae)
	{
		JInternalFrame x[]=jp.getAllFrames();

		int x1=x.length;
		JInternalFrame ji1=new JInternalFrame("Internal Frame "+(x1+1),true,true,true,true);
		ji1.setVisible(true);
		ji1.setSize(300,100);
		jp.add(ji1);	
		show();
	}
	public static void main(String a[])
	{
		new Demo_MDI();
	}
}
class Mouse_Action extends MouseAdapter
{
	Demo_MDI X;
	Mouse_Action(Demo_MDI x)
	{
		X=x;
		
	}	
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("DD");
		X.jpop.show(X,e.getX(),e.getY());
	}			
}

