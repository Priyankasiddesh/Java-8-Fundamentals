import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
	HashSet<String> set=new HashSet<String>();
	set.add("one");
	set.add("two");
	set.add("three");
	set.add("four");
	Iterator<String> i=set.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
//ignoring duplicate elements example
	HashSet<String> h1=new HashSet<String>();
	h1.add("ravi");
	h1.add("suma");
	h1.add("prashu");
	h1.add("suma");
	h1.add("dushi");
	h1.add("abc");
	System.out.println("the set conatins"+h1);
	h1.remove("abc");
	System.out.println("after removing abc the set conatins"+h1);
	set.addAll(h1);
	System.out.println("adding h1 to set"+set);
	set.removeAll(h1);
	System.out.println("after removing all h1 elements from set"+set);
	Iterator<String> itr=h1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//using lambda expression
	set.removeIf(str->str.contains("one"));
	System.out.println("after removing one from set"+set);
	set.clear();
	System.out.println("after removing all elements from set"+set);
	}

}
