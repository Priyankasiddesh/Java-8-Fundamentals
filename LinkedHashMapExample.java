import java.util.*;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>();
		lh.put(1, "mango");
		lh.put(2, "grapes");
		lh.put(3, "banana");
		
		System.out.println("keys:"+lh.keySet());
		System.out.println("vlues:"+lh.values());
		lh.remove(2);
		System.out.println(lh.entrySet());

	}

}
