package jav.sportscomplex;

import java.util.Map;
import java.util.Scanner;

import jav.sportscomplex.*;
public class ChooseSport 
{
   public static void chooseSport()
   {
	   SportsList.sportsList();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter given number to choose your sport:");
	   int select = sc.nextInt();
	   
	   switch(select)
	   {
	   case 1:
		   System.out.println("[CONGRAGULATIONS YOU CHOOSED -->CRICKET]");
		    for(Map.Entry<Integer, String> ck:CricketSlots.cricket.entrySet())
		    {
		    	System.out.println(ck.getKey()+"="+ck.getValue());
		    }
		    
		    ChooseSlot.cricket();
		    break;
	   case 2:
		    System.out.println("[CONGRAGULATIONS YOU CHOOSED -->BADMINTON]");
		    for(Map.Entry<Integer, String> ck:BadmintonSlots.badminton.entrySet())
		    {
		    	System.out.println(ck.getKey()+"="+ck.getValue());
		    }
		    
		    ChooseSlot.badminton();
		    break;
	   case 3:
		   System.out.println("[CONGRAGULATIONS YOU CHOOSED -->FOOTBALL]");
		    for(Map.Entry<Integer, String> ck:FootballSlots.football.entrySet())
		    {
		    	System.out.println(ck.getKey()+"="+ck.getValue());
		    }
		    
		    ChooseSlot.football();
		    break;
		    
	   }
   }
}
