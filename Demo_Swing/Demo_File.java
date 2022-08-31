import java.io.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
class Demo_File extends JFrame
{
	File[] rootdirs;
	JTree sys;
	Demo_File()
	{	
		setSize(300,300);
		setVisible(true);
		setLayout(new BorderLayout());
		
		rootdirs = File.listRoots();
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("ROOTS");
		DefaultMutableTreeNode roots[]=new DefaultMutableTreeNode[rootdirs.length];
		
		int min=0;
		int max=rootdirs.length;
		String message[]=new String[1];
		message[0]="Fetching Directory Structure...";
		ProgressMonitor progress=new ProgressMonitor(null,message,"Completed",min,max);
		
		for(int i=0;i<rootdirs.length;i++)
		{
			roots[i]=new DefaultMutableTreeNode(rootdirs[i]);
			root.add(roots[i]);
			try
			{
				browse(roots[i],rootdirs[i]);	
				int per=(int)(((double)i/(double)rootdirs.length)*100.0);
				
				progress.setNote("Completed:["+per+"%]");
				progress.setProgress(i);
				repaint();
			}
			catch(Exception ne)
			{
				System.out.println("in main" +ne);	
			}
		}
		progress.close();
		//	System.out.println(rootdirs[i]);
		//JFileChooser jf=new JFileChooser(rootdirs[3]);
		//add(jf);
			
		sys=new JTree(root);
		
		int h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(sys,v,h);
		//jsp.set
	
		add(jsp,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		show();
	}
	void browse(DefaultMutableTreeNode rt,File cur) throws Exception
	{
		String ss[]=cur.list();
		if(cur!=null&&ss!=null&&cur.isDirectory())
		{
			String cur_list[]=cur.list();
////////////////////////////////////////////////////////////////////////
			String f_list[]=new String[cur_list.length];
			String d_list[]=new String[cur_list.length];

			int ind_f=0,ind_d=0;
			for(int i=0;i<cur_list.length;i++)
			{
				File ff=new File(cur.getPath()+"/"+cur_list[i]);
				if(!ff.isDirectory())
				{
					f_list[ind_f]=cur_list[i];
					ind_f++;

				}
				else
				{
					d_list[ind_d]=cur_list[i];
					ind_d++;
				}
			}
			
			///////////////////filtering files
			for(int i=0;i<ind_f;i++)
			{
				DefaultMutableTreeNode cur_node=new DefaultMutableTreeNode(f_list[i]);
				rt.add(cur_node);		
			}
			/////////////exploring directories
			for(int i=0;i<ind_d;i++)
			{
				DefaultMutableTreeNode cur_node=new DefaultMutableTreeNode(d_list[i]);
				rt.add(cur_node);		
				File cur_file=new File(cur.getPath()+"/"+d_list[i]);	
				try
				{
					browse(cur_node,cur_file);	
				}
				catch(Exception ne)
				{
					System.out.println("in Browse" +ne);	
				}
			
		
			}
			///////////////////////

		}
	}
	public static void main(String a[])
	{
		new Demo_File();
	}
}
	