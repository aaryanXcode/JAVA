class AcademicDetails
{
	int Physics,Chemistry,Maths,Total;
	String name;
	double Percentage;
	void getData(String name,int a ,int b,int c)
	{
		this.name=name;
		this.Physics=a;
		this.Chemistry=b;
		this.Maths=c;
	}
	void Percentage_of()
	{
		int Full_Marks=300;
		Total=Physics+Chemistry+Maths;
		Percentage=(Total/3);
	}
	void show()
	{
		System.out.println("\nname:"+name+"\nPhysics: "+Physics+"\nChemistry:"+Chemistry+"\nMaths:"+Maths+"\nTotal:"+Total+"\nPercentage:"+Percentage+"\n");
	}
}
class StudentResult
{
	public static void main(String args[])
	{
		int i;
		AcademicDetails  x[]=new AcademicDetails[3];
		my_io in=new my_io();
		for(i=0;i<3;i++)
		{
			 x[i]=new AcademicDetails();
			System.out.println("\nstudent "+(i+1)+"\n");
			x[i].getData(in.read_Str("enter name"),in.read_Int("enter Physics number"),in.read_Int("enter Chemistry number"),in.read_Int("enter Maths number"));
			x[i].Percentage_of();
		}
		for(i=0;i<3;i++)
		{
			System.out.println("Result of  "+(i+1)+" student");
			x[i].show();
		}
	}
}
			