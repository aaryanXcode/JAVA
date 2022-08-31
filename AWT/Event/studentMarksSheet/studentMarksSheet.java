import java.awt.*;
import java.awt.event.*;
class studentMarksSheet extends Panel  implements ActionListener
{
	
	Button processButton,firstDivButton,secondDivButton,thirdDivButton,failButton;
	Label rollNoLabel,physicsLabel,chemistryLabel,mathLabel,totalLabel,percentageLabel,divLabel;
	TextField txRollNo,txPhysics,txChemistry,txMaths,txTotal,txPercentage,txDivision;
	int Physics=0,Chemistry=0,Maths=0,RollNo=0,Total=0,Percentage=0;
	String div="";	
	
	studentMarksSheet()
	{
		
		setVisible(true);
		setLayout(new FlowLayout());
	//	setLayout(new BorderLayout());
	//	setLayout(new GridLayout(4,1));
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
			
			
		add(rollNoLabel);
		add(txRollNo);
		add(physicsLabel);
		add(txPhysics);
		add(chemistryLabel);
		add(txChemistry);
		add(mathLabel);
		add(txMaths);
		add(processButton);
		add(totalLabel);
		add(txTotal);
		add(percentageLabel);
		add(txPercentage);
		add(divLabel);
		add(txDivision);
		
		//show();
	}
	public void processResult()
	{
			
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
			
			Total=Physics+Chemistry+Maths;
			Percentage=Total/3;
			
			
			
			if(Physics>=35)
			{
					if(Chemistry>=35)
					{
							if(Maths>=35)
							{
								if(Percentage>=35)
								{ 
									if(Percentage<=45)
									{ 
						
										div="3rd division";
									}	
								}
								if(Percentage>45)
								{
									if(Percentage<=60)
									{ 
										div="2nd division";
									}   
								}
								if(Percentage>60)
								{   
										div="1st division";
								}
								
	 
							}	 
							if(Maths<35)
							{
							
								div= "fail";
							}
					}
					if(Chemistry<35)
					{
					
						div= "fail";
					}	
			}
			if(Physics<35)
			{
				div= "fail";
			}
						
			txPercentage.setText(String.valueOf(Percentage));
			txTotal.setText(String.valueOf(Total));
			txDivision.setText(div);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
		if(obj==processButton)
		{
			processResult();
		}
	}
	public boolean firstDivision()
	{
    	if(div=="1st division")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean secondDivision()
	{

    		if(div=="2nd division")
        		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean thirdDivision()
	{
    		if(div=="3rd division")
        		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean fail()
	{
    		if(div=="fail")
        		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
			
}
