import java.awt.*;
import java.awt.event.*;
class ticketPanel extends Frame implements ActionListener
{
	
	Panel north,center,passenger;
	Checkbox cb1,cb2,cb3;
	//PassengerInfo pInfo;
	passengerList P;
	CheckboxGroup cbg1;
	Choice ch1;
	Button add;
	TextField distText,nametxt;
	Label distance,ageGroup,seatingClass,name;
	String sClass="";
	
	/*
	String a="Aryan";
	int firsClassFare=300;
	int secondClassFare=200;
	int thirdClassFare=100;
	int distanceTraveled=0;
	
	String age="";
	int nominal_fair=10;
	int fare=nominal_fair*distanceTraveled;
	int y=0;
	int totalfare=0;
	String consession="";
	int payable_amount=0;
	*/
	public ticketPanel()
	{
		
		super("Bill generator");
		setSize(1000,400);
		setVisible(true);
		setLayout(new BorderLayout());   
 
		north=new Panel();
		north.setLayout(new FlowLayout());
		name=new Label("Name");
		nametxt=new TextField(10);
		distance=new Label("Distance");
		distText=new TextField(10);
		seatingClass=new Label("Class");
		cbg1=new CheckboxGroup();
		north.add(name);
		north.add(nametxt);
		north.add(distance);
		north.add(distText);
		north.add(seatingClass);
		
		cb1=new Checkbox("First Class",false,cbg1);
		cb2=new Checkbox("Second Class",false,cbg1);
		cb3=new Checkbox("Third Class",false,cbg1);
		north.add(cb1);
		north.add(cb2);
		north.add(cb3);
		
		ageGroup=new Label("Age Group");
		north.add(ageGroup);
		ch1=new Choice();
		ch1.add("0-10");
		ch1.add("10-20");
		ch1.add("20-60");
		ch1.add("60-100");
		north.add(ch1);
		
		add=new Button("Add");
		add.addActionListener(this);
		north.add(add);
		add(north,BorderLayout.NORTH);
		show();
		P=new passengerList();
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
		
		if(obj==add)
		{
			
			if(cb1.getState()!=false)
			{
				sClass=cb1.getLabel();
				
			}
			else if(cb2.getState()!=false)
			{
				sClass=cb2.getLabel();
				
			}
			else if(cb3.getState()!=false)
			{
				sClass=cb3.getLabel();
			}
			else
			{
				System.out.println("please select a checkbox");
			}
			String Name=nametxt.getText();
			String distanceTraveled=distText.getText();	
			String seatClass=sClass;
			String passengerAge=ch1.getSelectedItem();
			P.add(new PassengerInfo(Name,distanceTraveled,seatClass,passengerAge));
		//	P.add(new PassengerInfo(nametxt.getText(),distText.getText(),sClass,ch1.getSelectedItem()));
			

		}
	}
	
	public static void main(String a[])
	{
		new ticketPanel();
		
	}
}