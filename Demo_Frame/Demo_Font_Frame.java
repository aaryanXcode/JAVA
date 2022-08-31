import java.awt.*;
public class Demo_Font_Frame extends Frame implements Runnable
{
	GraphicsEnvironment ge;
	long  font_height;
	int y;
	int index,no_of_fonts;
	Font f[];
	Thread t;
	TextArea tx;
	public  Demo_Font_Frame()
	{
		super("FONT DEMO ");
		setVisible(true);
		setSize(400,400);

		t=new Thread(this);
		y=10;
		try
		{
			ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		}
		catch(Exception e)
		{
			System.out.println("exception graphics : "+e);	
		}
		f=ge.getAllFonts();
		index=0;
		no_of_fonts=f.length;
		t.start();
		tx=new TextArea(20,50);
		add(tx);
		setLayout(new FlowLayout());
		show();

	}
	public void run()
	{
		while(index<no_of_fonts-1)
		{
			y+=font_height;
			index++;
			paint_lbl();
			try
			{
				t.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println("exception thread: "+e);
			}
		}
	}
	public void paint_lbl()
	{
		try
		{
	
			tx.append(f[index].getFontName()+"  "+index+"\n");
			show();
	
		}
		catch(Exception e)
		{
			System.out.println("exception font: "+e);
		}
		
	}
	public static void main(String a[])	
	{
		new Demo_Font_Frame();
	}
}
			