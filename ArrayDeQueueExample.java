import java.util.*;
public class ArrayDeQueueExample {

	public static void main(String[] args) {
		Deque<String> q=new ArrayDeque<String>();
		q.add("car");
		q.offer("bus");
		q.offer("train");
		q.offer("flight");
		q.offerFirst("ship");
		System.out.println("after offerfirst traversal");
		for(String s:q) {
			System.out.println(s);
		}
		q.pollLast();
		System.out.println("after poll last traversal");
		for(String s1:q) {
			System.out.println(s1);
		}
		

	}

}
