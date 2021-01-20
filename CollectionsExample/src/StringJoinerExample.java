import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner join=new StringJoiner(",");
		System.out.println(join);
		join.setEmptyValue("its empty");
		System.out.println(join);
			join.add("abhay");
			join.add("bharath");
			join.add("divya");
			join.add("lasya");
		System.out.println(join);
		int length=join.length();
		System.out.println("length is:"+length);
		String str1=join.toString();
		System.out.println(str1);
		
		char ch=str1.charAt(3);
		System.out.println(ch);
		
		//using prefix and suffix
		StringJoiner str=new StringJoiner(",","[","]");
		str.add("abc");
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
		System.out.println(str);
		//merging two string joiners
		StringJoiner merge=join.merge(str);
		System.out.println(merge);
		int newLength=merge.length();
		System.out.println(newLength);
		
	}

}
