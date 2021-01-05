import java.util.*;
public class CollectionClassExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("j2ee");
		list.add("cobol");
		list.add("c");
		System.out.println("list of elements before collection"+list);
		Collections.addAll(list, "c#","react");
		System.out.println("list of elements after collection"+list);
		String[] arr= {"c++","mysql"};
		Collections.addAll(list,arr);
		System.out.println("list of elements after adding arr to collection"+list);
List<Integer> li=new ArrayList<Integer>();
li.add(25);
li.add(45);
li.add(26);
li.add(12);
li.add(99);
li.add(05);
System.out.println("max num from list"+Collections.max(li));
System.out.println("min num from list"+Collections.min(li));


		

		

	}

}
