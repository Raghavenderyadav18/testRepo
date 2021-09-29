package jav.exception1;

class NotEligibleException extends RuntimeException
{
   NotEligibleException(String str)
   {
	   super(str);
   }
}

class Age 
{
   public void eligibleAge(int age) 
   {
	   if(age>18)
	   {
		   System.out.println("Eligible to vote");
	   }
	   else
	   {
		   throw new NotEligibleException("Not Eligible to vote");
	   }
   }
}

public class CustomException
{
   public static void main(String[] args) 
   {
	   Age a = new Age();
	   a.eligibleAge(17);
   }      
}
