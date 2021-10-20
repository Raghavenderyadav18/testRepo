package jav.sportscomplex;

import java.util.ArrayList;
import java.util.List;

public class SportsList
{
  public static void sportsList()
  {
	  List<String> list = new ArrayList();
	  list.add("1--Cricket");
	  list.add("2--Badminton");
	  list.add("3--Football");
	  
	  //list.forEach((list1)->System.out.println(list));
	  for(String str : list)
	  {
		  System.out.println(str);
	  }
  }
}
