import java.awt.*;
import java.awt.event.*;


class ticketBill extends Frame implements ActionListener
{
	Panel north,center,billDisp;
	Checkbox cb1,cb2,cb3;
	
	CheckboxGroup cbg1;
	
	Choice ch1;
	Button totalFare;
	TextField distText;
	Label distance,ageGroup,seatingClass,classLabel,ageLabel,distanceLabel,nominalFareLabel,consessionLabel,classFareLabel,ticketFareLabel,totalFareLabel,payableAmountLabel;
	Label classLabeldisp,ageLabeldisp,distanceLabeldisp,nominalFareLabeldisp,consessionLabeldisp,classFareLabeldisp,ticketFareLabeldisp,totalFareLabeldisp,payableAmountLabeldisp;
	int firsClassFare=300;
	int secondClassFare=200;
	int thirdClassFare=100;
	int distanceTraveled=0;
	String sClass="";
	String age="";
	int nominal_fair=10;
	int fare=nominal_fair*distanceTraveled;
	int y=0;
	int totalfare=0;
	String consession="";
	int payable_amount=0;
	public ticketBill()
	{
		super("Bill generator");
		setSize(1000,400);
		setVisible(true);
		setLayout(new BorderLayout());   
 
		north=new Panel();
		north.setLayout(new FlowLayout());
		distance=new Label("Distance");
		distText=new TextField(10);
		seatingClass=new Label("Class");
		cbg1=new CheckboxGroup();
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
		
		totalFare=new Button("Total Fare");
		totalFare.addActionListener(this);
		north.add(totalFare);


		center=new Panel();
		center.setLayout(new GridLayout(2,9));
		add(north,BorderLayout.NORTH);
		show();
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{	
		
		Object obj=ae.getSource();
		if(obj==totalFare)
		{
			String name="";
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
			generateBill();
		}
	}
	public int getAmountAccordingClass(String age,int classFare,int ageConsession)
	{
		consession=ageConsession+"";
		y=classFare;
		totalfare=y+fare;
		payable_amount=totalfare-((totalfare*ageConsession)/100);
		
		classLabel=new Label("Class");
		ageLabel=new Label("age");
		distanceLabel=new Label("distance Traveled");
		nominalFareLabel=new Label("Nominal fare");
		consessionLabel=new Label("consession");
		classFareLabel=new Label("Class  fare");
		ticketFareLabel=new Label("Ticket fare");
		totalFareLabel=new Label("total fare");
		payableAmountLabel=new Label("Payable amount");
		
		classLabeldisp=new Label(sClass);
		ageLabeldisp=new Label(age);
		distanceLabeldisp=new Label(distanceTraveled+"Km");
		nominalFareLabeldisp=new Label(nominal_fair+"Rs");
		consessionLabeldisp=new Label(consession+"%");
		classFareLabeldisp=new Label(classFare+"Rs");
		ticketFareLabeldisp=new Label(fare+"Rs");
		totalFareLabeldisp=new Label(totalfare+"Rs");
		payableAmountLabeldisp=new Label(payable_amount+"Rs");
		
		center.add(classLabel);
		center.add(ageLabel);
		center.add(distanceLabel);
		center.add(nominalFareLabel);
		center.add(consessionLabel);
		center.add(classFareLabel);
		center.add(ticketFareLabel);
		center.add(totalFareLabel);
		center.add(payableAmountLabel);
		
		center.add(classLabeldisp);
		center.add(ageLabeldisp);
		center.add(distanceLabeldisp);
		center.add(nominalFareLabeldisp);
		center.add(consessionLabeldisp);
		center.add(classFareLabeldisp);
		center.add(ticketFareLabeldisp);
		center.add(totalFareLabeldisp);
		center.add(payableAmountLabeldisp);
		add(center,BorderLayout.CENTER);
		show();
		return 0;
	}
	public void generateBill()
	{
		
		distanceTraveled=Integer.parseInt(distText.getText());
		age=ch1.getSelectedItem();
		nominal_fair=10;
		fare=nominal_fair*distanceTraveled;
		y=0;
		totalfare=0;
		consession="";
		payable_amount=0;
		if(sClass=="First Class")
		{
			
			if(age=="0-10")
			{
				consession="100%";
				getAmountAccordingClass(age,firsClassFare,100);
				
			}
			if(age=="10-20")
			{
				consession="30%";
				
				getAmountAccordingClass(age,firsClassFare,30);
				
			}	
			if(age=="30-60")
			{
				
				consession="0%";
				
				getAmountAccordingClass(age,firsClassFare,100);
				
			}
			if(age=="60-100")
			{
				consession="50%";
				
				getAmountAccordingClass(age,firsClassFare,50);
				
			}	
				
			
		}
		//2nd class
	
		if(sClass=="Second Class")
		{
			if(age=="0-10")
			{
				consession="100%";
				
				getAmountAccordingClass(age,secondClassFare,100);
			}
			if(age=="10-20")
			{
				consession="30%";
				getAmountAccordingClass(age,secondClassFare,30);
			}	
			if(age=="30-60")
			{
				consession="0%";
				getAmountAccordingClass(age,secondClassFare,100);
			}
			if(age=="60-100")
			{
				consession="50%";
				getAmountAccordingClass(age,secondClassFare,50);
			}	
		}
		//third class
		if(sClass=="Third Class")
		{
			if(age=="0-10")
			{
				
				consession="100%";
				getAmountAccordingClass(age,thirdClassFare,100);
			}
			if(age=="10-20")
			{
				consession="30%";
				getAmountAccordingClass(age,thirdClassFare,30);
			}	
			if(age=="30-60")
			{
				consession="0%";
				getAmountAccordingClass(age,thirdClassFare,100);
			}
			if(age=="60-100")
			{
				consession="50%";
				getAmountAccordingClass(age,thirdClassFare,50);
			}	
		}
		
		
		
	}	
	public static void main(String a[])
	{
		new ticketBill();
	}
}
