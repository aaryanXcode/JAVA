import javax.swing.*;
import java.awt.*;
class Demo_JProgressBar extends JFrame implements Runnable
{
	JProgressBar jp;
	Thread th;
	Demo_JProgressBar()
	{	
		th=new Thread(this);
		jp=new JProgressBar(JProgressBar.HORIZONTAL,0,1000);
		jp.setStringPainted(true);
		setLayout(new FlowLayout());
		add(jp);
		th.start();
		show();
	}
	public void run()
	{
		while(jp.getValue()<jp.getMaximum())
		{
			jp.setValue(jp.getValue()+1);
			try
			{
				Thread.sleep(50);
			}
			catch(Exception e)
			{
				System.out.println("Ex:"+e);
			}
		}
	}
	
	public static void main(String a[])
	{
		new Demo_JProgressBar();
	}
}	