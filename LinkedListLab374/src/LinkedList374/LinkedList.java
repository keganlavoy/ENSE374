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
	    
	    
    public ListElement getElement (int index)
    {
    	
    	ListElement temp = head;
    	int counter = 0;
    	
    	
    	if (temp == null)
    	{
    		System.out.print("The list is empty");
    		return(temp);
    	}
    	
    	
    	while(counter < index && temp != null)
    	{
    		temp = temp.getNext();
    		counter++;
    	}
    	
    	return(temp);
    }
	
	
	
	
	
	
	
	
	
	
	    
    }