import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Demo_JList extends JFrame
{
	JComboBox dropdown;
	JList list;
	Demo_JList()
	{
		setSize(400,400);
		setLayout(new FlowLayout());
		
		Vector data=new Vector();
		
		data.add("item1");
		data.add("item2");
		data.add("item3");
		data.add("item4");
		data.add("item5");
		list=new JList(data);
		dropdown=new JComboBox(data);
		add(list);
		add(dropdown);
		
		show();
	}
	public static void main(String args[])
	{
		new Demo_JList();
	}
}
		