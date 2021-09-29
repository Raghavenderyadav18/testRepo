package jav.exception1;

public class ThrowKeyWd
{
	public static void main(String[] args) 
	{
        ArithmeticException ae = new ArithmeticException("divide by 0");
         throw ae;
	}

}
