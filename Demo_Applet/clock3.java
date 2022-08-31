import java.awt.*;
import java.applet.*;
import java.io.*;
/*<APPLET code="clock3.class" height=400 width=400>
<param name="zone" value="India">
</APPLET>*/

public class clock3 extends Applet implements Runnable
{
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,tzone,meri;
	int SecStrt, SecEnd, MinStrt,MinEnd,HrStrt,HrEnd;
	Thread t;
	public void init()
	{
		Thread t =new Thread(this);
		s1=new String("12");
		s2=new String("1");
		s3=new String("2");
		s4=new String("3");
		s5=new String("4");
		s6=new String("5");
		s7=new String("6");
		s8=new String("7");
		s9=new String("8");
		s10=new String("9");
		s11=new String("10");	
		s12=new String("11");
		tzone=getParameter("zone");
		if(tzone.equalsIgnoreCase("India")||tzone.equalsIgnoreCase("Sri Lanka"))//5:30 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=-90;
			MinEnd=-270;
			HrStrt=-60;
			HrEnd=-240;
			meri="AM";
		}
		
		else if(tzone.equalsIgnoreCase("London")||tzone.equalsIgnoreCase("UK")||tzone.equalsIgnoreCase("Portugal")||tzone.equalsIgnoreCase("Ireland"))//12 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=90;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Canada"))//5 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-60;
			HrEnd=-240;
			meri="PM";
		}
		else if(tzone.equalsIgnoreCase("Mexico")||tzone.equalsIgnoreCase("Costa Rica"))//6 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-120;
			HrEnd=-240;
			meri="PM";
		}
		else if(tzone.equalsIgnoreCase("US")||tzone.equalsIgnoreCase("Ecuador")||tzone.equalsIgnoreCase("Colombia"))//7 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-90;
			HrEnd=-240;
			meri="PM";
		}
		else if(tzone.equalsIgnoreCase("Chile"))//8 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-150;
			HrEnd=-240;
			meri="PM";
		}
		else if(tzone.equalsIgnoreCase("Argentina"))//8:30 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=-90;
			MinEnd=-270;
			HrStrt=-150;
			HrEnd=-240;
			meri="PM";
		}
		else if(tzone.equalsIgnoreCase("Brazil")||tzone.equalsIgnoreCase("Uruguay"))//9 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-180;
			HrEnd=-240;
			meri="PM";
		}
		else if(tzone.equalsIgnoreCase("France")||tzone.equalsIgnoreCase("Denmark")||tzone.equalsIgnoreCase("Congo")||tzone.equalsIgnoreCase("Netherlands")||tzone.equalsIgnoreCase("Austria")||tzone.equalsIgnoreCase("Belgium")||tzone.equalsIgnoreCase("Cameroon")||tzone.equalsIgnoreCase("Czech Republic")||tzone.equalsIgnoreCase("Germany")||tzone.equalsIgnoreCase("Libya")||tzone.equalsIgnoreCase("Poland")||tzone.equalsIgnoreCase("Sweden")||tzone.equalsIgnoreCase("Switzerland")||tzone.equalsIgnoreCase("Spain")||tzone.equalsIgnoreCase("Vatican City"))//1 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=60;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Cape Verde"))//11 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-240;
			HrEnd=-240;
			meri="PM";
		}
		else if(tzone.equalsIgnoreCase("Egypt")||tzone.equalsIgnoreCase("Greece")||tzone.equalsIgnoreCase("South Africa")||tzone.equalsIgnoreCase("Turkey")||tzone.equalsIgnoreCase("Ukraine")||tzone.equalsIgnoreCase("Zimbabwe"))//2 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=30;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Iraq")||tzone.equalsIgnoreCase("Qatar")||tzone.equalsIgnoreCase("Saudi Arabia"))//3 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=0;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Iran"))//3:30 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=-90;
			MinEnd=-270;
			HrStrt=0;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Russia")||tzone.equalsIgnoreCase("UAE")||tzone.equalsIgnoreCase("Oman"))//4 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-30;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Afghanistan")||tzone.equalsIgnoreCase("Venezuela"))//4:30 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=-90;
			MinEnd=-270;
			HrStrt=-30;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Maldives")||tzone.equalsIgnoreCase("Pakistan"))//5 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-60;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Nepal"))//5:45 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=-180;
			MinEnd=-270;
			HrStrt=-90;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Kazakhstan")||tzone.equalsIgnoreCase("Bangladesh")||tzone.equalsIgnoreCase("Bhutan"))//6 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-90;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Myanmar"))//6:30 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=-90;
			MinEnd=-270;
			HrStrt=-90;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Cambodia")||tzone.equalsIgnoreCase("Thailand")||tzone.equalsIgnoreCase("Vietnam"))//7 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-120;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Indonesia")||tzone.equalsIgnoreCase("China")||tzone.equalsIgnoreCase("Malaysia")||tzone.equalsIgnoreCase("Singapore"))//8 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-150;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("North Korea")||tzone.equalsIgnoreCase("South Korea"))//9 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-180;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("Australia"))//10 am
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=-210;
			HrEnd=-240;
			meri="AM";
		}
		else if(tzone.equalsIgnoreCase("New Zealand"))//12 pm
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=90;
			HrEnd=-240;
			meri="PM";
		}
		else
		{
			SecStrt=90;
			SecEnd=-270;
			MinStrt=90;
			MinEnd=-270;
			HrStrt=90;
			HrEnd=-240;
			meri="AM";
		}
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				t.sleep(1000);
			}
			catch(Exception e)
			{
			}
			SecStrt=SecStrt-6;
			if(SecStrt<=SecEnd)
			{
				SecStrt=90;
				MinStrt=MinStrt-6;
				if(MinStrt<=MinEnd)
				{
					MinStrt=90;
					HrStrt=HrStrt-30;
					if(HrStrt<HrEnd)
					{
						HrStrt=90;
					}
				}
			}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillOval(50,38,300,300);
		g.setColor(Color.yellow);
		g.fillOval(60,48,280,280);
		g.setColor(Color.black);
		g.fillOval(65,53,270,270);
		g.setFont(new Font("Times",Font.BOLD,20));
		g.setColor(Color.white);
		g.fillOval(190,180,20,20);
		
		g.fillArc(100,92,200,200,SecStrt,2);
		g.fillArc(100,92,200,200,MinStrt,3);
		g.fillArc(126,120,150,150,HrStrt,4);

		g.drawString(s1,186,78);	//12
		g.drawString(s2,255,90);	//1
		g.drawString(s3,300,135);	//2
		g.drawString(s4,310,198);	//3
		g.drawString(s5,297,258);	//4
		g.drawString(s6,250,300);	//5
		g.drawString(s7,195,315);	//6
		g.drawString(s8,140,300);	//7
		g.drawString(s9,95,258);	//8
		g.drawString(s10,75,198);	//9
		g.drawString(s11,85,135);	//10
		g.drawString(s12,128,90);	//11
		g.drawString(meri,250,198);
		g.setColor(Color.black);
		g.drawString(tzone,160,370);
		
	}

}