
class demo_user_ex
{
        int no;
        demo_user_ex()
        {
                no=1111;
          }
          void show()
          {
                String s=new String();
                s=s+no;
                try
                {
                        if(s.length()>3 || s.length()<2)
                     throw new BinaryFormatException(no);
                }
             catch(BinaryFormatException be)
               {
                System.out.println("error "+be);
                }
	System.out.println("Program Sucessfully Executed");
            }
            public static void main(String a[])
            {
                	demo_user_ex e=new demo_user_ex();
		e.show();
            }
    }
