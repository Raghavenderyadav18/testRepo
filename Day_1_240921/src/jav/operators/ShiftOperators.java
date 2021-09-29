package jav.operators;

public class ShiftOperators 
{
    public static void main(String[] args)
    {
	    int a=5;
	    System.out.println(a<<3);//n*2^s==> 5*2^3==>5*8==>40   n=number and s=shifts
	    
	    int b=-5;
	    System.out.println(b<<3);//-(n*2^s)==> -(5*2^3)==> -(5*8)==> -40   n=number and s=shifts
	    
	    int c=10;
	    System.out.println(c>>2);//n/2^s==>10/2^2==>10/4==>2  
	    
	    int d=-10;
	    System.out.println(d>>2); 
	    
	    int e=10;
	    System.out.println(d>>>2); 
	    
	}
}
