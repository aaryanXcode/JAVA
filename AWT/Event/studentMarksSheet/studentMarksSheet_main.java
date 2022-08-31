import java.awt.*;
import java.awt.event.*;
class studentMarksSheet_main extends Frame implements ActionListener
{
	
	studentMarksSheet s[];
	divList d;
	Panel center;
	Panel north;
	Button processAll,thirdDiv,secondDiv,firstDiv,fail,add;
	Panel south;
	Label l1,firstLabel,secondLabel,thirdLabel;
	TextField tx4,tx1;
	int noOfStudents=0;
	int fcount=0;
	int scount=0;
	int tcount=0;
	int failcount=0;
	studentMarksSheet_main()
	{
		super("student Marks sheet");
		setVisible(true);
		setSize(700,700);
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
		add(north,BorderLayout.NORTH);	
	}	
	public void actionPerformed(ActionEvent ae)
	{
		Object obj=ae.getSource();
		String div="";
		

		if(obj==add)
		{
			noOfStudents=Integer.parseInt(tx1.getText());
			dataPanel();
		}
		if(obj==processAll)
		{
			for(int i=0;i<noOfStudents;i++)
			{
				s[i].processResult();
				if(s[i].firstDivision())
				{
					fcount++;
				}
				if(s[i].secondDivision())
				{
					scount++;
				}
				if(s[i].thirdDivision())
				{
					tcount++;
				}
				if(s[i].fail())
				{
					failcount++;
				}
			}
				System.out.println(fcount+" "+scount+" "+tcount+" "+failcount);
				
			
		}
		if(obj==firstDiv)
		{
			div="1st division";
			new divList(s,div,fcount);
			
		}
		if(obj==secondDiv)
		{
			div="2nd division";
			new divList(s,div,scount);
		}
		if(obj==thirdDiv)
		{
			div="3rd division";
			new divList(s,div,tcount);
		}
		if(obj==fail)
		{
			div="fail";
			new divList(s,div,failcount);
		}
					
	}
	public void dataPanel()
	{
		center=new Panel();
		center.setLayout(new GridLayout(noOfStudents,1));
		s=new studentMarksSheet[noOfStudents];
		for(int i=0;i<noOfStudents;i++)
		{
			s[i]=new studentMarksSheet();
			
			center.add(s[i]);
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

		
		
		add(center,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		show();
	}
	
	public static void main(String a[])
	{
		
		new studentMarksSheet_main();
		
	}
}
