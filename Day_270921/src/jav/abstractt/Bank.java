package jav.abstractt;

public abstract  class Bank 
{
  public void withDraw()
  {
	  System.out.println("withdraw.. ");
  }
  
  public void deposit()
  {
	  System.out.println("deposit..");
  }
  
  public abstract void loan();
}
