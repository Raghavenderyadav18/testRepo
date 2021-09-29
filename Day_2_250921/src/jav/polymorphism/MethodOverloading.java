package jav.polymorphism;

class Calculator
{
  
  public void addition()
  {
	 int num1=5;
	 int num2=6;
	 System.out.println("num1+num2="+num1+num2);
  }
  public int addition(int a,int b)
  {
	 return a+b;
  }
  
  public void addition(double d, float f)
  {
	  System.out.println(d+f);
  }
  
}

public class MethodOverloading {

	public static void main(String[] args)
	{
        Calculator cal = new Calculator();
           cal.addition();
           
           int sum1=cal.addition(4,8);
           System.out.println(sum1);
           
           cal.addition(5.4,9.8f);
           
	}

}
