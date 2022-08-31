import java.io.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.basic.*;
import javax.swing.event.*;
class FileExplorer extends JFrame
{
	File []rootdirs;
	JTree sys;
	
	DefaultMutableTreeNode root;
	JScrollPane jsp;
	int h,v;
	MouseListener ml;
	TreePath selPath;
	DefaultMutableTreeNode cur_node;
	String selected_path;
	//MainApp main_app;
	FileExplorer()
	{	
		//this.main_app=obj;
		setSize(300,300);
		setVisible(true);
		setLayout(new BorderLayout());
		selected_path=new String("c:/");

		root=new DefaultMutableTreeNode("ROOTS");
		sys=new JTree(root);
		
		h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		//////////////////
		
 		//////////////////
		jsp=new JScrollPane(sys,v,h);
		sys.setRootVisible(true);
		
		rootdirs=File.listRoots();
		for(int i=0;i<rootdirs.length;i++)
		{
			DefaultMutableTreeNode temp=new DefaultMutableTreeNode(rootdirs[i]);
			root.add(temp);
			temp.add(new DefaultMutableTreeNode(""));
			
		}
		
		add(jsp,BorderLayout.CENTER);
		
		
		show();

		ml = new MouseAdapter() 
		{
			
			public void mouseReleased(MouseEvent e) 
			{
				
				int selRow = sys.getRowForLocation(e.getX(), e.getY());
				TreePath selPath = sys.getClosestPathForLocation(e.getX(), e.getY());
				if(selPath!=null)
				{
					
					String path=selPath.toString();	
					path=path.replaceAll(", ","/");
					path=path.substring(path.indexOf("/")+1,path.length());
					path=path.replace(']',' ');
					path=path.replace('\\','/');
					sys.setSelectionPath(selPath);
					cur_node=(DefaultMutableTreeNode)sys.getLastSelectedPathComponent();
					explore(path,cur_node);	
			
					System.out.println("path"+path);
					selected_path=path;
						
				}
				
				
     		}
		};
		sys.addMouseListener(ml);
		
		
	}
	void explore(String path,DefaultMutableTreeNode cur_node)
	{
		File cur=new File(path);
		String list[]=cur.list();
		System.out.println(cur);
		if(list!=null)
		{
			cur_node.removeAllChildren();
			for(int i=0;i<list.length;i++)
			{
			
				DefaultMutableTreeNode temp=new DefaultMutableTreeNode(list[i]);
				cur_node.add(temp);
				
				File ff=new File(cur.getPath().trim()+list[i]);
				String li[]=ff.list();
				if(ff.isDirectory())
				temp.add(new DefaultMutableTreeNode(""));
				
			
			}
		}
		
		sys.updateUI();
		jsp.updateUI();
		//main_app.right_pane.setTitle("Exploring [ "+path+" ]");
		//main_app.right_pane.path=path;
		//main_app.right_pane.setFilter(main_app.w_mode);
		//main_app.right_pane.showList(list);
		
				
	}
	public static void main(String a[])
	{
		new FileExplorer();
	}
	
}	