package LinkedList374;

/*
*
*@author Kegan Lavoy
*/


public class main
{
	
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args)
	{
		ListElement element1 = new ListElement();
		ListElement element2 = new ListElement();
		ListElement element3 = new ListElement();
		ListElement element4 = new ListElement();
		ListElement element5 = new ListElement();
		
		
		
		element1.setData(1);
		element2.setData(2);
		element3.setData(3);
		element4.setData(4);
		element5.setData(5);
		
		
		
		LinkedList list = new LinkedList();
		
		
		
		System.out.print("adding elements 1 through 5\n");
		list.addElement(element1);
		list.addElement(element2);
		list.addElement(element3);
		list.addElement(element4);
		list.addElement(element5);
		
		
		
		list.printLinkedList();
		
		
		ListElement temp = new ListElement();
		
		System.out.print("Getting element 0\n");
		temp = list.getElement(0);
		System.out.print("Element 0 is " + temp.getData() + "\n\n");
		
		System.out.print("Getting element 2\n");
		temp = list.getElement(2);
		System.out.print("Element 2 is " + temp.getData() + "\n\n");
		
		
		System.out.print("Deleting elements: \n");
		
		System.out.print("Delete element that contain a 2: \n");
		list.deleteElement(2);
		list.printLinkedList();
		
		System.out.print("\n");
		
		System.out.print("Delete head: \n");
		list.deleteElement(1);
		list.printLinkedList();
		
		System.out.print("\n");
		
	}
	
	
}