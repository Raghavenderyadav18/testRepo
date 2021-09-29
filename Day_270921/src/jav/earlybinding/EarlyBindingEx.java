package jav.earlybinding;

public class EarlyBindingEx 
{
    public static void main(String[] args)
    {
	    MOvrLd mld = new MOvrLd();
	    Animal a = new Tiger();
	    
	      mld.method1(a);
	}    
}
