/*
 * @Author Mayank Jain   8th May 2019   Yokohama, Japan
 * Just a little hobby project
 * Node that will be used in Single Linked list applications
 */
package DataStructures;

public class LinkNode 
{
	private int data;
	private LinkNode next;
	
	public LinkNode( int data)
	{
		this.data = data;
		next = null;  // in Java, it is not required as class member will be initialized to null by default.
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public LinkNode getNextNode()
	{
		return next;
	}
	
	public  void setNextNode(LinkNode next)
	{
		this.next = next;
	}
	
}
