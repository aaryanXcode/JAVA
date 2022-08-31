import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Demo_File1 extends Frame implements ActionListener
{
	MenuBar mb;
	Menu file;
	MenuItem open,save;
	TextArea tx;
	
	Demo_File1()
	{
		super("File Demo");
		setVisible(true);
		setSize(300,400);
		
		mb=new MenuBar();
		setMenuBar(mb);
		file=new Menu("File");
		open=new MenuItem("Open");
		save=new MenuItem("Save");
		file.add(open);
		file.add(save);
		mb.add(file);
		tx=new TextArea();
		add(tx);
		show();
		open.addActionListener(this);
		save.addActionListener(this);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(1);}});
	}
	FileInputStream f_in;
	FileOutputStream f_out;
	public void actionPerformed(ActionEvent ae)
	{
		if(open.getLabel()==ae.getActionCommand())
		{
			FileDialog fd=new FileDialog(this,"Open File",FileDialog.LOAD);
			fd.show();
			String file=fd.getFile();
			String dir=fd.getDirectory();
			
			try
			{
				f_in=new FileInputStream(dir+"/"+file);
			}
			catch(Exception e)
			{
				System.out.println("not open!!"+e);
			}
			byte buf[];
			
			try
			{
				buf=new byte[f_in.available()];
				f_in.read(buf);
				f_in.close();
				tx.setText(new String(buf));
			}
			catch(Exception e)
			{
				System.out.println("not read!!"+e);
			}
			
	
		
		
		}
		else if(save.getLabel()==ae.getActionCommand())
		{
			FileDialog fd=new FileDialog(this,"SAVE AS",FileDialog.SAVE);
			fd.show();
			String file=fd.getFile();
			String dir=fd.getDirectory();
			Frame f=new Frame();
			Label l=new Label("File name "+file);

			/*f.add(l);
			f.setSize(100,100);
			f.setVisible(true);
			f.show();*/

			
			File in=new File(dir,file);
			try
			{
				f_out=new FileOutputStream(in);
			}
			catch(Exception e)
			{
				System.out.println("not open!!"+e);
			}
			byte buf[];
			buf=new byte[tx.getText().length()];
			buf=tx.getText().getBytes();
			try
			{
				f_out.write(buf);
				f_out.flush();
				f_out.close();
			
			}
			catch(Exception e)
			{
				System.out.println("not write!!"+e);
			}
			
		}
			
	}
	
	public static void main(String a[])
	{
		new Demo_File1();
	}
}
		