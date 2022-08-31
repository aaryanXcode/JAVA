public class PercentFormatException extends Exception
{
	String s;
	public PercentFormatException(int per)
	{
		if(per<0)
		s="Percent Value Can't be Below Zero ";
		else if(per>100)
		s="Percent Value Can't be More Then 100" ;
	}
	public String toString()
	{
		return(s);
	}
}