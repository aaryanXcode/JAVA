class BinaryFormatException extends Exception
{
        String msg;
        BinaryFormatException(int val)
        {
                msg="BinaryFormatException Error"+val;
	
         }
        public String toString()
         {
                return(msg);
         }
}


