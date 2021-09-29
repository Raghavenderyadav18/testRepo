package jav.inheritance;

class One
{
	public void method1()
	{
		System.out.println("COne-method1");
	}
	
	public void method2()
	{
		System.out.println("COne-method2");
	}
}

class Two extends One
{
	public void method1()
	{
		System.out.println("CTwo-method1");
	}	
	public void method3()
	{
		System.out.println("CTwo-method3");
	}
}
class Three extends Two
{
	public void method3()
	{
		System.out.println("CThree-method3");
	}	
	public void method4()
	{
		System.out.println("CThree-method4");
	}
}

public class Multi_level_Inheritance 
{

	public static void main(String[] args) 
	{
         Three t3 = new Three();
        		 t3.method1();
        		 t3.method2();
        		 t3.method3();
        		 t3.method4();
	}

}
