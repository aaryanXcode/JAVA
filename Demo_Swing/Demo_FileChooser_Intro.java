import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.filechooser.*;
class Demo_FileChooser_Intro extends JFrame implements ActionListener
{
	JButton open;
	JButton icon_but;
	JTextArea jt;
	JFileChooser jf;
	FileSystemView jfv;
	Demo_FileChooser_Intro()
	{
		setSize(300,200);
		setVisible(true);
		setLayout(new FlowLayout());
		open=new JButton("OPEN");
		Icon df=new ImageIcon("default.gif");
		icon_but=new JButton(df);
		open.addActionListener(this);
		add(open);
		add(icon_but);
		jfv=FileSystemView.getFileSystemView();
		jf=new JFileChooser(jfv);
	//	jfv=jf.getFileSystemView();
		jf.updateUI();
		jf.setMultiSelectionEnabled(true);
		jf.setApproveButtonMnemonic('O');
		
		jt=new JTextArea(10,10);
		add(jt);
		show();	
	}
	public void actionPerformed(ActionEvent ae)
	{
		int state=jf.showOpenDialog(this);
		
		if(state==0)	
		{
			
			JOptionPane.showMessageDialog(this,"Selected File is \""+jf.getSelectedFile()+"\"");
			
			Icon df=jfv.getSystemIcon(jf.getSelectedFile());
			icon_but.setIcon(df);
			jt.setText(jf.getDescription(jf.getSelectedFile())+"\n"+jf.getTypeDescription(jf.getSelectedFile()));

		}
		
		
		
	}
	public static void main(String a[])
	{
		new Demo_FileChooser_Intro();		
	}
}		