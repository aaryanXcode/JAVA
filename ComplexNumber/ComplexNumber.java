class Complex
{
	int real;
	int imaginary;
	void setData()
	{
		my_io in=new my_io();
		real=in.read_Int("enter real part");
		imaginary=in.read_Int("enter imaginary part");
	}
	void show()
	{
		System.out.println(real+"+"+imaginary+"j");
	}
	Complex add(Complex B)
	{
		Complex Z=new Complex();
		Z.real=real+B.real;
		Z.imaginary=imaginary+B.imaginary;
		return Z;
	}
}
class ComplexNumber
{
	public static void main(String args[])
	{
		Complex a=new Complex();
		Complex b=new Complex();
		Complex c=new Complex();
		a.setData();
		b.setData();
		c=a.add(b);
		c.show();
	}
}
	