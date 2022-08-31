import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Demo_MDI_ToolBar extends JFrame implements ActionListener
{
	JMenuBar jm;
	JMenu j_menu;
	JMenuItem j_mi2,to_back,to_front;
	JDesktopPane jp;
	Button b1,b2;
	public Demo_MDI_ToolBar()	
	{
		super("Demo MDI");
		jp=new JDesktopPane();

		jm=new JMenuBar();
		j_menu=new JMenu("File");
		j_mi2=new JMenuItem("Open");
		to_back=new JMenuItem("To Back");
		to_front=new JMenuItem("To Front");
		j_menu.add(j_mi2);
		j_menu.add(to_back);
		j_menu.add(to_front);
		jm.add(j_menu);
		setJMenuBar(jm);

		JInternalFrame ji1=new JInternalFrame("Internal Frame ONE",false,false,false,false);
		ji1.setVisible(true);
		ji1.setSize(300,100);
		JInternalFrame ji2=new JInternalFrame("Internal Frame TWO",true,true,true,true);
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
/////////////////////////////////////////////////////
		JToolBar j_tool=new JToolBar();
		j_tool.setLayout(new FlowLayout(FlowLayout.LEFT));
		JToolBar j_tool1=new JToolBar();
		JToolBar j_tool2=new JToolBar();
		j_tool1.setBackground(Color.red);
		j_tool2.setBackground(Color.green);

		j_tool1.add(new JButton("hello"));
		j_tool1.add(new JButton("hello1"));
		j_tool1.add(new JButton("hello2"));

		j_tool2.add(new JButton("hay"));

		j_tool.add(j_tool1);
		j_tool.add(j_tool2);

		setLayout(new BorderLayout());
		
		add(jp,BorderLayout.CENTER);	
		add(j_tool,BorderLayout.NORTH);
		show();
///////////////////////////////////////////////////////
		j_mi2.addActionListener(this);
		to_back.addActionListener(this);
		to_front.addActionListener(this);
			
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==j_mi2)
		{
			JInternalFrame ji1=new JInternalFrame("Internal Frame ONE",true,true,true,true);
			ji1.setVisible(true);
			ji1.setSize(300,100);
			jp.add(ji1);	
			show();	
		}
		else if(ae.getSource()==to_back)
		{
			JInternalFrame ji=jp.getSelectedFrame();
			ji.toBack();
		}
		else if(ae.getSource()==to_front)
		{
			JInternalFrame ji[]=jp.getAllFrames();
			for(int i=0;i<ji.length;i++)
			ji[i].dispose();
		}
	}
	public static void main(String a[])
	{
		new Demo_MDI_ToolBar();
	}
}

