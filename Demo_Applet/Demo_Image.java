import java.applet.*;
import java.awt.*;
import java.net.*;
/*<applet code="Demo_Image" codebase="./" width=400 height=400>

	<param name="Img_no" value="10">
	<param name="Speed" value="1000">
	<param name="Image1" value="1.jpg">	
	<param name="Image2" value="2.jpg">	
	<param name="Image3" value="3.jpg">	
	<param name="Image4" value="4.jpg">	
	<param name="Image5" value="5.jpg">	
	<param name="Image6" value="6.jpg">	
	<param name="Image7" value="7.jpg">	
	<param name="Image8" value="8.jpg">	
	<param name="Image9" value="9.jpg">	
	<param name="Image10" value="10.jpg">		

</applet>*/
public class Demo_Image extends Applet implements Runnable
{
	Image img;
	Thread th;	
	String path,pro;
	String img_list[];
	int index,img_count,speed;
	public void init()
	{
		th=new Thread(this);	
		index=0;
		speed=Integer.parseInt(getParameter("Speed"));
		img_count=Integer.parseInt(getParameter("img_no"));
		img_list=new String[img_count];
		
		for(int i=0;i<img_count;i++)
		{
			try
			{
				img_list[i]=new String(getParameter("Image"+(i+1)));
			}
			catch(Exception ex)
			{
				System.out.println("ex_img"+ex);
			}
			
		}
		try
		{
			path=getDocumentBase().toString();
			img=getImage(getDocumentBase(),img_list[index]);
		}
		catch(Exception ex)
		{
				System.out.println("ex_img"+ex);
		}
		th.start();
		
	}
	public void run()
	{
		for(;;)
		{
			
			if(index>img_count-1)
			index=0;
			try
			{
				path=getCodeBase().toString();
				img=getImage(getDocumentBase(),img_list[index]);
			}
			catch(Exception ex)
			{
				System.out.println("ex_img"+ex);
			}		
			repaint();	
			try
			{
				th.sleep(speed);
			}
			catch(Exception ex)
			{
				System.out.println("ex"+ex);
			}
			
			index++;			
		}	
	}	
	public void paint(Graphics g)
	{
		g.drawString("Accessing " +path,10,10);
		g.drawImage(img,10,20,this);
	}
}

		