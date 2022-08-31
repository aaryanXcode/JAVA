import javax.swing.*;
import java.awt.*;
public class radioButton extends JFrame
{
	JRadioButton rb1,rb2,rb3,rb4;
	radioButton()
	{
		setSize(200,200);
		setLayout(new FlowLayout());
		rb1=new JRadioButton("a");
		rb2=new JRadioButton("b");
		rb3=new JRadioButton("c");
		rb4=new JRadioButton("d");
		
		ButtonGroup rbg1=new ButtonGroup();
		ButtonGroup rbg2=new ButtonGroup();
		
		/*
		rbg1.add(rb1);
		rbg1.add(rb2);
		rbg1.add(rb3);
		rbg1.add(rb4);
		*/
		
		rbg1.add(rb1);
		rbg1.add(rb2);
		rbg2.add(rb3);
		rbg2.add(rb4);
		
		
		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		show();
	}
	public static void main(String args[])
	{
		new radioButton();
	}
}
		
		
		//rb=radioButton
		//rbg=Button group