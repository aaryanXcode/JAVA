import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;

public class OutputFrame extends JFrame
{
   JTextArea ta1;
   Container cp; 
   String str;
     
   OutputFrame(BufferedReader br1,BufferedReader br2)
   {
      ta1=new JTextArea();
      ta1.setText("");
      ta1.setBackground(Color.black);
      ta1.setForeground(Color.white);
     
      ta1.setFont(new Font("times new roman",Font.BOLD,15));

      cp=getContentPane();
      try
      {
     		 while((str=br1.readLine())!=null)
      		 {
		      ta1.append(str+"\n");
                 }
                 while((str=br2.readLine())!=null)
      		 {
		      ta1.append(str+"\n");
                 }
      }catch(Exception e)
       {
          System.out.println(e);
       }
      ta1.setCaretPosition(0); 
      ta1.append("\n(Press any key to Return..)");
      ta1.addKeyListener(new KeyAdapter()
			 {
			    public void keyPressed(KeyEvent ke)
			    {
 		               setVisible(false);
                            } 
			 }); 

   
   

      cp.add(ta1,BorderLayout.CENTER);
      setSize(300,300);
      setTitle("Output Window");
      setVisible(true);
      
   }
} 
      