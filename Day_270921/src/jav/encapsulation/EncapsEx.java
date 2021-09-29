package jav.encapsulation;

public class EncapsEx
{
	public static void main(String[] args)
	{
         Student s = new Student();
         s.setId(18);
         s.setName("Kohli");
         s.setFee(50000.0);
         
         
         System.out.println("Id="+ s.getId() + "  Name="+s.getName()+" Fee="+s.getFee());
	}
}
