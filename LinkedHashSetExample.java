import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> li=new LinkedHashSet<String>();
		//maintains insertion order and does not allow duplicates
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("two");
		for(String s:li) {
			System.out.println(s);
		}
		

	}

}
