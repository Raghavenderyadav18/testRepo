package jav.operators;

public class UnaryOperator 
{

	public static void main(String[] args) 
	{
         int num1=5;
         
         System.out.println(++num1); //pre-increment
         
         int num2=5;
         System.out.println(num2++); //post-increment
         
         int num3=5;
         System.out.println(--num3); //pre-decrement
   
         int num4=5;
         System.out.println(num4--); //post-decrement
         
         int num5=6;
         System.out.println(~num5);
         
         boolean b =true;
         System.out.println(!b); //compliment operator
            
	}

}
