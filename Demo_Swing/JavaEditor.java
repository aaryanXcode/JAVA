import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;


public class JavaEditor extends JFrame implements ActionListener
{

   JMenu file,edit,build,option,help;
   JMenuItem new1,open,save,saveas,exit,cut,copy,paste,selectall,compile,run,bgcolor,forecolor,mi,runparam;
   Container cp;
   JMenuBar jmb;
   JToolBar jtb;
   JButton bnew,bopen,bsave,bsaveas,bcut,bcopy,bpaste,bcompile,brun;
   JPanel jp;
   JTextArea ta1,ta2;
   JScrollPane jsp1,jsp2;
   JLabel pathlabel; 
   JFileChooser jf; 
   
   JavaEditor()
   {
       super("Java Editor");
       cp=getContentPane();
       jmb=new JMenuBar();
       jf=new JFileChooser();
       pathlabel=new JLabel("                                       Noname.java"); 
       pathlabel.setFont(new Font("times new roman",Font.BOLD,15));
       pathlabel.setForeground(new Color(0,0,128)); 
      
     
     /*****Initilisation of Menus ********/

       file=new JMenu("File");
       edit=new JMenu("Edit");
       build=new JMenu("Build");
       option=new JMenu("Option");
       help=new JMenu("Help");

    /******Initilisation of Menu Items *********/

       new1=new JMenuItem("New");
       open=new JMenuItem("Open");
       save=new JMenuItem("Save");
       saveas=new JMenuItem("SaveAs");
       exit=new JMenuItem("Exit");
    
       cut=new JMenuItem("Cut");
       copy=new JMenuItem("Copy");
       paste=new JMenuItem("Paste");
       selectall=new JMenuItem("SelectAll");
     
       compile=new JMenuItem("Compile");
       run=new JMenuItem("Run");
       runparam=new JMenuItem("Run With Parameters");

       bgcolor=new JMenuItem("Background Color");
       forecolor=new JMenuItem("Fore Color");
     
   /**********Adding MenuItems to Menus***********/

       mi=(JMenuItem)file.add(new1);
       mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
       new1.addActionListener(this);

       mi=(JMenuItem)file.add(open);
       mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
       open.addActionListener(this);

       mi=(JMenuItem)file.add(save);
       mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
       save.addActionListener(this);

       mi=(JMenuItem)file.add(saveas);
       mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
       saveas.addActionListener(this);

       mi=(JMenuItem)file.add(exit);
       mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
       exit.addActionListener(this);
     
       edit.add(cut);
       edit.add(copy);
       edit.add(paste);
       edit.add(selectall);
     
       build.add(compile);
       compile.addActionListener(this);

       build.add(run);
       run.addActionListener(this); 
      
       build.add(runparam);
       runparam.addActionListener(this);
    
       mi=(JMenuItem)option.add(bgcolor);
       mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
       bgcolor.addActionListener(this);       

       mi=(JMenuItem)option.add(forecolor);
       mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
       forecolor.addActionListener(this); 
      

    /************ Setting Shortcuts ************/

      file.setMnemonic('f');
      edit.setMnemonic('e');
      build.setMnemonic('b');
      option.setMnemonic('o');
      help.setMnemonic('h');
      new1.setMnemonic('n');
      
 


    /*****Adding Menus to Menu Bar***********/  

       jmb.add(file);
       jmb.add(edit);
       jmb.add(build);  
       jmb.add(option);
       jmb.add(help);
      
       setJMenuBar(jmb);

   /************ToolBar Section**************/
       jtb=new JToolBar();
       bnew=new JButton(new ImageIcon("new.gif"));
       bopen=new JButton(new ImageIcon("open.gif"));
       bsave=new JButton(new ImageIcon("save.gif"));
       bcut=new JButton(new ImageIcon("cut.gif"));
       bcopy=new JButton(new ImageIcon("copy.gif"));
       bpaste=new JButton(new ImageIcon("paste.gif"));
       
       jtb.add(bnew);
       jtb.add(bopen);
       jtb.add(bsave);
       jtb.add(bcut);
       jtb.add(bcopy);
       jtb.add(bpaste);
      // jtb.add(pathlabel);
       jtb.setBorder(LineBorder.createGrayLineBorder());
     
     /*******************/
     /**************Text Areas*****************/ 

       ta1=new JTextArea(110,20);
       ta2=new JTextArea(8,20);
       jsp1=new JScrollPane(ta1);
       jsp2=null; 
       ta1.setBackground(new Color(0,0,128));
       ta2.setBackground(new Color(151,151,204));
       ta1.setCaretColor(Color.white);
       ta2.setCaretColor(Color.white);
       ta1.setForeground(Color.white);
       ta2.setForeground(Color.white);
       ta1.setFont(new Font("times new roman",Font.BOLD,15));
       ta2.setFont(new Font("times new roman",Font.BOLD,15)); 
       ta1.setBorder(new TitledBorder(new LineBorder(Color.white,2),pathlabel.getText(),TitledBorder.LEFT,TitledBorder.TOP,new Font("ariel",Font.BOLD,13),Color.yellow));
       ta2.setBorder(new TitledBorder(new LineBorder(Color.white,2),"Message",TitledBorder.LEFT,TitledBorder.TOP,new Font("ariel",Font.BOLD,13),Color.yellow));
       


       

     /*****************************************/
 
     jp=new JPanel();
    
     jp.setLayout(new BorderLayout());
     jp.add(jtb,BorderLayout.NORTH);
     jp.add(jsp1,BorderLayout.CENTER);
    
     ta1.addMouseListener(new MouseAdapter()
                          {
                               public void mousePressed(MouseEvent me)
 			       {
                                 try
 				 { 
				 if(jsp2!=null)
   				 {
                                      //JOptionPane.showMessageDialog(null,"Reached1","Error",JOptionPane.INFORMATION_MESSAGE);
    				      jp.remove(jsp2);
				      jp.paintAll(jsp1.getGraphics());
 				      jsp2=null;
                                 }	
                                }catch(Exception e){JOptionPane.showMessageDialog(null,e+"","Error",JOptionPane.INFORMATION_MESSAGE); }
                               }
 
                           });
                                   
				              

     jp.setPreferredSize(new Dimension(400,100));
     setContentPane(jp);
        
             

     
   }

   public void actionPerformed(ActionEvent ae)
   {
      Object src;
      src=ae.getSource();
      if(src==bgcolor)
      {
        Color col=JColorChooser.showDialog(this,"Pick up Background Color",new Color(0,0,128));
        if(col!=null) ta1.setBackground(col);
      } 
      else if(src==forecolor)
      {
        Color col=JColorChooser.showDialog(this,"Pick up ForeGround Color",Color.white);
        if(col!=null) ta1.setForeground(col);
      }

      else if(src==open)
      {
        File file;
        String name,path,str;
        name=path=str="";
        if(jf.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
        {
           file=jf.getSelectedFile();
           name=file.getName();
           path=file.getPath();
           try
           {
                BufferedReader br=new BufferedReader(new FileReader(file));
                ta1.setText("");
		ta2.setText("");
                while((str=br.readLine())!=null)
                {
                    ta1.append(str+"\n");
                }
                //pathlabel.setText("                                  "+path);
		pathlabel.setText(path);

                ta1.setCaretPosition(0);
           }catch(Exception e)
            {
                 ta2.setText("File Not Found");
            }
        }
     }    
          
       if(src==saveas)
       {
         File file;
         if(jf.showSaveDialog(this)==JFileChooser.APPROVE_OPTION)
         {
             file=jf.getSelectedFile();
             saveasprocess(file);
         }
       }  

       if(src==save)
       {  
           saveprocess();
          
       } 
       else if(src==new1)
       {
           newprocess();
       }
       else if(src==compile)
       {
             saveprocess();
             /**** Adding The Status Frame ****/

              jsp2=new JScrollPane(ta2);
              jp.add(jsp2,BorderLayout.SOUTH);
              jp.paintAll(jsp2.getGraphics());

             /*******************/

          compileprocess();
       }  
       else if(src==run)
       {
          saveprocess();
          compileprocess(); 
          run("");
       }
       else if(src==runparam)
       {
           saveprocess();
           compileprocess();
           String parameter=JOptionPane.showInputDialog(this,"Enter Parameter String","Input Parameter",JOptionPane.INFORMATION_MESSAGE);
           run(parameter);
       }
 
          
      
   } 	
   public void saveasprocess(File file)
   {
      String name,path;
      name=path="";
      path=file.getPath();
      name=file.getName();
      String text=ta1.getText();
      
      try
      { 

         BufferedWriter bw=new BufferedWriter(new FileWriter(file));
         bw.write(text,0,text.length());
         bw.flush();
 
      }catch(Exception e)
       {
           ta2.setText("File could not be Saved"); 
       } 
       //pathlabel.setText("                                     "+path);
	pathlabel.setText(path);
   } 

   public void saveprocess()
   {
      File file;
      if(pathlabel.getText().trim().equals("Noname.java"))
      {
         if(jf.showSaveDialog(this)==JFileChooser.APPROVE_OPTION)
         {
            file=jf.getSelectedFile();
            saveasprocess(file);
         }
       }
       else
       {
               file=new File(pathlabel.getText().trim());
               saveasprocess(file);
       }

   }

   public void newprocess()
   {
     String title=pathlabel.getText().trim();
     int r;
     File file;


     if(title.equals("Noname.java"))
     {
        if(!ta1.getText().equals(""))
        {
          r=JOptionPane.showConfirmDialog(null,"Do You Want to Save This File?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
          if(r==JOptionPane.YES_OPTION)
          {
             if(jf.showSaveDialog(this)==JFileChooser.APPROVE_OPTION)
             {
               file=jf.getSelectedFile();
               saveasprocess(file);
               ta1.setText("");
               pathlabel.setText("                                     Noname.java");
             }
          }
          else if(r==JOptionPane.NO_OPTION)
          {
             ta1.setText("");
             //pathlabel.setText("                                     Noname.java");
	     pathlabel.setText("Noname.java");
          }
        }
        else
        {
            //no action to be preformed
        }       
     }
     else
     {
       r=JOptionPane.showConfirmDialog(null,"Do You Want to Save This File","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
       if(r==JOptionPane.YES_OPTION)
       {
          file=new File(title);
          saveasprocess(file);
          ta1.setText("");
          pathlabel.setText("                                     Noname.java");
       }
       else if(r==JOptionPane.NO_OPTION)
       {
          ta1.setText("");
          //pathlabel.setText("                                     Noname.java");
	  pathlabel.setText("Noname.java");
       }
       else
       {
            //no action to be performed
       }
     }
   }  


     void compileprocess()
     {

         Runtime r;
         Process p;
         String path,name,str;
         BufferedReader br;
         boolean success=true;

        
         
         try
         {
            r=Runtime.getRuntime();
            path=pathlabel.getText().trim();
            p=r.exec("javac "+path);
            
            br=new BufferedReader(new InputStreamReader(p.getErrorStream()));

            ta2.setText("");
            while((str=br.readLine())!=null)
            {  
               success=false;
               ta2.append(str+"\n");
            }
            if(success==true)
            {
               ta2.setText("                               *****************Successfully Compiled**********************");
            }

         }catch(Exception e)
          {
              System.out.println(e);
          }
       }

      void run(String parameter)
      {
         Runtime r;
         Process p;
         BufferedReader br1,br2;
         String path,name,abspath,str;

         try
         {
           path=pathlabel.getText().trim();
           name=new File(path).getName();
           name=name.substring(0,name.length()-5);
           abspath=path.substring(0,path.lastIndexOf("\\")+1);   
           
           r=Runtime.getRuntime();
           p=r.exec("java -cp "+abspath+" "+name+" "+parameter);
           System.out.println("java -cp "+abspath+" "+name);
           
           br1=new BufferedReader(new InputStreamReader(p.getInputStream()));
           
           br2=new BufferedReader(new InputStreamReader(p.getErrorStream()));

           new OutputFrame(br1,br2);


         }catch(Exception e)
          { 
              System.out.println(e);
          }
  }


   public static void main(String str[])
   {
      JavaEditor jd=new JavaEditor();
      jd.setSize(800,600);
      jd.setVisible(true);
   }

}   
           
 
      

      
      
       