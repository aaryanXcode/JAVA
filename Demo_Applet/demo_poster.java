/*
	<applet code="demo_poster.class"  width=400 height=600>
		<param name="txt" value="Java 7-8 Batch  is full of Goodness but..">

		<param name="font_name" value="Calibari">

		<param name="font_style" value="PLAIN">

		<param name="font_size" value="40">	
	
		<param name="font_g" value="255">		
		<param name="font_b" value="0">		
		<param name="font_r" value="05">	
	
		<param name="back_r" value="255">		
		<param name="back_g" value="122">		
		<param name="back_b" value="00">		
	</applet>

*/
import java.applet.*;
import java.awt.*;

public class demo_poster extends Applet
{
	String text,f_name,f_style;
	int f_size,f_red,f_green,f_blue;	
	int b_red,b_green,b_blue;	
	public void init()
	{
		System.out.println("DD");
	
		text=getParameter("txt");
		f_name=getParameter("font_name");
		f_style=getParameter("font_style");

		try
		{
			f_size=Integer.parseInt(getParameter("font_size"));
		}
		catch(NumberFormatException e)
		{
			f_size=10;	
		}
		try
		{
			f_red=Integer.parseInt(getParameter("font_r"));
		}
		catch(NumberFormatException e)
		{
			
			f_red=1;
			System.out.println("Dd");
		}
		try
		{
			f_green=Integer.parseInt(getParameter("font_g"));
		}
		catch(NumberFormatException e)
		{
			f_green=10;	
		}
		try
		{
			f_blue=Integer.parseInt(getParameter("font_b"));
		}
		catch(NumberFormatException e)
		{
			f_blue=10;	
		}
		
		b_red=Integer.parseInt(getParameter("back_r"));
		b_green=Integer.parseInt(getParameter("back_g"));
		b_blue=Integer.parseInt(getParameter("back_b"));

		Color c=new Color(b_red,b_green,b_blue);		

		setBackground(c);		
	
	}
	public void paint(Graphics g)
	{
		int st=0;
		if(f_style.toUpperCase().equals("BOLD"))
			st=Font.BOLD;
		else if(f_style.toUpperCase().equals("ITALIC"))		
			st=Font.ITALIC;
		else if(f_style.toUpperCase().equals("PLAIN"))		
			st=Font.PLAIN;
		
		try
		{
			Font f=new Font(f_name,st,f_size);
			g.setFont(f);
		}
		catch(Exception e)
		{
			g.drawString("Exception : "+ e,100,150);						
		}
		
		Color c=new Color(f_red,f_green,f_blue);		

		g.setColor(c);
		g.drawString(text ,100,100);
	}
}