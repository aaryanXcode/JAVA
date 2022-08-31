class Num
{
	int a;
	void get(int a)
	{
		this.a=a;
	}
	Num add(Num B)
	{
		Num z=new Num();
		z.a=a+B.a;
		return z;
	} 
	void show()
	{
		System.out.println("sum of two obj is="+a);
	}	
		
};
class Add
{
	public static void main(String args[])
	{
		Num A=new Num();
		my_io in=new my_io();
		A.get(in.read_Int("enter values in obejct A"));
		Num B=new Num();
		B.get(in.read_Int("enter values in obejct B"));
		Num C;
		C=A.add(B);
		C.show();
	}
}		