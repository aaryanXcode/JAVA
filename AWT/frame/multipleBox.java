import java.awt.*;
import java.awt.event.*;
class multipleBox extends Frame implements ActionListener
{
	Panel center,north,labels,west,east,sumPanel;
	Button add,b1,b2,b3,totalSumButton;
	Label l1,p;
	int i=0;
	TextField tx1,sumTextField,t;
	int numberOfBoxes=0;
	
	multipleBox()
	{
		super("multipleBox");
		setVisible(true);
		setSize(400,400);
		setLayout(new BorderLayout());

		north=new Panel();
		north.setLayout(new GridLayout(1,1));
		l1=new Label("Enter How many numbers to be entered:");
		l1.setFont(new Font("Arial", Font. PLAIN, 20));
		tx1=new TextField(10);
		add=new Button("add");
		add.setFont(new Font("Arial", Font. PLAIN, 20));
		add.addActionListener(this);
		
		north.add(l1);
		north.add(tx1);
		north.add(add);
		
		center=new Panel();
		center.setLayout(new GridLayout(1,1));
		
		
		
		
		add(north,BorderLayout.NORTH);	
		
		
			
		show();
	}
	public void generateBoxes(int numberOfBoxes)
	{
		System.out.println("in function");
		labels=new Panel();
		labels.setLayout(new GridLayout(numberOfBoxes,1));
		for( i=0;i<numberOfBoxes;i++)
		{
			int m=i;
			TextField i;
			p=new Label("NO"+m);
			i=new TextField(10);
			
			labels.add(p);
			labels.add(i);
		}
		
		center.add(labels);	
		sumPanel=new Panel();
		sumPanel.setLayout(new GridLayout(1,1));
		totalSumButton=new Button("Total Sum");
		totalSumButton.addActionListener(this);
		totalSumButton.setFont(new Font("Arial", Font. PLAIN, 40));
		sumTextField=new TextField(10);
		sumTextField.setFont(new Font("Arial", Font. PLAIN, 40));
		sumPanel.add(totalSumButton);
		sumPanel.add(sumTextField);
		add(sumPanel,BorderLayout.SOUTH);
		add(center,BorderLayout.CENTER);
		show();
	}	
			
	public void actionPerformed(ActionEvent ae)
	{
		
		Object obj=ae.getSource();
		if(obj==add)
		{
			numberOfBoxes=Integer.parseInt(tx1.getText());
			generateBoxes(numberOfBoxes);
			System.out.println(numberOfBoxes);
		}
		if(obj==totalSumButton)
		{
			for(int j=0;j<numberOfBoxes;j++)
			{
				String t=String.valueOf(i);
				
				//int a=Integer.parseInt(t.getText());
				System.out.println(t);
				i++;
			}
		}
		
			
		
		
	}
	public static void main(String a[])
	{
		new multipleBox();
	}
}