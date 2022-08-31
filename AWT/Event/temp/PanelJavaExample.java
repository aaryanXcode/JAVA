import java.awt.*; 
import java.awt.event.*;
 class PanelExample extends Frame implements ActionListener

 { 
       studentMarksSheet s[];
	
        Label  lblpanel1,lblpanel2,lblpanel3; 
	Button processAll,thirdDiv,secondDiv,firstDiv,fail;
	Panel south;
	TextField tx4;
	int noOfStudents=4;
        PanelExample() 
        { 
             	super("student Marks sheet");
		setVisible(true);
		setSize(700,700);
		setLayout(new BorderLayout());
		setLayout(new GridLayout(3,1));
		s=new studentMarksSheet[noOfStudents];
		for(int i=0;i<noOfStudents;i++)
		{
			s[i]=new studentMarksSheet();
			
			add(s[i]);
		}
		
		
		south=new Panel();
		south.setSize(500,100);
		south.setLayout(new GridLayout(1,1));
		processAll=new Button("Process All");
		processAll.setFont(new Font("Arial", Font. PLAIN, 20));
		processAll.addActionListener(this);

		firstDiv=new Button("First Division List");
		firstDiv.setFont(new Font("Arial", Font. PLAIN, 20));
		firstDiv.addActionListener(this);
		
		secondDiv=new Button("second Division List");
		secondDiv.setFont(new Font("Arial", Font. PLAIN, 20));
		secondDiv.addActionListener(this);

		thirdDiv=new Button("third Division List");
		thirdDiv.setFont(new Font("Arial", Font. PLAIN, 20));
		thirdDiv.addActionListener(this);

		fail=new Button("Fail list");
		fail.setFont(new Font("Arial", Font. PLAIN, 20));
		fail.addActionListener(this);
		
		
		
		south.add(processAll);
		south.add(firstDiv);
		south.add(secondDiv);
		south.add(thirdDiv);
		south.add(fail);

		
		
		
		add(south,BorderLayout.SOUTH);
		show();
	
        }
	public void actionPerformed(ActionEvent ae)
	{
		Object obj=ae.getSource();
	}
	public static void main(String args[])
	{
		new PanelExample(); 
	}
 } 
    