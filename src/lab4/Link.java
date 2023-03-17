package lab4;

public class Link {
	
	public String name;
	public double average;
	public Link next;
	
	//Constructor
	public Link(String name,double average)
	{
		this.name=name;
		this.average=average;
		this.next=null;
	}
	
	
	
	//display method
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Average :"+average);
		System.out.println("*********");
	
	}

}
