class demo_throw_userdefine
{
        public static void main(String args[])
        {
                int per;
	my_io in=new my_io();
	per=in.read_Int("Enter Percentage:");
                try
                {
                        if(per<0||per>100)
                        {
                                throw new PercentFormatException(per);
                        }
                 }
                 catch(PercentFormatException e)
                 {
                        System.out.println("the Exception :"+e);
                 }
        }
}
  
