package concurrentlinkedqueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class concurrentlinkedqueue {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> clq=new ConcurrentLinkedQueue<Integer>();
		clq.add(10);
		clq.add(100);
		clq.add(5);
		clq.add(2);
		System.out.println(clq);
		System.out.println("Select 1st value"+clq.peek());
		System.out.println("Select 1st value"+clq.peek());
		System.out.println("Select  value"+clq.poll());
		System.out.println(clq);
		
		
	}
	
		
	

}
