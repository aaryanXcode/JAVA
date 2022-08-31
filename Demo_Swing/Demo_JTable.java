import java.awt.*;

import javax.swing.*;
//import javax.swing.tree.*;

class Demo_JTable extends JFrame 
{
	
	
	JScrollPane jsp;
	
	
	Container contantPane;
	Demo_JTable()
	{	
		//setLayout(new FlowLayout());
	
		setSize(400,400);
		Object tab[][]=new Object[10][10];
		Object t_h[]=new Object[10];
		for(int i=0;i<10;i++)
		{
			t_h[i]=new Object();
			t_h[i]=i+1;
			for(int j=0;j<10;j++)
			{
				tab[i][j]=new Object();
				tab[i][j]=(j+1)*(i+1);
			}
		}
		JTable jtb=new JTable(tab,t_h);

		int v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		int h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		jtb.setAutoResizeMode(3);
			//jtb.setShowHorizontalLines(false);
			//jtb.setShowVerticalLines(false);
		jtb.sizeColumnsToFit(true);
		jsp=new JScrollPane(jtb,v,h);
		
		
		add(jsp);		
		
		
	
		show();	
		
				
	}		
	public static void main(String s[])
	{
		new Demo_JTable();
	}
}	




















