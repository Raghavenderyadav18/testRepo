package jav.constructors;

class Addition
{
   int a;
   int b;
   
   double d;
   float f;
   
   public Addition()
   {
	   a=1;
	   b=2;
	   System.out.println(a+"+"+b +"="+(a+b));
   }
   
   public Addition(int a,int b)
   {
	   this();
	   
	   this.a=a;
	   this.b=b;
	   System.out.println(a+"+"+b +"="+(a+b));
   }
   public Addition(double d,float f)
   {
	   this(5,3);
	   
	   this.d=d;
	   this.f=f;
	   System.out.println(d+"+"+f +"="+(d+f));
   }   
}

public class ConstructorChaining1 
{
	public static void main(String[] args)
	{
           Addition add = new Addition(2.5,3.5f); 
		    //new Addition(2.5,3.5f); 
	}

}
