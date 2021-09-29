package jav.this_super;

class Parent
{
   int a=1;
   int b=2;
   
     
    public Parent()
    {
       System.out.println("super-class  constructor");
    }
   
   public void method1()
   {
	   System.out.println("Parent calss method1");
   }
   
}

class Child extends Parent
{
   int a=4;
   String name;
   
   public Child()
   {
       super();	
       System.out.println("sub-class constructor ");       
   }
   
   public void method1()
   {
	   System.out.println("child cls a="+a);
	   System.out.println("super cls a="+super.a);
	   
	   super.method1();
   }
}

public class Super1
{
   public static void main(String[] args) 
   {
	    Child c = new Child();
	    c.method1();
   }	
}