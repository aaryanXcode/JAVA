import java.awt.*;
import java.awt.event.*;
class PassengerInfo extends Panel  implements ActionListener
{
	
	Button update;
	Label name,age,dist,sClass,totalAmount;
	TextField nametxt,agetxt,disttxt,sClasstxt,totalAmounttxt;
	Choice ch1,ch2;
	PassengerInfo(String Name,String distance,String seatingClass,String Age)
	{
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500,200);
		
		
		name=new Label("name");
		name.setFont(new Font("Arial", Font. PLAIN, 20));
		nametxt=new TextField(Name);
		nametxt.setFont(new Font("Arial", Font. PLAIN, 20));
		
		age=new Label("age");
		age.setFont(new Font("Arial", Font. PLAIN, 20));
		ch2=new Choice();
		ch2.add(Age);
		
		
		dist=new Label("distance travel");
		dist.setFont(new Font("Arial", Font. PLAIN, 20));
		disttxt=new TextField(distance);
		disttxt.setFont(new Font("Arial", Font. PLAIN, 20));
	
		sClass=new Label("seating class");
		sClass.setFont(new Font("Arial", Font. PLAIN, 20));
		ch1=new Choice();
		ch1.add(seatingClass);
		
		
		
		totalAmount=new Label("total Amount");
		totalAmount.setFont(new Font("Arial", Font. PLAIN, 20));
		totalAmounttxt=new TextField(5);
		totalAmounttxt.setFont(new Font("Arial", Font. PLAIN, 20));
		
		update=new Button("update");
		update.setFont(new Font("Arial", Font. PLAIN, 20));
	
		add(name);
		add(nametxt);
		add(age);
		add(ch2);
		add(ch2);
		add(dist);
		add(disttxt);
		add(sClass);
		add(ch1);
		add(totalAmount);
		add(totalAmounttxt);
		add(update);
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
	}
	
			
}