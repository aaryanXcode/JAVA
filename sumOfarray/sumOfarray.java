class array
{
	int a[]=new int[5];
	int sum=0;
	void getData()
	{
		int i;
		my_io in=new my_io();
		for(i=0;i<5;i++)
		{
			a[i]=in.read_Int("enter "+i+1+"  number");
		}
	}
	void sum()
	{
		int i;
		for(i=0;i<5;i++)
			sum=sum+a[i];
	}
	void show()
	{
		System.out.println("sum of array is="+sum);
	}
}
class sumOfarray
{
	public static void main(String args[])
	{

		array x=new array();
		x.getData();
		x.sum();
		x.show();
	}
}
		