import java.awt.*;
import javax.swing.*;
public class Demo_CheckBox extends JFrame
{
	JCheckBox chb1,chb2;
	Demo_CheckBox()
	{
		setSize(200,200);
		setLayout(new FlowLayout());
		
		chb1=new JCheckBox("option1",true);	
		/*
		JCheckBox(String text, boolean selected)
		1Creates a check box with text and specifies whether or not it is initially selected.
		*/
		chb1.setBackground(Color.white);
		chb1.setForeground(Color.blue);
		chb1.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,20));
		
		chb2=new JCheckBox("option2");
		chb2.setBackground(Color.white);
		chb2.setForeground(Color.blue);
		chb2.setFont(new Font("ArialNarrow",Font.BOLD+Font.ITALIC,20));
		
		add(chb1);
		add(chb2);
		show();
	}
	public static void main(String args[])
	{
		new Demo_CheckBox();
	}
}
		
	