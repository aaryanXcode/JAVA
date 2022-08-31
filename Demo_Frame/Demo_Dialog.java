import java.awt.*;
import java.awt.event.*;

class Demo_Dialog extends Frame implements ActionListener
{
	MenuBar mb;
	Menu file;
	MenuItem open,save,normal;
	FileDialog fd_open,fd_save;
	
	Demo_Dialog()
	{
		super("Demo Dialog");
		setVisible(true);
		setSize(300,400);
		mb=new MenuBar();
		
		file=new Menu("File");
		open=new MenuItem("Open");
		save=new MenuItem("Save");
		normal=new MenuItem("Normal");
	
		file.add(open);
		file.add(save);
		file.add(normal);
		
		open.addActionListener(this);
		save.addActionListener(this);
		normal.addActionListener(this);

		fd_open=new FileDialog(this,"Open",FileDialog.LOAD);
		fd_save=new FileDialog(this,"Save As",FileDialog.SAVE);
		
		mb.add(file);
		
		setMenuBar(mb);
		addWindowListener(new My_Win_Event(this));	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==open)
		{
			//My_Dialog ff=new My_Dialog(this,"my dialog");
			
			//ff.show();
			//fd_open.setResizable(false);
			fd_open.show();
			System.out.println("File Name:"+fd_open.getFile());
			System.out.println("Dir Path Name:"+fd_open.getDirectory());
			fd_open.dispose();
		}
		else if(ae.getSource()==save)			
		{
			fd_save.show();
			fd_save.dispose();
		}
		else if(ae.getSource()==normal)			
		{
			new My_Dialog(this,"I am normal dialog");
		}
		

	}
	public static void main(String a[])
	{
		new Demo_Dialog();
	}

}

class My_Win_Event extends WindowAdapter
{
	Object D;
	My_Win_Event(Object d)
	{
		D=d;		
	}
	Frame xx;
	public void windowClosing(WindowEvent we)
	{
		System.out.println("DD");	
		//xx=(Frame)we.getSource();
		//String ss=xx.getTitle();	
		//if(ss.equals("Demo Dialog"))
			System.exit(0);
	/*	else if(ss.equals("my dialog"))
		{
			Frame dd=(Frame)D;
			dd.setVisible(false);
		}*/
		
	}
}
class My_Dialog extends Dialog implements ActionListener
{
	Button b;
	My_Dialog(Frame obj,String title)
	{	
		super(obj,title,true);
		setVisible(true);
		setEnabled(true);
		setSize(500,500);
		setLayout(new FlowLayout());

		

		b=new Button("Exit");
		b.addActionListener(this);
		
		add(b);

		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent we)
					{
						System.out.println("DD");
						dispose();
					}
			
				}
		);			

		show();
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		this.dispose();
	}
	
}