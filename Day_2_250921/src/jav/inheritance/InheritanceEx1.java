package jav.inheritance;

class RealmeXt
{
   public void processer()
   {
	   System.out.println("snapdragon 712_G ");
   }
   public void camera()
   {
	   System.out.println("48-Mp camera");
   }
   public void ram()
   {
	   System.out.println("Ram=8gb");
   }
}

class RealmeX2 extends RealmeXt
{
   	public void processor()
   	{
   		System.out.println("snapdragon 730_g");
   	}
   	
   	public void fingerPrintSensor()
   	{
   		System.out.println("Finger print Sensor");
   	}
}

public class InheritanceEx1 
{
   public static void main(String[] args) 
   {
	   RealmeX2 Rx2 = new RealmeX2();
	    Rx2.processor();
	    Rx2.camera();
	    Rx2.ram();
	    Rx2.fingerPrintSensor();
   }
}
