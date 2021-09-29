package jav.composition;

class Engine
{
     String model;
     int powerInHp;
     double price;
     int torque;
     String fuelType;
    public Engine(String model, int i, double d, int torque, String string2)
     {
    
    	 this.model=model;
    	 this.powerInHp=powerInHp;
    	 this.price=price;
    	 this.torque=torque;
    	 this.fuelType=fuelType;
     }
    
}

class Car
{
   Engine e;
     public Car(Engine e)
     {
    	 this.e=e;
    	 
     }
     
     public void race()
     {
    	 int torque= e.torque;
    	 System.out.println(torque+"nm torque " +"engine is more power full for racing");
     }
     
}

public class CompositionEx
{
    public static void main(String[] args) 
    {
    	Engine e = new Engine("2-Stroke",250,400000.00,1100,"Diesel");
		Car c = new Car(e);
		c.race();
	}
    
}
