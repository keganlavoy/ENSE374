package LinkedList374;

/*
*
*
* @author Kegan Lavoy
*/


public class LinkedList {
	   
	ListElement head;
	
	public void addElement(ListElement element)
	    {
		    ListElement temp = head;
		    if (head == null)
		    {
		    	head = element;
		    }
		    
		    else
		    {
		    	while(temp.getNext() != null)
		    	{
		    		temp = temp.getNext();
		    	}
		    	
		    	temp.setNext(element);
		    }
	    }
	    
	    
	    
	    
    }