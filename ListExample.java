import java.util.*;
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("car");
		list.add("motor cycle");
		list.add("ship");
		for(String s:list) {
			System.out.println(s);
		}
		String[] array= {"hai","hello","how"};
		System.out.println("printing array"+Arrays.toString(array));
		List<String> l1= new ArrayList<String>();
		for(String s1:array) {
			l1.add(s1);
		}
		System.out.println("printing list"+l1);
	}

}
