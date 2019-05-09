/*
 * @Author Mayank Jain   8th May 2019   Yokohama, Japan
 * Just a little hobby project
 * A common method to insert nodes at any location 
 * 2 Separate methods to insert node at beginning and last
 * A common method to delete a node at any position
 * 2 Separate methods to delete node at first and last
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
	public synchronized void insertAtBegin(int data)
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
	public synchronized void insertAtEnd(int data)
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
	
	/*
	 * if any valid position is given , error will be thrown instead of adjusting to border position
	 * node will be inserted as Head if position is 0 or given list is empty
	 */
	public synchronized void insert(int data, int position)
	{
		LinkNode newNode = new LinkNode(data);
		
		if(position < 0 || position >length )
		{
			throw new IllegalArgumentException("please provide proper position");
		}
		
		//if list is empty make it head node
		if(head == null)
		{
			head = newNode;
			length++;
			return;
		}
		
		//if node need to be added at beginning
		if(position == 0)
		{
			insertAtBegin(data);
			return;
		}
		
		LinkNode currentNode = head;
		LinkNode previoudNode = head;
		int currentPos = 0;
		
		while(currentPos!=position)
		{
			previoudNode = currentNode;
			currentNode = currentNode.getNextNode() ;
			currentPos++;
		}
		
		previoudNode.setNextNode(newNode);
		newNode.setNextNode(currentNode);
		return;
	}
	
	/*
	 * it will check if list empty , an error will be returned
	 * it will  save value of node in temporary variable  and assign node next to head node 
	 * as new head of list
	 */
	public synchronized int removeFromBegin()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			throw new RuntimeException("list is empty");
		}
		
		LinkNode node = head;
		int data  = node.getData(); // save data of current head so we can return it
		head = head.getNextNode(); // assign next node to head as head node
		node.setNextNode(null);
		length--;
		return data;
	}
	
	/*
	 * it will check if list empty , an error will be returned
	 * it will traverse list till end node is found
	 * if list contains only a single node, list head will be set to null
	 */
	public synchronized int removeFromLast() throws Exception
	{
		if(head==null)
		{
			System.out.println("List is empty");
			throw new Exception("list is empty");
		}
		
		LinkNode currentNode = head; 
		LinkNode previousNode = null;
		while(currentNode!=null)
		{
			if(currentNode.getNextNode() == null) // this is the last node
			{
				if(previousNode==null) 
				{ // list had only one element 
					head = null;
					break;
				}
				//List has more than one element
				previousNode.setNextNode(null);
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}	
		length--;
		return currentNode.getData();
	}
	
	/*
	 * it will delete node from specified position 
	 * first node is at 0 indexed
	 */
	public synchronized  int remove(int position)
	{
		if( position < 1 || position > length-1 )
		{
			throw new IllegalArgumentException("please provide valid index");
		}
		
		//todo 
		return -1;
	}
	

}
