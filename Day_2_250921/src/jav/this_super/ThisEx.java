package jav.this_super;

class One
{
   int a;
   int b;

   public One()
   {
	   a=1;
	   b=2;
   }
   
   public One(int a,int b)
   { 
	    this();
	    
	   this.a=a;
	   this.b=b;
   }
   
   
   public void method1()
   {
	   System.out.println("method1");
   }
   public void method2()
   {
	   System.out.println("method2");
	   this.method1();
   }
   
}

public class ThisEx 
{
	public static void main(String[] args)
	{
        One o = new One(5,6);
          o.method1();
          
          
	}
}
