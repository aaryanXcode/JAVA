import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.text.html.*;
import javax.swing.text.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.util.*;
class Demo_Editor_Pane extends JFrame
{	
	JEditorPane jp;
	JTextArea jtxt;
	JDesktopPane jdesk;
	Demo_Editor_Pane()
	{
		jdesk=new JDesktopPane();
		try
		{
			URL ur=new URL("file:/E:/java_b/Demo_Swing/LoginPage.htm");
			jp=new JEditorPane(ur);
		}
		catch(Exception e)
		{
			System.out.println(" "+e);
		}
		jp.setContentType("text/html");
		JToolBar jt=new JToolBar();
		ImageIcon img=new ImageIcon("./login.gif");
		setIconImage(img.getImage());
		jtxt=new JTextArea("ddddddddddddddddddd");
		getContentPane().setLayout(new BorderLayout());
    		jt.setBounds(100,200,300,400);

		JInternalFrame jt1=new JInternalFrame("sdd",true,true,true,true);
		jt1.setVisible(true);
		jt1.setSize(300,300);
		new UndoRedo(jp);
		JScrollPane scroller = new JScrollPane();
		JViewport vp = scroller.getViewport();
		vp.add(jp);
		scroller.setBounds(1,1,700,500);
		jt.add(jtxt);
            
		getContentPane().add(jt,BorderLayout.WEST);
		jt1.getContentPane().add(scroller);
		getContentPane().add(jt1,BorderLayout.CENTER);

		
		show();
		
	}
	public static void main(String a[])
	{
		new Demo_Editor_Pane();
	}
	
	 public HyperlinkListener createHyperLinkListener() 
	{
		return new HyperlinkListener() 
		{
	    		public void hyperlinkUpdate(HyperlinkEvent e) 
			{
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) 
				{
		    			if (e instanceof HTMLFrameHyperlinkEvent) 
					{	
						((HTMLDocument)jp.getDocument()).processHTMLFrameHyperlinkEvent((HTMLFrameHyperlinkEvent)e);
		    			} 
					else
					{
				//		try 
						{
			    				//jp.setPage(e.getURL());
							
						} 
					//	catch (IOException ioe) 
						{
						//    System.out.println("IOE: " + ioe);
							//jtxt.setText(jtxt.getText()+"\n"+ioe);
						}
		   			}
				}
	    		}
		};
    		
	}
	
} 	

class UndoRedo
{
	
	Hashtable action,act_index;
	int index;
	JEditorPane txt;
	public UndoRedo(JEditorPane txt)
	{
		action=new Hashtable();
		act_index=new Hashtable();
		index=0;
		this.txt=txt;
	}		 

	void recordAction(String act,String data)
	{
		index++;
		action.put(act,data);
		act_index.put(new String(index+""),new String(txt.getSelectionEnd()+""));	
	}
	String redoAction()
	{
		String ss=new String(index+"");
		Object xx=ss;	
		Object indx=act_index.get(ss);		
		Object act=action.get(indx);
		System.out.println(act.toString());
		//System.out.println(act);
		return("dd");
	}
	String getActionData()
	{
		return("dd");
	}
}