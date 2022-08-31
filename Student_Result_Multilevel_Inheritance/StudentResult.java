class Result extends StudentAcademic
{
	double Total,Percentage;
	void Result()
	{
	
		int full_marks=300;
		Total=Physics+Chemistry+Math;
		Percentage=Total/3;
	}
	void show()
	{
		System.out.println("Total="+Total+"\nPercentage="+Percentage+"\n");
	}
}
class StudentResult
{

	public static void main(String args[])
	{	
		
		Result C[]=new Result[3];
		
		System.out.println("enter student data\n");
		for(int i=0;i<3;i++)
		{	
			C[i]=new Result();
			C[i].setData();
			C[i].setData();
		}
		System.out.println("Printing Student All Data\n");
		for(int i=0;i<3;i++)
		{
			
			//R.show();
		}
		System.out.println("\nProgram ends......\n");
	}
		
}