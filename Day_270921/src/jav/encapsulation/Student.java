package jav.encapsulation;

public class Student 
{
   private int id;
   private String name;
   private double fee;
     
     public int getId()
     {
	     return id;
     }
     public void setId(int id)
     { 
    	 //if(id>100)
	     this.id = id;
     }

     public String getName()
     {
	     return name;
     }
     public void setName(String name)
     {
	     this.name = name;
     }

     public double getFee()
     {
	      return fee;
     }
     public void setFee(double fee) 
     {
	     this.fee = fee;
     }
   
}
