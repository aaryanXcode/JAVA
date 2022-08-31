class StudentAcademic extends Student
{
	int Physics,Chemistry,Math;
	
	void SetData()
	{
		my_io in=new my_io();
		Physics=in.read_Int("enter Physics marks");
		Chemistry=in.read_Int("enter Chemistry marks");
		Math=in.read_Int("enter maths marks");
	}
	void show()
	{
		System.out.println("Physics="+Physics+"\nChemistry="+Chemistry+"\nMaths="+Math+"\n");
	}
}