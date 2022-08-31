import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.applet.*;
import java.net.*;


import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.*;
import javax.swing.border.*;
import java.beans.*;
import javax.swing.plaf.metal.*;
//import javax.swing.plaf.skin.*;
import javax.swing.text.html.*;
import javax.accessibility.*;

class Demo_File_Chooser extends JFrame implements ActionListener	
{
	JEditorPane area;
	JMenu file,edit,theme;
	JMenuItem ne,open,save,save_as,exit;
	JMenuItem aqua,charcol,emreld,ruby,khaki;
	JMenuItem cut,copy,paste,f_color,b_color;
	JMenu colour;
	JMenuBar j_m_bar;
	JPanel jp;
	String current_path;
	JFileChooser j_f;
	JButton bnew;
	JScrollPane js;
	JPopupMenu jpop;
	Demo_File_Chooser()
	{
		super("Notepad[UNTITLED]");
		setSize(300,400);
		setVisible(true);
		ImageIcon img=new ImageIcon("login.gif");
		setIconImage(img.getImage());
		new JPanel().setDoubleBuffered(true);
		 try
		 {
            		javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(new javax.swing.plaf.metal.DefaultMetalTheme());
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}  
		catch (Exception e ) 
		{
		            System.out.println ("Metal Look & Feel not supported on this platform. \nProgram Terminated");
		            System.exit(0);
        		}
		
		///
		try
		{
			area=new RichTextArea();
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);

		}

		//area.setText(new javax.swing.plaf.metal.MetalLookAndFeel()+"");

		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;		
		js=new JScrollPane(area,v,h);	
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(js,BorderLayout.CENTER);

		j_m_bar=new JMenuBar();
		setJMenuBar(j_m_bar);

		file=new JMenu("File");
		ne=new JMenuItem("New");
		open=new JMenuItem("Open");
		save=new JMenuItem("Save");
		save_as=new JMenuItem("Save As");
		exit=new JMenuItem("Exit");
		file.setMnemonic('f');
		JMenuItem mi;
		file.add(ne);
		ne.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));

		file.add(open);
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));

		file.add(save);
		save.setMnemonic('s');
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));

		file.add(save_as);
		save_as.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		file.addSeparator();

		file.add(exit);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));

		edit=new JMenu("Edit");
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Compile");
		paste=new JMenuItem("Paste");
		colour=new  JMenu("Colour");
	
		f_color=new  JMenuItem("Font Color");
		b_color=new  JMenuItem("Background Color");
		colour.add(f_color);
		colour.add(b_color);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.addSeparator();
		edit.add(colour);
		theme=new JMenu("Theme");
		aqua=new JMenuItem("Aqua Theme");
		ruby=new JMenuItem("Ruby  Theme");
		emreld=new JMenuItem("Emreld Theme");
		charcol=new JMenuItem("charcol Theme");
		khaki=new JMenuItem("Khaki Theme");

		theme.add(ruby);
		theme.add(charcol);
		theme.add(aqua);
		theme.add(emreld);
		theme.add(khaki);

		j_m_bar.add(file);
		j_m_bar.add(edit);
		j_m_bar.add(theme);
		/************ToolBar Section**************/
		JToolBar  jtb=new JToolBar();
		bnew=new JButton(new ImageIcon("new.gif"));
		JButton bopen=new JButton(new ImageIcon("next.gif"));
		JButton bsave=new JButton(new ImageIcon("save.gif"));
		JButton bcut=new JButton(new ImageIcon("cut.gif"));
		JButton bcopy=new JButton(new ImageIcon("copy.gif"));
		JButton bpaste=new JButton(new ImageIcon("back.gif"));
       
	      	 jtb.add(bnew);
		jtb.add(bopen);
		 jtb.add(bsave);
		jtb.add(bcut);
		jtb.add(bcopy);
		jtb.add(bpaste);
		
		// jtb.add(pathlabel);
		jtb.setBorder(LineBorder.createGrayLineBorder());
     		getContentPane().add(jtb,BorderLayout.NORTH);
		getContentPane().add(new JLabel("dd"),BorderLayout.SOUTH);
    		 /*******************/

		bnew.addActionListener(this);
		aqua.addActionListener(this);
		ruby.addActionListener(this);
		emreld.addActionListener(this);
		charcol.addActionListener(this);
		khaki.addActionListener(this);
		
		ne.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);	
		save_as.addActionListener(this);
		exit.addActionListener(this);
		f_color.addActionListener(this);
		copy.addActionListener(this);
		//show();
		j_f=new JFileChooser();
		addWindowListener(new WindowAdapter()
				{
	
					public void windowClosing(WindowEvent as)
					{
						System.exit(0);
					}
				}				
					
				);

		show();
	/////////////Pop Demo
		
		jpop=new JPopupMenu();
		jpop.add(new JMenuItem("DD"));
		jpop.add(new JMenuItem("DD1"));

		area.addMouseListener(new MouseAdapter()
				{
					public void mousePressed(MouseEvent me)
					{
						if(me.getButton()==3)
						jpop.show(area,me.getX(),me.getY());
					}
				}
				);

		
	}
	File cur_file;
	int i=1;
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bnew)
		{
			
		                 
			
			String s=area.getText();
			//area.setDocument(new HTMLDocument());

			System.out.println(s);
			StringBuffer sb=new StringBuffer(s);
			s=sb.substring(0,sb.length()-16);
			System.out.println(s);	
			area.setText(s+"<br><font color=red size="+i+">hello");			
			i++;

			show();
			}
		else if(ae.getSource()==ne)
		{
			area.setText("");
			current_path="NEW";
		}
		else if(ae.getSource()==open) 
		{
	
			j_f.showOpenDialog(this);
			String path=j_f.getSelectedFile().getParent()+"/"+j_f.getSelectedFile().getName();
			current_path=path;
			setTitle(path);
			try
			{
				FileInputStream in=new FileInputStream(j_f.getSelectedFile());
				byte buf[]=new byte[in.available()];
				in.read(buf);
				area.setText(new String(buf));	
			}	
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this,"ERR!!"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
			}	
		}
		else if(ae.getSource()==save) 	
		{
			if(current_path.equals("NEW"))
			{
				boolean rep=true;
				while(rep)
				{
					int x=j_f.showSaveDialog(this);
					String path=j_f.getSelectedFile().getParent()+"/"+j_f.getSelectedFile().getName();
					cur_file=j_f.getSelectedFile();
					if(cur_file.exists())
					{
						int xx=JOptionPane.showConfirmDialog(this,"Do You Want To OVERWRITE?\n[ "+j_f.getSelectedFile().getName()+"]","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);			
						if(xx==JOptionPane.YES_OPTION)
						rep=false;
					}
					else
						rep=false;
				}			
			}
			else
			cur_file=new File(current_path);

			setTitle(current_path);
			try
			{
				FileOutputStream out=new FileOutputStream(cur_file);
				byte buf[]=area.getText().getBytes();
				out.write(buf);
				JOptionPane.showMessageDialog(this,"File Saved","Info",JOptionPane.INFORMATION_MESSAGE);
			}	
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this,"ERR!!"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		else if(ae.getSource()==save_as)
		{
			boolean rep=true;
				while(rep)
				{
					int x=j_f.showSaveDialog(this);
					String path=j_f.getSelectedFile().getParent()+"/"+j_f.getSelectedFile().getName();
					cur_file=j_f.getSelectedFile();
					if(cur_file.exists())
					{
						int xx=JOptionPane.showConfirmDialog(this,"Do You Want To OVERWRITE?\n[ "+j_f.getSelectedFile().getName()+"]","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);			
						if(xx==JOptionPane.YES_OPTION)
						rep=false;
					}
					else
						rep=false;
				}			
			cur_file=new File(current_path);

			setTitle(current_path);
			try
			{
				FileOutputStream out=new FileOutputStream(cur_file);
				byte buf[]=area.getText().getBytes();
				out.write(buf);
				JOptionPane.showMessageDialog(this,"File Saved","Info",JOptionPane.INFORMATION_MESSAGE);
			}	
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this,"ERR!!"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
		
			}
			
		}
		else if(ae.getSource()==exit) 	
		{
			System.exit(0);
		}
		else if(ae.getSource()==f_color) 	
		{
			
			
			JColorChooser jc=new JColorChooser();
			
			
			Color col=jc.showDialog(this,"CHOOSE",Color.red);	
			area.setSelectionColor(col);
			//area.setContentType("text/html");	
		}
		else if(ae.getSource()==ruby)
		{
			 try
			 {
	            			javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme( new RubyTheme());
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			}  
			catch (Exception e ) 
			{
			            System.out.println ("Metal Look & Feel not supported on this platform. \nProgram Terminated");
			            System.exit(0);
	        		}
			show();
		}
		else if(ae.getSource()==aqua)
		{
			System.out.println("dd");
			 try
			 {
	            			javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme( new AquaTheme());
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			}  
			catch (Exception e ) 
			{
			            System.out.println ("Metal Look & Feel not supported on this platform. \nProgram Terminated");
			            System.exit(0);
	        		}
			show();
		}
		else if(ae.getSource()==emreld)
		{
			 try
			 {
	            			javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme( new EmeraldTheme());
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			}  
			catch (Exception e ) 
			{
			            System.out.println ("Metal Look & Feel not supported on this platform. \nProgram Terminated");
			            System.exit(0);
	        		}
			show();
		}
		else if(ae.getSource()==charcol)
		{
			 try
			 {
	            			javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme( new CharcoalTheme());
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			}  
			catch (Exception e ) 
			{
			            System.out.println ("Metal Look & Feel not supported on this platform. \nProgram Terminated");
			            System.exit(0);
	        		}
			show();
		}
		else if(ae.getSource()==khaki)
		{
			try
			 {
	            		
			javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme( new KhakiMetalTheme());
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			}  
			catch (Exception e ) 
			{
			            System.out.println ("Metal Look & Feel not supported on this platform. \nProgram Terminated");
			            System.exit(0);
	        		}
			show();
		}
		else if(ae.getSource()==copy)
		{
			System.out.println("Compiling");
			Cursor wait=new Cursor(Cursor.WAIT_CURSOR);
			setCursor(wait);
			show();
			Compile cc=new Compile(this.getTitle());
			cc.compileprocess();
			Cursor defa=new Cursor(Cursor.DEFAULT_CURSOR);
			setCursor(defa);
			show();
			cc.show();
		}
		SwingUtilities.updateComponentTreeUI(this);
		invalidate();
	   	validate();
	   	repaint();

	}
	public static void main(String a[])
	{
		JDialog.setDefaultLookAndFeelDecorated(true);
       		JFrame.setDefaultLookAndFeelDecorated(true);
        		Toolkit.getDefaultToolkit().setDynamicLayout(true);
       		System.setProperty("sun.awt.noerasebackground","true");

		new Demo_File_Chooser();
	}
}
class RichTextArea extends JEditorPane
{
	JEditorPane  jp;
	int tab_count=0;
	RichTextArea()throws Exception
	{
		super();
				
		jp=this;
		//setMargin(top,left,right,bottom);
		setMargin(new Insets(10,100,10,10));
		//setText(javax.swing.plaf.metal.MetalLookAndFeel()+"");
		//setText(getTabSize()+"");
		//setTabSize(4);
		//setEditable(false);
		//setDocument(new HTMLDocument());
		//setContentType("text/html");
		//setText("<a href><Font size=23 color=red><b><i>hello<Font size=23 color=blue><b><i>hello<br><img src="+"E:/shri/demo_java/UTILITIS/Images_2.jpg"+">");
		addKeyListener(new KeyAdapter()
				{
					
					public void keyReleased(KeyEvent ke)
					{

						
						if(ke.getKeyChar()=='{')
						{
							//jp.append("  ");
							jp.setSelectionStart(jp.getSelectionStart());
							jp.setSelectionEnd(jp.getSelectionStart());
							//String tab="";
							//for(int i=1;i<=tab_count;i++)
							//tab=tab+"\t";
							jp.replaceSelection(" }");
							jp.setSelectionStart(jp.getSelectionStart()-2);
							jp.setSelectionEnd(jp.getSelectionStart()-2);
						}
						else if(ke.getKeyChar()=='[')
						{
						//	jp.append("  ");
							jp.setSelectionStart(jp.getSelectionStart());
							jp.setSelectionEnd(jp.getSelectionStart());
							jp.replaceSelection("\n]");
							jp.setSelectionStart(jp.getSelectionStart()-2);
							jp.setSelectionEnd(jp.getSelectionStart()-2);
						}
						else if(ke.getKeyCode()==9)
							tab_count++;
						if(ke.getKeyCode()==10)
						{
							int p=jp.getSelectionStart();
							String tab="";
							for(int i=1;i<=tab_count+1;i++)
							tab=tab+"\t";
							//jp.insert(tab,p);
						}

							
				/*		try
						{
							jp.append(jp.getLineEndOffset(jp.getLineCount()-1)+"");
						}
						catch(Exception e)
						{}*/
						
						

					}
				}
				);
	}
	


}
class Compile extends JFrame
{
	String path;
	JTextArea text;
	Compile(String path)
	{
		super("Compile");
		setSize(300,200);
		setVisible(true);
		text=new JTextArea();
		add(text);
		this.path=path;
		
	}
	void compileprocess()
     	{
	         	
	         Runtime r;
	         Process p;
	         String str;
	         BufferedReader br;
	         boolean success=true;
	         try
	         {
	            	r=Runtime.getRuntime();
		p=r.exec("javac "+path);
                 		br=new BufferedReader(new InputStreamReader(p.getErrorStream()));

		text.setText("");
           		 while((str=br.readLine())!=null)
            		{  
               			success=false;
               			text.append(str+"\n");
            		}
            		if(success==true)
            		{
              			 text.setText("                               *****************Successfully Compiled**********************");
            		}

        	        }
		catch(Exception e)
          		{
		              System.out.println(e);
          		}
	}
}
///////////////////////////////////////////////////////////theme classes/////////////////////////////////////////////////////////////////////////////
 class AquaTheme extends DefaultMetalTheme {

    public String getName() { return "Aqua"; }

    private final ColorUIResource primary1 = new ColorUIResource(102, 153, 153);
    private final ColorUIResource primary2 = new ColorUIResource(128, 192, 192);
    private final ColorUIResource primary3 = new ColorUIResource(159, 235, 235);

    protected ColorUIResource getPrimary1() { return primary1; }
    protected ColorUIResource getPrimary2() { return primary2; }
    protected ColorUIResource getPrimary3() { return primary3; }

}
class CharcoalTheme extends DefaultMetalTheme {

    public String getName() { return "Charcoal"; }

    private final ColorUIResource primary1 = new ColorUIResource(66, 33, 66);
    private final ColorUIResource primary2 = new ColorUIResource(90, 86, 99);
    private final ColorUIResource primary3 = new ColorUIResource(99, 99, 99);

    private final ColorUIResource secondary1 = new ColorUIResource(0, 0, 0);
    private final ColorUIResource secondary2 = new ColorUIResource(51, 51, 51);
    private final ColorUIResource secondary3 = new ColorUIResource(102, 102, 102);

    private final ColorUIResource black = new ColorUIResource(222, 222, 222);
    private final ColorUIResource white = new ColorUIResource(0, 0, 0);

    protected ColorUIResource getPrimary1() { return primary1; }
    protected ColorUIResource getPrimary2() { return primary2; }
    protected ColorUIResource getPrimary3() { return primary3; }

    protected ColorUIResource getSecondary1() { return secondary1; }
    protected ColorUIResource getSecondary2() { return secondary2; }
    protected ColorUIResource getSecondary3() { return secondary3; }

    protected ColorUIResource getBlack() { return black; }

    protected ColorUIResource getWhite() { return white; }

}
class RubyTheme extends DefaultMetalTheme {

    public String getName() { return "Ruby"; }

    private final ColorUIResource primary1 = new ColorUIResource(80, 10, 22);
    private final ColorUIResource primary2 = new ColorUIResource(193, 10, 44);
    private final ColorUIResource primary3 = new ColorUIResource(244, 10, 66); 

    protected ColorUIResource getPrimary1() { return primary1; }  
    protected ColorUIResource getPrimary2() { return primary2; } 
    protected ColorUIResource getPrimary3() { return primary3; } 

}
class EmeraldTheme extends DefaultMetalTheme {

    public String getName() { return "Emerald"; }

    private final ColorUIResource primary1 = new ColorUIResource(51, 142, 71);
    private final ColorUIResource primary2 = new ColorUIResource(102, 193, 122);
    private final ColorUIResource primary3 = new ColorUIResource(153, 244, 173); 

    protected ColorUIResource getPrimary1() { return primary1; }  
    protected ColorUIResource getPrimary2() { return primary2; } 
    protected ColorUIResource getPrimary3() { return primary3; } 

}
class KhakiMetalTheme extends DefaultMetalTheme {

    public String getName() { return "Sandstone"; }

    private final ColorUIResource primary1 = new ColorUIResource( 87,  87,  47);
  private final ColorUIResource secondary2 = new ColorUIResource( 255, 0, 0);
    private final ColorUIResource primary2 = new ColorUIResource(159, 151, 111);
    private final ColorUIResource primary3 = new ColorUIResource(199, 183, 143);

    private final ColorUIResource secondary1 = new ColorUIResource( 111,  111,  111);
//    private final ColorUIResource secondary2 = new ColorUIResource(159, 159, 159);
    private final ColorUIResource secondary3 = new ColorUIResource(231, 215, 183);

    protected ColorUIResource getPrimary1() { return primary1; }
    protected ColorUIResource getPrimary2() { return primary2; }
    protected ColorUIResource getPrimary3() { return primary3; }

    protected ColorUIResource getSecondary1() { return secondary1; }
    protected ColorUIResource getSecondary2() { return secondary2; }
    protected ColorUIResource getSecondary3() { return secondary3; }

}
