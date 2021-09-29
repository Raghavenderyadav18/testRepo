package jav.access.package1;

public class AccessModifiers 
{
   public int public1 = 10;
   protected int protected1 = 20;
   int default1 =30; 
   private int private1 =20;
   
   public void method1()
   {
       System.out.println("(public modifier) ="+public1);	   
       System.out.println("(protected modifier) ="+protected1);
       System.out.println("(default modifier) ="+default1);
       System.out.println("(private modifier)="+private1);
   }
}
