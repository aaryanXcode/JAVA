import java.awt.*;
import java.applet.*;
/* <applet code="Demo_TextComponent.class" width=300 height=300> </applet> */
public class Demo_TextComponent extends Applet
{
	TextField tx;
	TextArea ta;
        public void init()
        {
		ta=new TextArea("Hiiiiiii",10,50);
		ta.setEditable(false);
		tx=new TextField(20);
		tx.setEchoChar('#');
                		add(ta);
               		add(tx);
                
        }

}

