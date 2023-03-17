package lab4;

public class LinkList {
 
	private Link first;
	
	public LinkList()
	{
		this.first=null;
	}
	
	public boolean isEmpty()
	{
		return (first==null);
	}
	
	public void displayList()
	{
		Link current=first;
		
		while(current!=null)
		{
			current.display();
			current=current.next;
		}
	}
	public void insertFirst(String name,double average)
	{
		Link newLink= new Link(name,average);//create new link
		newLink.next=first;//link new link to existing link
		first=newLink;//assign new link as first value
	}
	
	public Link deleteFirst()
	{
		Link temp=first;//save the reference of the first temp
		first=first.next;//change the first reference to next available link
		return temp;//returning the first value
	}
	
	public Link deleteLink(String name)
	{
		Link current=first;
		Link previous=first;
		
		if(current==null)
		{
			return null;
		}
		
			while(!current.name.equals(name))
			{
				previous=current;
				current=current.next;
				
				if(current==null)
				{
					return null;
				}
			}
			if(current==first)
			{
				first=first.next;
			}
			else {
			
			previous.next=current.next;
			}
			
			return current;
		}
		
		
	    
	
	
	
	
	
}
