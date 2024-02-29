//only queue feature not list features.
import java.util.PriorityQueue;

public class M8
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[])
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(10);
		queue.add(9);
		queue.add(8);
		queue.add(7);
		queue.add(6);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		//PriorityQueue has default sorting that default sorting	
		  //that default sorting only applies to the head element.
		  //it guarantees to sort first element.
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}