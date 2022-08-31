import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class Demo_JTree extends JFrame
{
	JScrollPane scrollpane;
	JTree tree;
	DefaultMutableTreeNode Rungta,Course,Btech,BSC,BCA,BBA,Branch,semesterBCA,semesterBSC,semesterBBA,semesterCivil,semesterIT,semesterCSE,CSE,IT,civil;
	Demo_JTree()
	{
		super("Rungta students");
		setSize(400,400);
		semesterIT=new DefaultMutableTreeNode("semester");
		
		semesterIT.add(new DefaultMutableTreeNode("Semester 1"));
		semesterIT.add(new DefaultMutableTreeNode("semester 2"));
		semesterIT.add(new DefaultMutableTreeNode("semester 3"));
		semesterIT.add(new DefaultMutableTreeNode("semester 4"));
		semesterIT.add(new DefaultMutableTreeNode("semester 5"));
		semesterIT.add(new DefaultMutableTreeNode("semester 6"));
		semesterIT.add(new DefaultMutableTreeNode("semester 7"));
		semesterIT.add(new DefaultMutableTreeNode("semester 8"));
		
		IT=new DefaultMutableTreeNode("IT");
		IT.add(semesterIT);
		
		
		semesterCSE=new DefaultMutableTreeNode("semester");
		
		semesterCSE.add(new DefaultMutableTreeNode("Semester 1"));
		semesterCSE.add(new DefaultMutableTreeNode("semester 2"));
		semesterCSE.add(new DefaultMutableTreeNode("semester 3"));
		semesterCSE.add(new DefaultMutableTreeNode("semester 4"));
		semesterCSE.add(new DefaultMutableTreeNode("semester 5"));
		semesterCSE.add(new DefaultMutableTreeNode("semester 6"));
		semesterCSE.add(new DefaultMutableTreeNode("semester 7"));
		semesterCSE.add(new DefaultMutableTreeNode("semester 8"));
		CSE=new DefaultMutableTreeNode("CSE");
		CSE.add(semesterCSE);
		
		
		semesterCivil=new DefaultMutableTreeNode("semester");
		
		semesterCivil.add(new DefaultMutableTreeNode("Semester 1"));
		semesterCivil.add(new DefaultMutableTreeNode("semester 2"));
		semesterCivil.add(new DefaultMutableTreeNode("semester 3"));
		semesterCivil.add(new DefaultMutableTreeNode("semester 4"));
		semesterCivil.add(new DefaultMutableTreeNode("semester 5"));
		semesterCivil.add(new DefaultMutableTreeNode("semester 6"));
		semesterCivil.add(new DefaultMutableTreeNode("semester 7"));
		semesterCivil.add(new DefaultMutableTreeNode("semester 8"));
		civil=new DefaultMutableTreeNode("civil");
		civil.add(semesterCivil);
		
		
		Branch=new DefaultMutableTreeNode("Branch");
		Branch.add(IT);
		Branch.add(CSE);
		Branch.add(civil);
		
		Btech=new DefaultMutableTreeNode("Btech");
		Btech.add(Branch);
		
		semesterBSC=new DefaultMutableTreeNode("semester");
		
		semesterBSC.add(new DefaultMutableTreeNode("Semester 1"));
		semesterBSC.add(new DefaultMutableTreeNode("semester 2"));
		semesterBSC.add(new DefaultMutableTreeNode("semester 3"));
		semesterBSC.add(new DefaultMutableTreeNode("semester 4"));
		semesterBSC.add(new DefaultMutableTreeNode("semester 5"));
		semesterBSC.add(new DefaultMutableTreeNode("semester 6"));
		BSC=new DefaultMutableTreeNode("BSC");
		BSC.add(semesterBSC);
		
		
		semesterBCA=new DefaultMutableTreeNode("semester");
		
		semesterBCA.add(new DefaultMutableTreeNode("Semester 1"));
		semesterBCA.add(new DefaultMutableTreeNode("semester 2"));
		semesterBCA.add(new DefaultMutableTreeNode("semester 3"));
		semesterBCA.add(new DefaultMutableTreeNode("semester 4"));
		semesterBCA.add(new DefaultMutableTreeNode("semester 5"));
		semesterBCA.add(new DefaultMutableTreeNode("semester 6"));
		BCA=new DefaultMutableTreeNode("BCA");
		BCA.add(semesterBCA);
		
		
		semesterBBA=new DefaultMutableTreeNode("semester");
		
		semesterBBA.add(new DefaultMutableTreeNode("Semester 1"));
		semesterBBA.add(new DefaultMutableTreeNode("semester 2"));
		semesterBBA.add(new DefaultMutableTreeNode("semester 3"));
		semesterBBA.add(new DefaultMutableTreeNode("semester 4"));
		semesterBBA.add(new DefaultMutableTreeNode("semester 5"));
		semesterBBA.add(new DefaultMutableTreeNode("semester 6"));
		BBA=new DefaultMutableTreeNode("BBA");
		BBA.add(semesterBBA);
		
		Course=new DefaultMutableTreeNode("Course");
		Course.add(Btech);
		Course.add(BSC);
		Course.add(BBA);
		Course.add(BCA);
		
		Rungta=new DefaultMutableTreeNode("Rungta college");
		Rungta.add(Course);
		
		tree=new JTree(Rungta);
		
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
		new Demo_JTree();
	}
}