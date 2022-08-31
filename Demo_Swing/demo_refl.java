import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.lang.reflect.*;
class demo_refl extends JFrame implements ActionListener
{
	JTextField text;
	JButton jb;
	JScrollPane jsp;
	JTree tr;
	Container contantPane;
	boolean f_time;
	DefaultMutableTreeNode pak;
	demo_refl()
	{	
		
		f_time=true;
		text=new JTextField("ENTER PAKAGE NAME",30);
		jb=new JButton("L I S T");
		
		setLayout(new BorderLayout());
		
		JPanel jp=new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(text);
		jp.add(jb);
		add(jp,BorderLayout.NORTH);
		
		setSize(600,600);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		pak=new DefaultMutableTreeNode("PACKAGE");
		tr=new JTree(pak);
		jsp=new JScrollPane(tr,v,h);
		
		add(jsp,BorderLayout.CENTER);		
		jsp.updateUI();
		jb.addActionListener(this);
		show();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		
		pak.removeAllChildren();
		DefaultMutableTreeNode c_pack=new DefaultMutableTreeNode("Exploring Package :["+text.getText()+"]");
		DefaultMutableTreeNode cl=new DefaultMutableTreeNode("CLASSES");
		
		DefaultMutableTreeNode cons=new DefaultMutableTreeNode("Constuctor's");
		c_pack.add(cl);
		c_pack.add(cons);
		DefaultMutableTreeNode method=new DefaultMutableTreeNode("Method's");
		c_pack.add(method);
		pak.add(c_pack);
//////////////////////////methods and contructors added hear
		try
		{
			Class c=Class.forName(text.getText().trim());
				
			Class co1[]=c.getClasses();
			for(int i=0;i<co1.length;i++)
				cl.add(new DefaultMutableTreeNode("["+i+"]"+co1[i]));				
	
			Constructor co[]=c.getConstructors();
			for(int i=0;i<co.length;i++)
				cons.add(new DefaultMutableTreeNode("["+i+"]"+co[i]));				
	
			Method m[]=c.getMethods();
			for(int i=0;i<m.length;i++)
				method.add(new DefaultMutableTreeNode("["+i+"]"+m[i]));				
			
		}
		catch(Exception e)
		{
			cons.add(new DefaultMutableTreeNode("PAKAGE NOT FOUND"));
			method.add(new DefaultMutableTreeNode("PAKAGE NOT FOUND"));
		}



	
		tr.updateUI();
		jsp.updateUI();	
		
				
	}		
	public static void main(String s[])
	{
		new demo_refl();
	}
}	




















