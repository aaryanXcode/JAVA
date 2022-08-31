import java.util.*; 
import java.awt.*;
import java.awt.event.*;
class passengerList extends Frame implements ActionListener
{
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
	//
	PassengerInfo p;
	Vector<PassengerInfo> v = new Vector<PassengerInfo>();  
	Panel center,south;
	Label TotalBill;
	TextField TotalBilltxt;
	int noOfPassengers=10;
	passengerList()
	{
		super("passengerList");
		setVisible(true);
		setSize(700,700);
		setLayout(new BorderLayout());
		
		center=new Panel();
		center.setLayout(new GridLayout(noOfPassengers,1));  //no of students will be replaced by vector size()
		/*
		south=new Panel();
		south.setLayout(new GridLayout(1,1));
		TotalBill=new Label("Total Bill");
		TotalBilltxt=new TextField(10);
		south.add(TotalBill);
		south.add(TotalBilltxt);
		//add(south,BorderLayout.CENTER);
		*/
		show();
	}
	public void add(PassengerInfo p)
	{
		v.add(p);
		for(int i=0;i<v.size();i++)
		{
			payable_amount=generateBill(v.get(i).disttxt.getText(),v.get(i).ch1.getSelectedItem(),v.get(i).ch2.getSelectedItem());
			v.get(i).totalAmounttxt.setText(payable_amount+"");
		//	System.out.println(v.get(i).nametxt.getText()+v.get(i).disttxt.getText()+v.get(i).ch1.getSelectedItem()+v.get(i).ch2.getSelectedItem());
		//  name=v.get(i).nametxt.getText();
		//  distance=v.get(i).disttxt.getText();
		//  class=v.get(i).ch1.getSelectedItem();
		//  age=v.get(i).ch2.getSelectedItem();
		}
		totalBill();
		center.add(p);
		TotalBill=new Label("Total Bill");
		TotalBilltxt=new TextField(10);
		south.add(TotalBill);
		add(center,BorderLayout.CENTER);
		show();
	}
	public int totalBill()
	{
		int amountSum=0;
		for(int i=0;i<v.size();i++)
		{
			amountSum+=Integer.parseInt(v.get(i).totalAmounttxt.getText());
		}
		//TotalBilltxt.setText(amountSum+"");
		return amountSum;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Object obj=ae.getSource();
	}
	public int getAmountAccordingClass(String age,int classFare,int ageConsession)
	{
		consession=ageConsession+"";
		y=classFare;
		totalfare=y+fare;
		payable_amount=totalfare-((totalfare*ageConsession)/100);
		System.out.println(payable_amount);
		
		return payable_amount;
		
	}
	public int generateBill(String distanceTraveled, String sClass, String age)
	{
		
		//distanceTraveled=Integer.parseInt(distText.getText());
		//age=ch1.getSelectedItem();
		nominal_fair=10;
		fare=nominal_fair*(Integer.parseInt(distanceTraveled));
		y=0;
		totalfare=0;
		consession="";
		payable_amount=0;
		if(sClass=="First Class")
		{
			
			if(age=="0-10")
			{
				consession="100%";
				payable_amount=getAmountAccordingClass(age,firsClassFare,100);
				
			}
			if(age=="10-20")
			{
				consession="30%";
				
				payable_amount=getAmountAccordingClass(age,firsClassFare,30);
				
			}	
			if(age=="30-60")
			{
				
				consession="0%";
				
				payable_amount=getAmountAccordingClass(age,firsClassFare,100);
				
			}
			if(age=="60-100")
			{
				consession="50%";
				
				payable_amount=getAmountAccordingClass(age,firsClassFare,50);
				
			}	
				
			
		}
		//2nd class
	
		if(sClass=="Second Class")
		{
			if(age=="0-10")
			{
				consession="100%";
				
				payable_amount=getAmountAccordingClass(age,secondClassFare,100);
			}
			if(age=="10-20")
			{
				consession="30%";
				payable_amount=getAmountAccordingClass(age,secondClassFare,30);
			}	
			if(age=="30-60")
			{
				consession="0%";
				payable_amount=getAmountAccordingClass(age,secondClassFare,100);
			}
			if(age=="60-100")
			{
				consession="50%";
				payable_amount=getAmountAccordingClass(age,secondClassFare,50);
			}	
		}
		//third class
		if(sClass=="Third Class")
		{
			if(age=="0-10")
			{
				
				consession="100%";
				payable_amount=getAmountAccordingClass(age,thirdClassFare,100);
			}
			if(age=="10-20")
			{
				consession="30%";
				payable_amount=getAmountAccordingClass(age,thirdClassFare,30);
			}	
			if(age=="30-60")
			{
				consession="0%";
				payable_amount=getAmountAccordingClass(age,thirdClassFare,100);
			}
			if(age=="60-100")
			{
				consession="50%";
				payable_amount=getAmountAccordingClass(age,thirdClassFare,50);
			}	
		}
		return payable_amount;
	}	
	

	public static void main(String a[])
	{
		
		new passengerList();
		
	}
}
