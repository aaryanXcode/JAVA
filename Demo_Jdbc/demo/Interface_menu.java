import java.awt.*;
import java.awt.event.*;

public class Interface_menu extends Frame implements ActionListener
{
	TextField rollno,name,course,marks,Percentage;
	Label rollno_l,name_l,course_l,marks_l,percentage_l;	
	Button ADD;
	Demo_Data d;
	public void design()
	{
	setVisible(true);
	setResizable(false);
	setSize(650,75);
	rollno=new TextField(" ",2);
	name=new TextField(" ",5);
	marks=new TextField(" ",3);
	Percentage=new TextField(" ",3);
	course=new TextField(" ",5);
	
	rollno_l=new Label("rollno");
	name_l=new Label("name");
	course_l=new Label("course");
	marks_l=new Label("marks");
	percentage_l=new Label("percentage");
	ADD=new Button("UPDATE");
	ADD.addActionListener(this);
	setLayout(new FlowLayout());
	add(rollno_l);
	add(rollno);
	add(name_l);
	add(name);
	add(course_l);
	add(course);
	add(marks_l);
	add(marks);
	add(percentage_l);
	add(Percentage);
	add(ADD);
	name.setText(d.s1);
	course.setText(d.s2);
	marks.setText(d.s3);
	Percentage.setText(d.s4);
	show();
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			String sql="update marksheet set course='"+course.getText()+"' where roll_no="+d.ch.getSelectedItem();
			System.out.println(sql);
			int x=d.st.executeUpdate(sql);
			if(x>0)
			System.out.println("Data Successfully Updated");	
			else
			System.out.println("Data Updatation Failed");	

		}
		catch(Exception e)
		{
			System.out.println("Data Upadation Failed"+e);						
		}
	}
	
	Interface_menu(Demo_Data d)
	
	{
		super("Additional Data");
		this.d=d;
	}
	
		
}
