import java.util.*; 
import java.awt.*;
import java.awt.event.*;

public class updateStudent extends Frame  implements ActionListener
{
	Panel north,center;
	Label rollNoLabel;
	Button search;
	TextField txRollNo;
	//Vector newv=new Vector();
	updateStudent()
	{
		
		setVisible(true);
		setLayout(new BorderLayout());
		setSize(500,200);
		
		//this.newv=v;
		north=new Panel();
		north.setLayout(new FlowLayout());
		
		rollNoLabel=new Label("search Roll Number");
		rollNoLabel.setFont(new Font("Arial", Font. PLAIN, 20));
		
		txRollNo=new TextField(10);
		
		search=new Button("search");
		search.addActionListener(this);
		
		north.add(rollNoLabel);
		north.add(txRollNo);
		north.add(search);
		
		add(north,BorderLayout.NORTH);
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
		if(obj==search)
		{
			searchStudent();
		}
		
	}
	public void searchStudent()
	{
		int roll=Integer.parseInt(txRollNo.getText());
		new studentInfo().getStudentData(roll);
			
	}
	public void updateData(String Rollno,String physicsMarks,String chemistryMarks,String mathMarks,String totalMarks,String percentage,String division)
	{
		//System.out.println(index);
		//System.out.println(newv.size());
		//studentInfo stud=(studentInfo)newv.get(index);
		center = new Panel();
		center.setLayout(new FlowLayout());
		center.add(new updatePanel(Rollno,physicsMarks,chemistryMarks,mathMarks,totalMarks,percentage,division));
		add(center,BorderLayout.CENTER);
		show();
		
	}
}
		
		
		
	