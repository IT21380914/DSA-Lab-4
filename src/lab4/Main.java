package lab4;

public class Main {

	public static void main(String[] args) {
		/* Part A
		Link student1=new Link("Nipuna",53.5);
		Link student2=new Link("Aravinda",78.0);
		Link student3=new Link("Prashani",69.5);
	
		
		student1.next=student2;
		student2.next=student3;
		student3.next=null; //not needed.
		
		student1.display();
		student2.display();
		student3.display();
		
		//printing using the connection
		
		student1.next.display();
		student1.next.next.display();*/
		
		
		
		
		
		//PART B
		
		
		LinkList newList=new LinkList();
		
		newList.insertFirst("Prashani",69.5);
		newList.insertFirst("Aravinda",78.0);
		newList.insertFirst("Nipuna",53.5);
		
		newList.displayList();
		
		
		newList.deleteLink("Aravinda");
		
		newList.displayList();
		
       newList.deleteLink("Nipuna");
		
		newList.displayList();
	}

}
