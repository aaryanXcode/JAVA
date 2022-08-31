import java.util.*; 
import java.awt.*;
import java.awt.event.*;
class createStudent extends Frame  implements ActionListener
{
	
	Button processButton,firstDivButton,secondDivButton,thirdDivButton,failButton,addStudent;
	Label rollNoLabel,physicsLabel,chemistryLabel,mathLabel,totalLabel,percentageLabel,divLabel;
	TextField txRollNo,txPhysics,txChemistry,txMaths,txTotal,txPercentage,txDivision;
	int Physics=0,Chemistry=0,Maths=0,RollNo=0,Total=0,Percentage=0;
	String div="";	
	//Vector newv=new Vector();
	createStudent()
	{
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500,200);
		
		rollNoLabel=new Label("Roll Number");
		rollNoLabel.setFont(new Font("Arial", Font. PLAIN, 20));
	
		txRollNo=new TextField(5);
		txRollNo.setFont(new Font("Arial", Font. PLAIN, 20));
	
		physicsLabel=new Label("Physics Marks");
		physicsLabel.setFont(new Font("Arial", Font. PLAIN, 20));
	
		txPhysics=new TextField(5);
		txPhysics.setFont(new Font("Arial", Font. PLAIN, 20));
	
		chemistryLabel=new Label("Chemistry marks");
		chemistryLabel.setFont(new Font("Arial", Font. PLAIN, 20));

		txChemistry=new TextField(5);
		txChemistry.setFont(new Font("Arial", Font. PLAIN, 20));
		
		mathLabel=new Label("Maths marks");
		mathLabel.setFont(new Font("Arial", Font. PLAIN, 20));

		txMaths=new TextField(5);
		txMaths.setFont(new Font("Arial", Font. PLAIN, 20));
		
		processButton=new Button("Process");
		processButton.setFont(new Font("Arial", Font. PLAIN, 20));
		processButton.addActionListener(this);
			

		totalLabel=new Label("Total");
		totalLabel.setFont(new Font("Arial", Font. PLAIN, 20));
	
		txTotal=new TextField(5);
		txTotal.setFont(new Font("Arial", Font. PLAIN, 20));
	
		percentageLabel=new Label("Percentage");
		percentageLabel.setFont(new Font("Arial", Font. PLAIN, 20));
	
		txPercentage=new TextField(5);
		txPercentage.setFont(new Font("Arial", Font. PLAIN, 20));
	
		divLabel=new Label("Division");
		divLabel.setFont(new Font("Arial", Font. PLAIN, 20));

		txDivision=new TextField(20);
		txDivision.setFont(new Font("Arial", Font. PLAIN, 20));	
			
		addStudent=new Button("Add");
		addStudent.addActionListener(this);
		
		add(rollNoLabel);
		add(txRollNo);
		add(physicsLabel);
		add(txPhysics);
		add(chemistryLabel);
		add(txChemistry);
		add(mathLabel);
		add(txMaths);
		/*add(processButton);
		
		add(totalLabel);
		add(txTotal);
		add(percentageLabel);
		add(txPercentage);
		add(divLabel);
		add(txDivision);
		*/
		add(addStudent);
		this.addWindowListener(new WinEvents(this));
		//show();
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
		
		if(obj==addStudent)
		{
			//newv.add(new studentInfo(RollNo,Physics,Chemistry,Maths,Total,Percentage,div));
			try
			{
				RollNo=Integer.parseInt(txRollNo.getText());
			}
			catch(NumberFormatException e)
			{
				RollNo=0;
			}	
				
			try
			{
				Physics=Integer.parseInt(txPhysics.getText());
			}
			catch(NumberFormatException e)
			{
				Physics=0;
			}
			try
			{
				Chemistry=Integer.parseInt(txChemistry.getText());
			}
			catch(NumberFormatException e)
			{
				Chemistry=0;
			}
			try
			{
				Maths=Integer.parseInt(txMaths.getText());
			}
			catch(NumberFormatException e)
			{
				Maths=0;
			}
			new studentInfo(RollNo,Physics,Chemistry,Maths).insertData();
			System.out.println("successfully added");
			
		}
	}
	
	
	
}
class WinEvents implements WindowListener
{
	createStudent ff;
	WinEvents(createStudent ff)
	{	
		this.ff=ff;
	}
	public void windowActivated(WindowEvent we)
	{
	
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.println("CLOSED");
		System.exit(0);	
	}
	public void windowClosed(WindowEvent we)
	{
			
	}
	public void windowDeactivated(WindowEvent we)
	{
		
	}

	public void windowIconified(WindowEvent we)
	{
	}
	public void windowDeiconified(WindowEvent we)
	{
	}

	public void windowOpened(WindowEvent we)
	{
	}
}