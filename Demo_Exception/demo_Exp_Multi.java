 class demo_Exp_Multi
{
	int x;
	int y;
	String z[]=new String[3];
	int i;

	int ch;
	demo_Exp_Multi()	
	{
		i=0;
		int pre_index=0;
		my_io in=new my_io();
		do
		{
			x=in.read_Int("Enter The no:");
			y=in.read_Int("Enter The no:");
			try
			{
				pre_index=i;
				z[i]=new String();
				z[i]="The Result of "+ x+"\\"+y+"is:"+ (x/y);
				i++;
			}
			catch(ArithmeticException e)
			{
				//System.out.println("Exception :"+e);
				z[i]="The Result of "+ x+"\\"+y+"is: infinity ";
				i++;	
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception :"+e);
				i=pre_index;
			}
			ch=in.read_Int("do u want to conti:1/0"); 			
		}while(ch==1 || ch==2);
		 
		for(int j=0;j<i;j++)
		System.out.println(z[j]);

		System.out.println("<<\t<<PROGRAM SUCESSFULLY COMPLETED>>");

	}
	public static void main(String a[])
	{	
		new demo_Exp_Multi();
	}
}
		