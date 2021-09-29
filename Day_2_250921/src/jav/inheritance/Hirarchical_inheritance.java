package jav.inheritance;

class A
{
   public void method1()
   {
	   System.out.println("A_method1");
   }
   public void method2()
   {
	   System.out.println("A_method2");
   }   
}

class B extends A
{
   public void method1()
   {
	   System.out.println("B_method1");
   }
   public void method3()
   {
	   System.out.println("B_method3");
   }   
}

class C extends A
{
   public void method1()
   {
	   System.out.println("C_method1");
   }
   public void method4()
   {
	   System.out.println("C_method4");
   }   
}


public class Hirarchical_inheritance {

	public static void main(String[] args)
	{
       B b = new B();
        b.method1();
        b.method2();
        b.method3();
        
      C c = new C();
        c.method1();
        c.method2();
        c.method4();
		
	}

}
