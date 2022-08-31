import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Demo_Image extends JFrame implements MouseMotionListener
{
	JButton b2;
	JButton b1;
	JLabel jl,l1;
	Image img;
	ImageIcon img1;
	JTextArea mo,text;
	
	public Demo_Image()
	{
		super();
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		mo=new JTextArea("sdsdfasdklfhsdfklas \n dhflsdsd");
		
		//setSize(300,400);
		this.setBounds(screen.width/2-150,screen.height/2-200,300,400);
		setVisible(true);
		getContentPane().setLayout(null);
		img1=new ImageIcon("img1.gif");
		img=img1.getImage();
		b1=new JButton(new ImageIcon("button0.png"));
		b1.setBounds(120,15,50,50);	
		ImageIcon img=new ImageIcon("photo.gif");
		int width=img.getIconWidth();
		int height=img.getIconHeight();			
		jl=new JLabel(new ImageIcon("photo.gif"));
		jl.setBounds(10,10,width,height);
		l1=new JLabel("ENTER");
		l1.setOpaque(true);
		b1.setOpaque(false);
		l1.setBounds(15,15,100,100);
		Cursor hand=new Cursor(Cursor.HAND_CURSOR);
		Cursor wait=new Cursor(Cursor.WAIT_CURSOR);
		setCursor(wait);
		b1.setCursor(hand);
		mo.setBounds(10,100,100,100);
		mo.setBackground(Color.red);
		mo.setForeground(Color.yellow);
		mo.setOpaque(true);
		mo.setEditable(false);
		text=new JTextArea("sdd");
		text.setBounds(0,0,600,800);
		text.setOpaque(true);
		text.setDragEnabled(true);
		getContentPane().add(mo);
		getContentPane().add(text);
		
		getContentPane().add(b1);
		getContentPane().add(l1);
		getContentPane().add(jl);
		mo.show();
		b1.show();
		repaint();
		show();	
		this.addMouseMotionListener(this);	
		text.addMouseMotionListener(this);
		text.addKeyListener(new KeyAdapter()
				{
					
					public void keyReleased(KeyEvent ke)
					{
						//mo.show();
						repaint();
					}
				}
				);
	}
	public void mouseDragged(MouseEvent me)
	{
		if(me.getX()>=mo.getX()-10||me.getY()>=mo.getY()-10)
		mo.setBounds(me.getX(),me.getY(),100,100);
	}
	public void mouseMoved(MouseEvent me)
	{
		
	}
	public void textValueChanged(TextEvent te)
	{
		mo.show();
	}
	public static void main(String a[])	
	{
		new Demo_Image();
	}
}


