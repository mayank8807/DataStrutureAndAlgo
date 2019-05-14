package CodingProblem;

public class CQueue1<T> implements Queue<T> {

	private final T head;
	private final CQueue1<T> tail;
	private final int size;
	CQueue1()
	{
		head= null;
		tail = null;
		size=0;
	}
	
	CQueue1(T head, CQueue1<T> tail)
	{
		this.head = head;
		this.tail = tail;
		size = tail.size+1;
	}
	
	@Override
	public Queue<T> enQueue(T t) {
		
		return new CQueue1(t,this);
	}

	@Override
	public Queue<T> deQueue() {
		return this.tail;
	}

	@Override
	public T head() {
		// TODO Auto-generated method stub
		return this.head;
	}

	@Override
	public boolean isEmpty() {
		if(size==0)
		return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Queue<Integer> cq = new CQueue1<>();
		System.out.println("empty queue created");
		System.out.println("Queue is empty :"+cq.isEmpty());
		System.out.println("adding 1 to queue and saving its refernce");
		cq= cq.enQueue(1);
		System.out.println("Head value is : "+cq.head());
		System.out.println("adding 2 to queue but not saving its refernce");
		cq.enQueue(2);
		System.out.println("As queue is immutable , head value must remain 1 , Head value is : "+cq.head());
		System.out.println("adding 3 to queue and saving its refernce");
		cq = cq.enQueue(3);
		System.out.println("head value must be 3,  Head value is : "+cq.head());
		System.out.println("As 2 items are added, after 2 deque method , queue must be empty");
		System.out.println("calling deque");
		cq = cq.deQueue();
		System.out.println("Queue is emoty :"+cq.isEmpty());
		System.out.println("calling deque");
		cq = cq.deQueue();
		System.out.println("Queue is emoty :"+cq.isEmpty());
		
	}

}
