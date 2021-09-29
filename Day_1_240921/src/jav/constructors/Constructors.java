package jav.constructors;

class Student
{
    int id;
    String name;
    double fee;
    
    public Student()
    {
    	id=01;
    	name="Raghavender Yadav";
    	fee=50000.0;
    }
    
    public Student(int id,String name,double fee)
    {
    	this.id=id;
    	this.name=name;
    	this.fee=fee;
    }
    
    public String toString()
    {
    	return "Id="+id+"-->Name="+name+"-->Fee="+fee;
    }
}
public class Constructors 
{
	public static void main(String[] args)
	{
       
		Student s1 = new Student(); 
	    System.out.println(s1);        
        
	    Student s2 = new Student(02,"Kohli",60000.0);
        System.out.println(s2);
	}
}
