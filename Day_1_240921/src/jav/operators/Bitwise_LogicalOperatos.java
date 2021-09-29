package jav.operators;

    public class Bitwise_LogicalOperatos 
    { 
      public static void main(String[] args) 
      {
		  int num1=2;
		  int num2=5;
		  int num3=3;
		  
		 //System.out.println(num1++ > --num2 & num2-- > num3++);
         //System.out.println(num2);//num2=3
         
         //System.out.println(num1++ > --num2 && num2-- > num3++);
         //System.out.println(num2);//num2=4
         
         //System.out.println(num1++ < --num2 | num2-- < num3++);
         //System.out.println(num2);//num2=3
         
         System.out.println(num1++ < --num2 || num2-- < num3++);
         System.out.println(num2);//num2=4
		 
	  }
    }
