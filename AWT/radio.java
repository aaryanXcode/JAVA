import java.awt.*;
import java.applet.*;
public class radio extends Applet
{
	Checkbox ch11,ch12,ch21,ch22;
	String s;
	CheckboxGroup cb1,cb2;
        	public void init()
        	{
	
		cb1=new CheckboxGroup();
		cb2=new CheckboxGroup();	
                	ch11= new Checkbox("Hindi",true,cb1);
                	ch12= new Checkbox("English",true,cb1);
                	ch21= new Checkbox("Math",false,cb1);
                	ch22= new Checkbox("Physics",false,cb1);
                	add(ch11);
                	add(ch12);
                	add(ch21);
                	add(ch22);
	
        }
/* <applet code="radio.class" width=300 height=300> </applet> */
}

