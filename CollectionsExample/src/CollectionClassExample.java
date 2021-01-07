import java.util.*;
 class Student implements Comparable<Student>{
	public String name;
	public Student(String name) {
		this.name=name;
	}
	public int compareTo(Student person) {
		return name.compareTo(person.name);
	}
}
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
ArrayList<String> al=new ArrayList<String>();
al.add("amit");
al.add("gourav");
al.add("mahi");
al.add("coul");
Collections.sort(al);
Iterator<String> it=al.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
Collections.sort(al,Collections.reverseOrder());
Iterator<String> it1=al.iterator();
while(it1.hasNext()) {
	System.out.println(it1.next());
}
ArrayList al1=new ArrayList();
al1.add(Integer.valueOf(101));
al1.add(Integer.valueOf(204));
al1.add(125);
Collections.sort(al1);
Iterator i=al1.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
ArrayList<Student> al2=new ArrayList<Student>();
al2.add(new Student("aman"));
al2.add(new Student("sourav"));
al2.add(new Student("gourav"));
Collections.sort(al2);
for(Student s:al2) {
	System.out.println(s.name);
}

		

	}

}
