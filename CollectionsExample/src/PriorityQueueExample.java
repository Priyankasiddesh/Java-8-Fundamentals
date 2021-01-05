import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> que=new PriorityQueue<String>();
		que.add("abc");
		que.add("bcd");
		que.add("mango");
		que.add("apple");
		que.add("fruit");
		System.out.println("head"+que.element());
		System.out.println("head"+que.peek());
		Iterator<String> itr=que.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		que.remove();
		que.poll();
		System.out.println("after removing 2 elements");
		Iterator<String> itr1=que.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
