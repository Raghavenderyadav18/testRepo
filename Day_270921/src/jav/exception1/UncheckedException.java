package jav.exception1;

public class UncheckedException
{
	public static void main(String[] args) 
	{
		  try
		  {
		    int a=10/0;
            System.out.println("a="+a);
		  }
		  catch(ArithmeticException ae)
		  {
			  System.out.println("cannot no divisible by 0");
		  }
		   
		  System.out.println("rest of the program");
	}
}
