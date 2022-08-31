import java.util.*; 
import java.awt.*;
import java.awt.event.*;
class home extends Frame implements ActionListener
{
	
	Panel center;
	Button addStudent,studentList,updateButton,deleteButton;
	Vector v = new Vector();  
	home()
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

			new createStudent();
		}
		if(obj==studentList)
		{
			new studentInfo().getData();
		}
		if(obj==updateButton)
		{
			new updateStudent();
			//new studentInfo().updateData();
		}
		if(obj==deleteButton)
		{
			new updateStudent();
		}
		
	}
	public static void main(String a[])
	{
		new home();
	}
}