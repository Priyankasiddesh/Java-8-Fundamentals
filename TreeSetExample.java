import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> itr=new TreeSet<Integer>();
		itr.add(23);
		itr.add(45);
		itr.add(05);
		itr.add(12);
		itr.add(45);
		itr.add(66);
		System.out.println(itr);
		System.out.println("highest value"+" "+ itr.pollFirst());
		System.out.println("lowest value"+ " "+itr.pollLast());
		Iterator<Integer> i=itr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		TreeSet<String> set=new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		System.out.println("the set conatins"+" "+set);
		System.out.println("the reverse set"+set.descendingSet());
		System.out.println("Head set"+set.headSet("c", true));
		System.out.println("tail set"+set.tailSet("c",false));
		System.out.println("sub set"+set.subSet("a",false,"e",true));
		
		
	}

}
