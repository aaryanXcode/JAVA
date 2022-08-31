import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class Demo_JTree extends JFrame
{
	JTree tree;
	DefaultMutableTreeNode ind,pak,team;
	Demo_JTree()
	{
		super("Demo JTREE");
		
		setSize(400,400);
		//Color c=new Color();
		//ind=new DefaultMutableTreeNode("INDIA");
		//pak=new DefaultMutableTreeNode("PAKISTAN");		
		
		//ind.add(new DefaultMutableTreeNode("SACHIN"));
		//ind.add(new DefaultMutableTreeNode("SOURAV"));
		//ind.add(new DefaultMutableTreeNode("DRAVID"));

		//pak.add(new DefaultMutableTreeNode("INZAMAM"));
		//pak.add(new DefaultMutableTreeNode("SHOAIB"));
		//pak.add(new DefaultMutableTreeNode("SHAHID"));

                for(int i=0; i<10; i++)
                {
                    i=new DefaultMutableTreeNode(i);
                }               

		
		team=new DefaultMutableTreeNode("tree");
 
                for(int i=0; i<10; i++)
                {
                     team.add(i);
                }		
		
		//team.add(ind);
		//team.add(pak);

		tree=new JTree(team);
		int h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(tree,v,h);
		jsp.setBackground(Color.red);
		add(jsp);
		show();
		setVisible(true);
	}
	public static void main(String a[])
	{
		new Demo_JTree();
	}

}