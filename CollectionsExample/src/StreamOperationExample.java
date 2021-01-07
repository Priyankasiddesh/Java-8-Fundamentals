import java.util.*;
import java.util.stream.Collectors;
public class StreamOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();
		names.add("Amith");
		names.add("Gourav");
		names.add("Sourav");
		names.add("Amar");
		names.add("Bharath");
		names.add("Divya");
		names.add("Priya");
		
		names.stream().filter(s->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		List <String> li=names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(li);
		boolean matchedResult=names.stream().anyMatch(s->s.startsWith("A"));
		System.out.println(matchedResult);
		matchedResult=names.stream().allMatch(s->s.startsWith("A"));
		System.out.println(matchedResult);
		matchedResult=names.stream().noneMatch(s->s.startsWith("A"));
		System.out.println(matchedResult);
		long i=names.stream().filter(f->f.startsWith("A")).count();
		System.out.println(i);
		String firstMatchedName = names.stream()
	            .filter((s) -> s.startsWith("P"))
	            .findFirst()
	            .get();
	System.out.println(firstMatchedName);




	}

}
