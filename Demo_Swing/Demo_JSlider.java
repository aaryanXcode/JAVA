import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
class Demo_JSlider extends JFrame implements ChangeListener
{
	JSlider jp;
	JLabel l;
	Demo_JSlider()
	{	
		setSize(400,400);
		setVisible(true);
		jp=new JSlider(JSlider.HORIZONTAL,0,1000,100);
		jp.setMajorTickSpacing(100);
		jp.setMinorTickSpacing(5);
		jp.setPaintTicks(true);
		jp.setPaintLabels(true);
		setLayout(null);

		l=new JLabel("0");
		l.setBounds(300,250,100,50);
		jp.setBounds(100,100,800,100);
		add(jp);
		
		add(l);
		show();
		l.updateUI();
		jp.addChangeListener(this);
		
	}
	public void stateChanged(ChangeEvent e)
	{
		System.out.println("DSD");
		l.setText(jp.getValue()+"");
	}
	
	public static void main(String a[])
	{
		new Demo_JSlider();
	}
}	