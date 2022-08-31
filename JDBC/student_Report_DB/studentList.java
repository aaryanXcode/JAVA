import java.util.*; 
import java.awt.*;
import java.awt.event.*;

public class studentList extends Frame  implements ActionListener
{
	Panel north,center,dataPanel;
	Label rollNoLabel,physicsLabel,chemistryLabel,mathLabel,totalLabel,percentageLabel,divLabel;
	TextField txRollNo,txPhysics,txChemistry,txMaths,txTotal,txPercentage,txDivision;
	Vector newv=new Vector();
	studentList(Vector v)
	{
		setVisible(true);
		setLayout(new BorderLayout());
		setSize(500,200);
		this.newv=v;
		center=new Panel();
		center.setLayout(new GridLayout(v.size(),1));
		for(int i=0;i<v.size();i++)
		{
			studentInfo stud=(studentInfo)newv.get(i);
			center.add(new studentListPanel(stud.Rollno,stud.physicsMarks,stud.chemistryMarks,stud.mathMarks,stud.totalMarks,stud.percentage,stud.division));
		}
		add(center,BorderLayout.CENTER);
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
	}
}
		
		
		
	