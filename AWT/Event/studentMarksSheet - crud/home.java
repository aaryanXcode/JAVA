import java.util.*; 
import java.awt.*;
import java.awt.event.*;
class home extends Frame implements ActionListener
{
	
	Panel center;
	Button addStudent,studentList,updateButton,deleteButton;
	Vector v = new Vector();  
	public home()
	{
		
		super("student");
		setSize(1000,400);
		setVisible(true);
		setLayout(new BorderLayout());   
		center =new Panel();
		center.setLayout(new FlowLayout());
		addStudent=new Button("Add Student");
		addStudent.setFont(new Font("Arial", Font. PLAIN, 20));
		addStudent.addActionListener(this);
		studentList=new Button(" List");
		studentList.setFont(new Font("Arial", Font. PLAIN, 20));
		studentList.addActionListener(this);
		updateButton=new Button("Update");
		updateButton.setFont(new Font("Arial", Font. PLAIN, 20));
		updateButton.addActionListener(this);
		deleteButton=new Button("Delete");
		deleteButton.setFont(new Font("Arial", Font. PLAIN, 20));
		deleteButton.addActionListener(this);
		center.add(addStudent);
		center.add(studentList);
		center.add(updateButton);
		center.add(deleteButton);
		
		add(center,BorderLayout.CENTER);
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{	
		Object obj=ae.getSource();
		if(obj==addStudent)
		{

			new createStudent(v);
		}
		if(obj==studentList)
		{
			new studentList(v);
			for(int i=0;i<v.size();i++)
			{
				studentInfo stud=(studentInfo)v.get(i);
				System.out.println(stud.Rollno);
				System.out.println(stud.division);
				System.out.println(stud.physicsMarks);
				System.out.println(stud.chemistryMarks);
				System.out.println(stud.mathMarks);
				System.out.println(stud.percentage);
				System.out.println(stud.totalMarks);
			}
			
		}
		if(obj==updateButton)
		{
			new updateStudent(v);
		}
		if(obj==deleteButton)
		{
			new updateStudent(v);
		}
		
	}
	public static void main(String a[])
	{
		new home();
	}
}