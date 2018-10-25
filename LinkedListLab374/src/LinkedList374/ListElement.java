/**
 * 
 */

/**
 * @author Kegan Lavoy
 *
 */
package LinkedList374;
public class ListElement {
	
	
	public ListElement next;
	//private ListEl
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
		this.data = 0;
		
	}
	
	
	public void setData(int data)
	{
		this.data = data;
	}

	
	public int getData()
	{
		return this.data;
	}
	
	public void setNext(ListElement next)
	{
		this.next = next;
	}
	
	public ListElement getNext()
	{
		return this.next;
	}
	
	
}