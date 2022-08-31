class StudentDetails
{
	String name;
	int RollNo,Physics,Chemistry,Math;
	double Percentage,Total;
	void setData()
	{
		my_io in=new my_io();
		name=in.read_Str("enter name");
		RollNo=in.read_Int("enter RollNo");
		Physics=in.read_Int("enter Physics marks");
		Chemistry=in.read_Int("enter chemistry marks");
		Math=in.read_Int("enter Maths Marks");
	}
	void percentage()
	{
		int full_marks=300;
		Total=Physics+Chemistry+Math;
		Percentage=(Total/full_marks)*100;
		System.out.println("\n");
	}
	void show()
	{
		System.out.println("name="+name+"\nRollNo="+RollNo+"\nPhysics="+Physics+"\nChemistry="+Chemistry+"\nMaths="+Math+"\nPercentage="+Percentage+"\nTotal="+Total+"\n");
	}
	double avgPercentage()
	{
		return(Percentage);
	}
	void aboveAvg(double avg)
	{
		if(Percentage>avg)
			show();
	}
	void belowAvg(double avg)
	{
		if(Percentage<avg)
			show();
	}
}
class BelowAvgStudent
{
	public static void main(String args[])
	{
		StudentDetails x[]=new StudentDetails[3];
		double avg=0;
		for(int i=0;i<3;i++)
		{
			x[i]=new StudentDetails();
			x[i].setData();
			x[i].percentage();
			x[i].avgPercentage();
			avg=avg+(x[i].avgPercentage());
		}
		avg=avg/3;
		System.out.println("avg percentage is="+avg+"\n");
		System.out.println("List of baove avg student");
		for(int i=0;i<3;i++)
		{
			x[i].aboveAvg(avg);
		}
		System.out.println("List of below avg student");
		for(int i=0;i<3;i++)
		{
			x[i].belowAvg(avg);
		}
		System.out.println("\n");
	}
}
		
		