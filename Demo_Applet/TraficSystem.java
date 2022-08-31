import java.awt.*;
import java.applet.*;
/*<applet code=TraficSystem.class 
		  width=1630
		  height=1000>
</applet>*/
public class TraficSystem extends Applet implements Runnable
{
	Thread t1,t2;
	int i=0,q=1;
	int count1=1,c1,z=14,y=29,w=44;
	int z2=14,y2=29,w2=44,z3=14,y3=29,w3=44,z4=14,y4=29,w4=44;
	public void paint(Graphics g)
	
	{	
		Font f=new Font("Arial",Font.BOLD,50);
		g.drawOval(600,300,400,400);
		Color c2=new Color(160,160,160);//grey
		g.setColor(c2);
		g.fillRect(10,375,1600,250);
		g.fillRect(675,10,250,950);
		Color c4=new Color(192,192,192);
		g.setColor(c4.brighter());
		int m,k=0;
		for(m=0;m<=26;m++)
		{
			g.fillRect(10+k,500,50,5);
			k=k+80;
		}
		k=0;
		for(m=0;m<=11;m++)
		{
			g.fillRect(795,10+k,5,48);
			k=k+80;
		}
		g.setColor(Color.black);
		Color yel=new Color(204,204,0);
		Color gr=new Color(0,102,0);
		Color cl=new Color(134,7,7);
		g.drawRect(10,10,1600,950);//boarder outline
		g.drawRect(10,375,1600,250);//road outline
		g.drawRect(675,10,250,950);//road outline
		g.setColor(c2);
		g.fillOval(600,300,400,400);
		g.setColor(Color.black);
		g.fillRect(975,375,34,136);
		g.setColor(cl.darker());
		g.fillOval(975,375,34,34);
		g.setColor(yel.darker());
		g.fillOval(975,409,34,34);
		g.setColor(gr.darker());
		g.fillOval(975,443,34,34);
		g.setColor(Color.black.darker());
		g.fillRect(975,477,34,34);
		g.setColor(Color.black.brighter());
		g.fillRect(625,489,34,136);
		g.setColor(cl.darker());
		g.fillOval(625,489,34,34);
		g.setColor(yel.darker());
		g.fillOval(625,523,34,34);
		g.setColor(gr.darker());
		g.fillOval(625,557,34,34);
		g.setColor(Color.black.darker());
		g.fillRect(625,591,34,34);
		g.setColor(Color.black.brighter());
		g.fillRect(665,360,136,34);
		g.setColor(cl.darker());
		g.fillOval(665,360,34,34);
		g.setColor(yel.darker());
		g.fillOval(699,360,34,34);
		g.setColor(gr.darker());
		g.fillOval(733,360,34,34);
		g.setColor(Color.black.darker());
		g.fillRect(767,360,34,34);
		g.setColor(Color.black.brighter());
		g.fillRect(790,625,136,34);
		g.setColor(cl.darker());
		g.fillOval(790,625,34,34);
		g.setColor(yel.darker());
		g.fillOval(824,625,34,34);
		g.setColor(gr.darker());
		g.fillOval(858,625,34,34);
		//g.fillOval(664,218,300,300);
		Color colors[]={Color.green,c2};
		if(count1==1)
		{	
				if(c1==1)
				{
				g.setColor(Color.green.brighter());
				g.fillOval(975,443,34,34);
				g.setColor(Color.red.brighter());
				g.fillOval(625,489,34,34);
				g.fillOval(665,360,34,34);
				//g.setColor(Color.yellow.brighter());
				g.fillOval(790,625,34,34);
				g.setFont(f);
				g.setColor(Color.green);
				g.drawString("GO",1020,450);
				g.fillRect(1100,428,50,8);
				int xp[]={1150,1150,1160};
				int yp[]={424,439,432};
				g.fillPolygon(xp,yp,3);
				Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
				g.setColor(Color.white);
				g.drawString(String.valueOf(z),980,495);
				g.drawString(String.valueOf(z),894,648);
				g.drawString(String.valueOf(y),628,610);
				g.drawString(String.valueOf(w),768,387);
				w--;
				y--;
				z--;
				}
				if(c1==2)
				{
					g.setColor(Color.green.brighter());
				g.fillOval(975,443,34,34);
				g.setColor(Color.red.brighter());
				g.fillOval(625,489,34,34);
				g.fillOval(665,360,34,34);
				g.setColor(Color.yellow.brighter());
				g.fillOval(824,625,34,34);
				g.setFont(f);
				
					g.setColor(Color.green);
					
				g.drawString("GO",1020,450);
				g.fillRect(1100,428,50,8);
				int xp[]={1150,1150,1160};
				int yp[]={424,439,432};
				g.fillPolygon(xp,yp,3);
				
				
					Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
					g.setColor(Color.white);
					g.drawString(String.valueOf(z),980,495);
					g.drawString(String.valueOf(z),894,648);
					g.drawString(String.valueOf(y),628,610);
					g.drawString(String.valueOf(w),768,387);
					w--;
					y--;
					z--;
				
				}
			
		}
		
		
		
		else if(count1==2)
		{
			if(c1==1)
			{
				g.setColor(Color.green.brighter());
			g.fillOval(858,625,34,34);
			g.setColor(Color.red.brighter());
			g.fillOval(665,360,34,34);
			g.fillOval(975,375,34,34);
			//g.setColor(Color.yellow.brighter());
			g.fillOval(625,489,34,34);
			g.setFont(f);
			g.setColor(Color.green);
			g.drawString("GO",825,710);
			g.fillRect(860,720,8,50);
			int xp2[]={855,873,864};
			int yp2[]={770,770,778};
			g.fillPolygon(xp2,yp2,3);
			
				Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
				g.setColor(Color.white);
				g.drawString(String.valueOf(w2),980,495);
				g.drawString(String.valueOf(z2),894,648);
				g.drawString(String.valueOf(z2),628,610);
				g.drawString(String.valueOf(y2),768,387);
				w2--;
				y2--;
				z2--;
			}
			if (c1==2)
			{
			g.setColor(Color.green.brighter());
			g.fillOval(858,625,34,34);
			g.setColor(Color.red.brighter());
			g.fillOval(665,360,34,34);
			g.fillOval(975,375,34,34);
			g.setColor(Color.yellow.brighter());
			g.fillOval(625,523,34,34);	
			g.setFont(f);
			g.setColor(Color.green);
			g.drawString("GO",825,710);
			g.fillRect(860,720,8,50);
			int xp2[]={855,873,864};
			int yp2[]={770,770,778};
			g.fillPolygon(xp2,yp2,3);
			Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
				g.setColor(Color.white);
				g.drawString(String.valueOf(w2),980,495);
				g.drawString(String.valueOf(z2),894,648);
				g.drawString(String.valueOf(z2),628,610);
				g.drawString(String.valueOf(y2),768,387);
				w2--;
				y2--;
				z2--;
			}
			
			
		}
		else if(count1==3)
		{	
				if(c1==1)
				{
				g.setColor(Color.green.brighter());
				g.fillOval(625,557,34,34);
				g.setColor(Color.red.brighter());
				g.fillOval(975,375,34,34);
				g.fillOval(665,360,34,34);
				//g.setColor(Color.yellow.brighter());
				g.fillOval(790,625,34,34);
				g.setFont(f);
				g.setColor(Color.green);
				g.drawString("GO",540,568);
				g.fillRect(478,550,50,8);
				int xp3[]={478,478,464};
				int yp3[]={545,563,555};
				g.fillPolygon(xp3,yp3,3);
				
				Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
				g.setColor(Color.white);
				g.drawString(String.valueOf(y3),980,495);
				g.drawString(String.valueOf(w3),894,648);
				g.drawString(String.valueOf(z3),628,610);
				g.drawString(String.valueOf(z3),768,387);
				w3--;
				y3--;
				z3--;
				
				}
				if(c1==2)
				{
				g.setColor(Color.green.brighter());
				g.fillOval(625,557,34,34);
				g.setColor(Color.red.brighter());
				g.fillOval(975,375,34,34);
				//g.fillOval(665,360,34,34);
				g.setColor(Color.yellow.brighter());
				g.fillOval(699,360,34,34);	
				g.setFont(f);
				g.setColor(Color.green);
				g.drawString("GO",540,568);
				g.fillRect(478,550,50,8);
				int xp3[]={478,478,464};
				int yp3[]={545,563,555};
				g.fillPolygon(xp3,yp3,3);
				
				Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
				g.setColor(Color.white);
				g.drawString(String.valueOf(y3),980,495);
				g.drawString(String.valueOf(w3),894,648);
				g.drawString(String.valueOf(z3),628,610);
				g.drawString(String.valueOf(z3),768,387);
				w3--;
				y3--;
				z3--;
				}
			
			
		}
		 else if(count1==4)
		{
			if(c1==1)
			{
				g.setColor(Color.green.brighter());
			g.fillOval(733,360,34,34);
			g.setColor(Color.red.brighter());
			g.fillOval(625,489,34,34);
			g.fillOval(790,625,34,34);
			//g.setColor(Color.yellow.brighter());
			g.fillOval(975,375,34,34);
			g.setFont(f);
			g.setColor(Color.green);
			g.drawString("GO",695,335);
			g.fillRect(730,243,8,50);
			int xp4[]={725,743,734};
			int yp4[]={243,243,236};
			g.fillPolygon(xp4,yp4,3);
			Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
				g.setColor(Color.white);
				g.drawString(String.valueOf(z4),980,495);
				g.drawString(String.valueOf(y4),894,648);
				g.drawString(String.valueOf(w4),628,610);
				g.drawString(String.valueOf(z4),768,387);
				w4--;
				y4--;
				z4--;
			}
			if(c1==2)
			{
				g.setColor(Color.green.brighter());
			g.fillOval(733,360,34,34);
			g.setColor(Color.red.brighter());
			g.fillOval(625,489,34,34);
			g.fillOval(790,625,34,34);
			g.setColor(Color.yellow.brighter());
			g.fillOval(975,409,34,34);
			g.setFont(f);
			g.setColor(Color.green);
			g.drawString("GO",695,335);
			g.fillRect(730,243,8,50);
			int xp4[]={725,743,734};
			int yp4[]={243,243,236};
			g.fillPolygon(xp4,yp4,3);
			Font f1=new Font("Arial",Font.BOLD,24);
					g.setFont(f1);
				g.setColor(Color.white);
				g.drawString(String.valueOf(z4),980,495);
				g.drawString(String.valueOf(y4),894,648);
				g.drawString(String.valueOf(w4),628,610);
				g.drawString(String.valueOf(z4),768,387);
				w4--;
				y4--;
				z4--;
			}
			if(z4==-1||y4==14||w4==29)
				{
					z=14;y=29;w=44;
					z2=14;y2=29;w2=44;
					z3=14;y3=29;w3=44;
					z4=14;y4=29;w4=44;
				}
			
		}
	}
	public void start()
	{
		t1=new Thread(this);
		t1.start();
		
	}
	public void run()
	{
			for(i=0;i<=70;i++)
			{	
					if(i==61)
					{
						i=0;
					}
		
				if(i>=1&&i<=15)
				{	
					if(i>=1&&i<=12)
					{
						c1=1;
					}
					else c1=2;
					count1=1;
					if(c1==1)
					{
					repaint();
					try
					{
					Thread.sleep(500);
					}
					catch(InterruptedException ie)
					{
					System.out.println(ie);
					}
					//c1++;
					}
					else if(c1==2)
					{
						repaint();
							try
						{
						Thread.sleep(500);
						}
						catch(InterruptedException ie)
						{
						System.out.println(ie);
						}
					}
					if(i==12)
					{
						c1=2;
					}
				}
				
				
				else if(i>=16&&i<=30)
				{
					if(i>=16&&i<=27)
					{
						c1=1;
					}
					else c1=2;
					count1=2;
					if(c1==1)
					{
					repaint();
					try
					{
					Thread.sleep(500);
					}
					catch(InterruptedException ie)
					{
					System.out.println(ie);
					}
					
					}
					if(c1==2)
					{
						repaint();
							try
						{
						Thread.sleep(500);
						}
						catch(InterruptedException ie)
						{
						System.out.println(ie);
						}
					}
					
					//repaint();
				}
				
				
				else if(i>=31&&i<=45)
				{
					if(i>=31&&i<=42)
					{
						c1=1;
					}
					else c1=2;
					count1=3;
					//repaint();
					if(c1==1)
					{
					repaint();
					try
					{
					Thread.sleep(500);
					}
					catch(InterruptedException ie)
					{
					System.out.println(ie);
					}
					//c1++;
					}
					if(c1==2)
					{
						repaint();
							try
						{
						Thread.sleep(500);
						}
						catch(InterruptedException ie)
						{
						System.out.println(ie);
						}
					}
					
				}
				else if(i>=46&&i<=60)
				{
					if(i>=46&&i<=57)
					{
						c1=1;
					}
					else c1=2;
				
					count1=4;
					if(c1==1)
					{
					repaint();
					try
					{
					Thread.sleep(500);
					}
					catch(InterruptedException ie)
					{
					System.out.println(ie);
					}
					
					}
					if(c1==2)
					{
						repaint();
							try
						{
						Thread.sleep(500);
						}
						catch(InterruptedException ie)
						{
						System.out.println(ie);
						}
					}
					
				}
			}
		
	}
} 
