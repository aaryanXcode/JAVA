import pack1.*;
import pack1.pack2.*;
class DemoPack
{
	public static void main(String a[])
	{
		pack1.Class1 A=new pack1.Class1();
		A.show();
		pack1.Class2 B=new pack1.Class2();
		B.show();

		pack1.pack2.Class1 AA=new pack1.pack2.Class1();
		AA.show();
		pack1.pack2.Class2 BB=new pack1.pack2.Class2();
		BB.show();
	}
}
		