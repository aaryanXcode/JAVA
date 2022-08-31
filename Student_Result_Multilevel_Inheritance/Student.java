class Student
{
	String name;
	int age;
	int PhoneNo;
	void setData()
	{
		my_io in=new my_io();
		name=in.read_Str("enter name of student");
		age=in.read_Int("enter age of the student");
		PhoneNo=in.read_Int("enter phone no of the Student");
	}
	void show()	
	{
		System.out.println("name="+name+"\nAge="+age+"\nPhoneNo="+PhoneNo+"\n");
	}
}