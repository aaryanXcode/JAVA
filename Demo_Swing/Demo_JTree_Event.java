import java.awt.*; 
 import javax.swing.*; 
 import java.awt.event.*; 
 import javax.swing.tree.*; 
 public class Demo_JTree_Event extends JApplet 
   { 
     public void init() 
      { 
         JTree Tree = new JTree(); 
         getContentPane().add(new JScrollPane(Tree)); 
         Tree.addMouseListener(new MouseAdapter() 
            { 
                public void mousePressed(MouseEvent e1) 
                   { 
                      String OutStrng = null; 
                      JTree Tree=(JTree)e1.getSource(); 
                      int ClckdRow = Tree.getRowForLocation(e1.getX(), e1.getY()); 
                      if(ClckdRow != -1) 
                     { 
                             TreePath TreePth = Tree.getPathForRow(ClckdRow); 
                             TreeNode TreeNd = (TreeNode)TreePth.getLastPathComponent(); 
                             OutStrng = "Node " + TreeNd.toString(); 
                              if(e1.getClickCount() == 1) 
                                { 
                                    OutStrng += "Clicked Single."; 
                                } 
                           else 
                              { 
                                          OutStrng += "Clicked Double."; 
                                      } 
                                          showStatus(OutStrng); 
                          } 
                    } 
            }); 
         } 
  } 
 /*<APPLET CODE =Demo_JTree_Event.class WIDTH = 35  HEIGHT = 280 ></APPLET>*/ 
 
