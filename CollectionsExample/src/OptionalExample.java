import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[10];
		//if value Present
		str[5]="JAVA OPTIONAL CLASS EXAMPLE";
		Optional<String> empty = Optional.empty();  
        System.out.println(empty);  
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String lowerCaseStr=str[5].toLowerCase();
			System.out.println(lowerCaseStr);
		}
		//executes when value is not present
		else {
			System.out.println("String is not present");

		}
		//other method in optional class
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
		System.out.println("filtered;"+checkNull.filter((s)->s.equals("abc")));
		System.out.println("filtered;"+checkNull.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		System.out.println("getting value:"+checkNull.get());
		System.out.println("getting hash code:"+checkNull.hashCode());
		System.out.println("if present:"+checkNull.isPresent());
		System.out.println("ORELSE:"+checkNull.orElse("value not present"));
		System.out.println("ORELSE:"+empty.orElse("value not present"));
		checkNull.ifPresent(System.out::println);



	}

}
