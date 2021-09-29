package jav.decisionstatments;

public class SwitchStmt 
{
	public static void main(String[] args) 
	{
        int option=6;
        
        switch(option)
        {
        case 1: 
            System.out.println("outlook");
	        break;
	    
        case 2:
        	System.out.println("word");
        	break;
        case 3:
        	System.out.println("notepad");
            break;
        case 4:
        	System.out.println("powerpoint");
            break;
         
        default :System.out.println("enter valid option");
        }
	}   

}
