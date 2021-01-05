import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		//Old style non generic
	Map map=new HashMap();
	map.put(10, "a");
	map.put(20, "b");
	map.put(30, "c");
	map.put(40, "d");
	
	Set set=map.entrySet();
	
	Iterator itr=set.iterator();
	while(itr.hasNext()) {
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	//current approach  generic
	Map<Integer,String> m1=new HashMap<Integer,String>();
	m1.put(1, "mango");
	m1.put(2, "apple");
	m1.put(3, "grapes");
	m1.putAll(map);
	for(Map.Entry m:m1.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}

	}

}
