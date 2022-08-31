import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Demo_JDialog extends JFrame implements ActionListener
{
	JButton jb;
	Demo_JDialog()
	{
		setSize(100,100);
		setVisible(true);
		jb=new JButton("Dialog");
		setLayout(new FlowLayout());
		add(jb);
		show();	
		jb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		Dialog jj=new Dialog(this,"MY DIALOG",true);
		
		jj.show();	

		JOptionPane.showMessageDialog(this,"you are entered "+jj.getTextValue(),"Message",JOptionPane.INFORMATION_MESSAGE);	
		
	}
	public static void main(String a[])
	{
		new Demo_JDialog();
	}
}

class Dialog extends JDialog
{
	JTextField jt;
	Dialog(JFrame owner,String title,boolean modal)
	{
		super(owner,title,modal);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(screen.width/150,screen.height/2-200,100,200);
		setBounds(200,200,300,400);
		jt=new JTextField(20);
		setLayout(new FlowLayout());
		add(jt);
	}
	String getTextValue()
	{
		return(jt.getText());
	}
}	
		
	
