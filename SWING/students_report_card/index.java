import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.tree.*;
import java.util.*;
import java.sql.*;
class index extends JFrame
{
	MouseListener ml;
	TreePath selPath;
	DefaultMutableTreeNode cur_node;
	String selected_path;
	Vector classData=new Vector();
	TreeMap<String, String> map = new TreeMap<>();
	Vector sectionData=new Vector();
	Vector studentData=new Vector();
	db DB=new db();
	JSplitPane js;
	JLabel heading;
	JPanel north,center,south;
	JScrollPane treeJSP;
	JScrollPane tableJSP;
	JTable table;
	JButton del,update,Add;
	JTree tree;
	Vector data;
	Vector cols;
	DefaultMutableTreeNode Rungta,classes,section;
	index()
	{
		setLayout(new BorderLayout());
		setSize(400,400);
		DB.getClassesInfo(classData,map);
		DB.getSectionInfo(sectionData);
		north=new JPanel();
		north.setLayout(new FlowLayout());
		
		heading=new JLabel("Rungta Public School");
		north.add(heading);
		
		center=new JPanel();
		center.setLayout(new FlowLayout());
		
		Rungta=new DefaultMutableTreeNode("Rungta public school");
		String s1=classData.toString();
		String s2=sectionData.toString();
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(sectionData.size());
		for(int i=0;i<classData.size();i++)
		{
			
			classes=new DefaultMutableTreeNode(classData.get(i)+"");
			for(int j=0;j<sectionData.size();j++)
			{
				section=new DefaultMutableTreeNode(sectionData.get(j)+"");
				classes.add(section);
			}
			
			Rungta.add(classes);
		}
		
		//tree and start left part
		/* class_8A=new DefaultMutableTreeNode("Section A");
		class_8B=new DefaultMutableTreeNode("Section B");
		
		class_8=new DefaultMutableTreeNode("class 8");                                                                 
		class_8.add(class_8A);
		class_8.add(class_8B);
		///
		class_9A=new DefaultMutableTreeNode("Section A");
		class_9B=new DefaultMutableTreeNode("Section B");
		
		class_9=new DefaultMutableTreeNode("class 9");
		class_9.add(class_9A);
		class_9.add(class_9B);
		
		////
		class_10A=new DefaultMutableTreeNode("Section A");
		class_10B=new DefaultMutableTreeNode("Section B");
		
		class_10=new DefaultMutableTreeNode("class 10");
		class_10.add(class_10A);
		class_10.add(class_10B); */
		////
		
		
		tree=new JTree(Rungta);
		
		int h1=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v1=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		treeJSP=new JScrollPane(tree,v1,h1);
		treeJSP.setBackground(Color.red);
		//end of left part
		//start of right part
		data=new Vector();
		cols=new Vector();
		
		cols.add("Name");
		cols.add("Rollno");
		cols.add("Physics");
		cols.add("chemistry");
		cols.add("Maths");
		cols.add("Total");
		cols.add("Percentage");
		cols.add("Division");
		
		for(int i=0;i<7;i++)
		{
			Vector row=new Vector();
			for(int j=0;j<=7;j++)
			{
				row.add("NULL");
			}
			data.add(row);
		}
		
		
		TableModel tb=new DefaultTableModel(data,cols);
		table=new JTable();
		table.setModel(tb);
		
		int v2=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		int h2=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		tableJSP=new JScrollPane(table,v2,h2);
		
		table.setColumnSelectionAllowed(true);
		table.setColumnSelectionInterval(0,2);
		table.setRowHeight(30);
		//end of right part 
		
		//adding left and right part
		js=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,treeJSP,tableJSP);
		js.setDividerSize(10);
		js.setDividerLocation(50);
		js.setOneTouchExpandable(true);
		center.add(js);
		
		south=new JPanel();
		south.setLayout(new FlowLayout());
		Add=new JButton("Add");
		del=new JButton("delete");
		update=new JButton("update");
		
		south.add(Add);
		south.add(del);
		south.add(update);                                                                                          
		add(north,BorderLayout.NORTH);	
		add(js,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		
		show();
		ml = new MouseAdapter() 
		{
			
			public void mouseReleased(MouseEvent e) 
			{
				
				int selRow = tree.getRowForLocation(e.getX(), e.getY());
				TreePath selPath = tree.getClosestPathForLocation(e.getX(), e.getY());
				if(selPath!=null)
				{
					
					String path=selPath.toString();	
					
					tree.setSelectionPath(selPath);
					cur_node=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
					
					System.out.println("path"+path);
					selected_path=path;
					//fillTable();
				}
				
				
     		}
		};
		tree.addMouseListener(ml);
		
	}
	public void fillTable()
	{
		
		String[] strArray = selected_path.split(",");  
		
	
		//System.out.println(strArray[1]+" "+strArray[2]);
		DB.getStudentData(studentData,strArray[1],strArray[2]);
	
	}
	public static void main(String args[])
	{
		new index();
	}
}
		