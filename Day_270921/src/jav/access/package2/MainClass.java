package jav.access.package2;
import jav.access.package1.*;

public class MainClass extends AccessModifiers
{
   public static void main(String[] args)
   {
	   MainClass mc = new MainClass();
 	  
 	  System.out.println("public1="+mc.public1);
 	 System.out.println("protected1="+mc.protected1);
 	  //System.out.println("default1="+mc.default1);
 	 // System.out.println("private1="+mc.private1);
   }
}
