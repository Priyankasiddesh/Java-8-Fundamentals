import java.util.*;
public class HashTableExample {

	public static void main(String[] args) {
		 Hashtable<Integer,String> map=new Hashtable<Integer,String>(); 
		 map.put(100, "manu");
		 map.put(102, "madhu");
		 map.put(101, "aman");
		 map.put(104, "amit");
		 System.out.println("before removing from map"+map);
		 map.remove(104);
		 System.out.println("after removing from map"+map);
		 System.out.println(map.getOrDefault(101,"not found"));
		 System.out.println(map.getOrDefault(104,"not found"));
map.putIfAbsent(103, "gourav");
System.out.println("updated map"+map);

		 
		 
		 }

}
