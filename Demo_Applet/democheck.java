import java.awt.*;
import java.applet.*;
public class democheck extends Applet
{
        Checkbox c1,ch12,ch21,ch22;
        String s;
        public void init()
        {
                c1= new Checkbox("Hindi",true);
                ch12= new Checkbox("English",true);
                ch21= new Checkbox("Math",false);
                ch22= new Checkbox("Physics",false);
                add(c1);
                add(ch12);
                add(ch21);
                add(ch22);
        }
/* <applet code="democheck.class" width=300 height=300> </applet> */
}

