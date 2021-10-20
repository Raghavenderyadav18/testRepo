package jav.sportscomplex;

import jav.sportscomplex.*;
import java.util.Scanner;

public class Complex 
{
	static String name;
	public static void detailsOfPlayer()
	{
		System.out.println("Enter Your Name::");
	       Scanner sc = new Scanner(System.in);
	       
	       name = sc.next();
	       
	       System.out.println("Welcome-->"+name);
	       
	}
	public static void main(String[] args) 
	{
		detailsOfPlayer();
       CricketSlots.cricketSlots();
       BadmintonSlots.badmintonSlots();
       FootballSlots.footballSlots();
       //SportsList.sportsList();
       ChooseSport.chooseSport();
      
       
       
	}
}
