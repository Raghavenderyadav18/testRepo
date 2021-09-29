package jav.variables;

public class InstStatLocVariables 
{
   int instVar=1;//instance variable
   static int statVar=2;//static variable
   
	public static void main(String[] args) 
	{
        int locVar=3;//local variable
        
        InstStatLocVariables inl = new InstStatLocVariables(); 
        
        System.out.println("Instance variable="+inl.instVar);
        
        //System.out.println("Static variable="+inl.statVar);
        System.out.println("Static variable="+InstStatLocVariables.statVar);
        
        System.out.println("Local variable="+locVar);
	}

}
