import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class tableTree extends JFrame
{
	JScrollPane scrollpane;
	JTree tree;
	String v;
	DefaultMutableTreeNode Tables,table1,table2,table3,table4,table5,table6,table7,table8,table9,table10;
	DefaultMutableTreeNode t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,value1,value2,value3,value4,value5,value6,value7,value8,value9,value10;
	tableTree()
	{
		super("Table Tree");
		setSize(400,400);
		
		table1=new DefaultMutableTreeNode("Table of 1");
		
		for(int i=1;i<=10;i++)
		{
			t1=new DefaultMutableTreeNode("1*"+i+"");
			value1=new DefaultMutableTreeNode("="+1*i+"");
			t1.add(value1);
			
			table1.add(t1);
		}
		
		
		table2=new DefaultMutableTreeNode("Table of 2");
		for(int i=1;i<=10;i++)
		{
			t2=new DefaultMutableTreeNode("2*"+i+"");
			value2=new DefaultMutableTreeNode("="+2*i+"");
			t2.add(value2);
			table2.add(t2);
		}
		
		
		table3=new DefaultMutableTreeNode("Table of 3");
		for(int i=1;i<=10;i++)
		{
			t3=new DefaultMutableTreeNode("3*"+i+"");
			value3=new DefaultMutableTreeNode("="+3*i+"");
			t3.add(value3);
			table3.add(t3);
		}
		
		table4=new DefaultMutableTreeNode("Table of 4");
		for(int i=1;i<=10;i++)
		{
			t4=new DefaultMutableTreeNode("4*"+i+"");
			value4=new DefaultMutableTreeNode("="+4*i+"");
			t4.add(value4);
			table4.add(t4);
		}
		
		table5=new DefaultMutableTreeNode("Table of 5");
		for(int i=1;i<=10;i++)
		{
			t5=new DefaultMutableTreeNode("5*"+i+"");
			value5=new DefaultMutableTreeNode("="+5*i+"");
			t5.add(value5);
			table5.add(t5);
		}
		
		table6=new DefaultMutableTreeNode("Table of 6");
		for(int i=1;i<=10;i++)
		{
			t6=new DefaultMutableTreeNode("6*"+i+"");
			value6=new DefaultMutableTreeNode("="+6*i+"");
			t6.add(value6);
			table6.add(t6);
		}
		
		table7=new DefaultMutableTreeNode("Table of 7");
		for(int i=1;i<=10;i++)
		{
			t7=new DefaultMutableTreeNode("7*"+i+"");
			value7=new DefaultMutableTreeNode("="+7*i+"");
			t7.add(value7);
			table7.add(t7);
		}
		
		table8=new DefaultMutableTreeNode("Table of 8");
		for(int i=1;i<=10;i++)
		{
			t8=new DefaultMutableTreeNode("8*"+i+"");
			value8=new DefaultMutableTreeNode("="+8*i+"");
			t8.add(value8);
			table8.add(t8);
		}
		
		table9=new DefaultMutableTreeNode("Table of 9");
		for(int i=1;i<=10;i++)
		{
			t9=new DefaultMutableTreeNode("9*"+i+"");
			value9=new DefaultMutableTreeNode("="+9*i+"");
			t9.add(value9);
			table9.add(t9);
		}
		
		table10=new DefaultMutableTreeNode("Table of 10");
		for(int i=1;i<=10;i++)
		{
			t10=new DefaultMutableTreeNode("10*"+i+"");
			value10=new DefaultMutableTreeNode("="+10*i+"");
			t10.add(value10);
			table10.add(t10);
		}
		
		Tables=new DefaultMutableTreeNode("Tables");
		Tables.add(table1);
		Tables.add(table2);
		Tables.add(table3);
		Tables.add(table4);
		Tables.add(table5);
		Tables.add(table6);
		Tables.add(table7);
		Tables.add(table8);
		Tables.add(table9);
		Tables.add(table10);
		
		tree=new JTree(Tables);
		
		int h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		scrollpane =new JScrollPane(tree,v,h);
		scrollpane.setBackground(Color.red);
		add(scrollpane);
		show();
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new tableTree();
	}
}