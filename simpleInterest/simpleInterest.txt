class Data
{
	int P,R,T,SI;
	void setData(int x,int y,int c)
	{
		P=x;
		R=y;
		T=c;
	}
	void simpleInterest()
	{
		SI=(P*R*T)/100;
	}
	void show()
	{
		System.out.println("Simple iterest is="+SI);
	}
}
class SI
{
	public static void main(String args[])
	{
		Data D;
		D=new Data();
		D.setData(500,4,5);
		D.simpleInterest();
		D.show();
	}
}