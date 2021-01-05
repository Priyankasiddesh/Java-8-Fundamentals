import java.util.*;
public class EnumMapExample {
public enum days{
	Monday,Tuesday,Wednesday
}
	public static void main(String[] args) {
		EnumMap<days,String> map=new EnumMap<days,String>(days.class);
		map.put(days.Monday,"1");
		map.put(days.Tuesday,"2");
		map.put(days.Wednesday,"3");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		

	}

}
