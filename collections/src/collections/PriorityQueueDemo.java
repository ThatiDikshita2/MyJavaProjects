
package collections;

//FOLI=First in last out
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue();
		System.out.println(q.isEmpty());
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		System.out.println(q);
		System.out.println(q.poll()); // Removes the first element
		System.out.println(q);
	}

}
