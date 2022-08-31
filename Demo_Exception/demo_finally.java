class demo_finally
{
        int a,b,c;
        String msg;
        demo_finally()
        {
                msg=new String();
                a=15;
                b=0;
                c=0;
         }
	
         void div() throws ArithmeticException
         {
      	try
           	{
		c=a/b;
		
         	}
	finally
        	{
        	              msg="The division is=";
          	}
         }
          void show()
          {
                System.out.println(msg+c);
          }
	public static void main(String x[])
          {
                demo_finally a;
                a=new demo_finally();
                try
                {
                        a.div();
           
               }
               catch(ArithmeticException ae)
               {
                         a.msg=a.msg+"infinity";
               }
                  a.show();
        }
  }
