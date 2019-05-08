/*
 * @Author Mayank Jain   8th May 2019   Yokohama, Japan
 * Just a little hobby project
 * A common method to insert nodes at any location 
 * 3 Separate methods to insert node at beginning , middle and last
 * A common method to delete a node
 * 3 Separate methods to delete node at first , last and middle
 */

package DataStructures;
import DataStructures.LinkNode;

public class SingleLinkList
{
	private int length;  // it will contain list length
	private LinkNode head;  // it will save the starting node of list.
	//Constructor
	public SingleLinkList()
	{
		length = 0;
	}
	
	// to return Head Node
	public synchronized LinkNode getHead()
	{
		return head;
	}
	
	/*
	 * it will start from first node and traverse list till end node is found ( next value will be null for last Node
	 * it will print each node value
	 * it will return length of list
	 * Space complexity O(1)  time complexity O(n)
	 */
	public int traverse(LinkNode head)
	{
		int length = 0;
		LinkNode currentNode = head;   //Space Complexity = O(1)  for creating this  temporary variable
		
		while(currentNode!=null)    // time complexity = O(n) for  traversing n elements 
		{
			length++;  // count current node for list length
			System.out.println("Value at node"+ length+ " is "+ currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
		
		if( length == 0 )  // not a required step 
		{
			System.out.println("list is empty");
		}
		
		return length;
	}
	
	
	/*
	 * Need to create a new Node with provided data
	 * assign this new node as Head of Link list to keep it at beginning
	 * assign old head node as next Node to new Head Node
	 * There is no need to check if old Head Node is null, it will be take cared automatically
	 * increase length of list by one
	 * */
	public void insertAtBegin(int data)
	{
		//create new node with provided data
		LinkNode newNode = new LinkNode(data);
		newNode.setNextNode(head);
		head = newNode;
		length++; 
	}
	
	
	/*
	 * Create New Node with provided data
	 * Check if list is empty, add new node as head Node
	 * if list is not empty, traverse list till last node is found
	 *  attach new node to last node
	 *  increase list  length
	 */
	public void insertAtEnd(int data)
	{
		//create new node with provided data
		LinkNode newNode = new LinkNode(data);
		
		//check if list empty , if it empty just add the node as it will be the first Node
		if( head== null )
		{
			head = newNode;
			length++;
			return;
		}
		
		//node to traverse till last node
		LinkNode currentNode = head;
		do{
			if(currentNode.getNextNode()==null)
			{
				currentNode.setNextNode(newNode); // last Node is found , so add new node to it
				length++;   // increase length of list for newly added node
			}
			currentNode = currentNode.getNextNode();
		}while(currentNode!=null);
	}
	

}