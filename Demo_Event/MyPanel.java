import java.awt.*;
import java.awt.event.*;
class MyPanel extends Panel
{

	TextField tx[];
	MyPanel()
	{
	}
	MyPanel(int n)
	{
		setLayout(null);
		tx=new TextField[n];
		int x,y,h;
		x=10;
		y=10;
		h=15;
		for(int i=0;i<tx.length;i++)
		{		
			tx[i]=new TextField(5);
			tx[i].setBounds(x,y,15,h);
			y=y+h;
			add(tx[i]);
		}
		show();
	} 
}