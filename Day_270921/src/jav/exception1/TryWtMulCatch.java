package jav.exception1;

public class TryWtMulCatch
{

	public static void main(String[] args) 
	{
		  try
		  {
		    int a=25/5;
            System.out.println("a="+a);
            
            int[] arr = new int[3];
             arr[3]=10;
		  }
		  catch(ArithmeticException ae)
		  {
			  System.out.println("cannot no divisible by 0");
		  }
		  catch(ArrayIndexOutOfBoundsException ae)
		  {
			  System.out.println("index is out of size");
		  }
		   
		  System.out.println("rest of the program");
	}

}
