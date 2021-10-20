package jav.sportscomplex;

import java.util.Scanner;

public class ChooseSlot 
{
   public static void cricket()
   {
	   //System.out.println("choosed cricket");
	   System.out.println("Enter the Slot number");
	   Scanner sc = new Scanner(System.in);
	   int slot = sc.nextInt();
	    
	   System.out.println("Your Slot Number="+slot+"\n"+"Your Slot Timings="+CricketSlots.cricket.get(slot));
	   Data_Excel.dataToExcel(new Details(Complex.name,slot,CricketSlots.cricket.get(slot)));
	   
	   CricketSlots.cricket.remove(slot);
	   
	   System.out.println("Enter 1 to continue"+"\n"+"Enter 2 to another sport");
	   int change =  sc.nextInt();
	   if(change==1)
	   {
		   cricket();
	   }
	   else if(change==2)
	   {
		   ChooseSport.chooseSport();
	   }
	   else
	   {
		   System.out.println("choose correct sport");
		   //SportsList.sportsList();
	   }
	   
   }
   public static void badminton()
   {
	   System.out.println("Enter the Slot number");
	   Scanner sc = new Scanner(System.in);
	   int slot = sc.nextInt();
	    
	   System.out.println("Your Slot Number="+slot+"\n"+"Your Slot Timings="+BadmintonSlots.badminton.get(slot));
	   Data_Excel.dataToExcel(new Details(Complex.name,slot,BadmintonSlots.badminton.get(slot)));
	   
	   BadmintonSlots.badminton.remove(slot);
	   
	   System.out.println("Enter 1 to continue"+"\n"+"Enter 2 to another sport");
	   int change =  sc.nextInt();
	   if(change==1)
	   {
		   badminton();
	   }
	   else if(change==2)
	   {
		   ChooseSport.chooseSport();
	   }
	   else
	   {
		   System.out.println("choose correct sport");
		   //SportsList.sportsList();
	   }
   }
   public static void football()
   {
	   System.out.println("Enter the Slot number");
	   Scanner sc = new Scanner(System.in);
	   int slot = sc.nextInt();
	    
	   System.out.println("Your Slot Number="+slot+"\n"+"Your Slot Timings="+FootballSlots.football.get(slot));
	   Data_Excel.dataToExcel(new Details(Complex.name,slot,FootballSlots.football.get(slot)));
	   FootballSlots.football.remove(slot);
	   
	   System.out.println("Enter 1 to continue"+"\n"+"Enter 2 to another sport");
	   int change =  sc.nextInt();
	   if(change==1)
	   {
		   football();
	   }
	   else if(change==2)
	   {
		   ChooseSport.chooseSport();
	   }
	   else
	   {
		   System.out.println("choose correct sport");
		  // SportsList.sportsList();
	   }
	   
   }
}
