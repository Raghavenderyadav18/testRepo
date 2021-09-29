package jav.interfacee;

public class MyInterface 
{
  public static void main(String[] args) 
  {
      Tesla t = new Tesla();
             t.doorOpening();
             t.camera();
             t.steering();
      
      Bmw b = new Bmw();
    		 b.doorOpening();
             b.camera();
             b.steering();
         
  }
}
