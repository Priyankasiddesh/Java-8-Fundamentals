import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
	NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
	map.put(1,"a");
	map.put(2, "b");
	map.put(5, "e");
	map.put(3, "c");
	map.put(4,"d");
	System.out.println("descending map"+map.descendingMap());
	System.out.println("headmap"+map.headMap(3,true));
	System.out.println("tailmap"+map.tailMap(4, true));
	System.out.println("submap"+map.subMap(2, true,5,false));
	
	

	}

}
