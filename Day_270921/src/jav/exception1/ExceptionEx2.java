package jav.exception1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx2 
{
	
	public static void main(String[] args)
	{
		FileReader fr=null; 
		try
		{
			//risky code
		   fr = new FileReader(new File("C:\\Automation\\abc.txt"));
		   
	      int  ch;
	      while((ch=fr.read())!=-1)
	      {
	    	  System.out.print((char)ch);
	      }
	      
		}
		catch(IOException ioe)
		{
			// handling code
			System.out.println("File Not Found...???");
		}
		
		finally
		{  
		   try
		   {
		   fr.close();
		   }
		   catch(IOException ioe)
		   {
			   //handling code. 
		   }
		}
		
		 System.out.println("Rest of the program will get executed..");
	}

}
