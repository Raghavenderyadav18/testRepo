package jav.exception1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx1 
{
   public static void main(String[] args) throws IOException
   {
	   FileReader fr = new FileReader(new File("C:\\Automation\\abc.txt"));
	   
	     int  ch;
	      while((ch=fr.read())!=-1)
	      {
	    	  System.out.print((char)ch);
	      }
	      fr.close();
   }
}
