import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiExample2 {

	public static void main(String[] args) {
		Stream<Integer>stream=Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(p->System.out.println(p));
		//using array
		Stream<Integer> stream1=Stream.of(new Integer[] {1,2,3,4,5,6} );
		stream1.forEach(i->System.out.println(i));
		//list.stream()
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			li.add(i);
		}
		Stream<Integer> stream2=li.stream();
		stream2.forEach(i1->System.out.println(i1));
		//stream.generate or stream.iterate
		 Stream<Integer> randomNumbers = Stream
	             .generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);
		//stream of string chars or tokens
		IntStream stream4 = "12345_abcdefg".chars();
        stream4.forEach(p -> System.out.println(p));
		
		Stream<String> stream5=Stream.of("a$b$c".split("\\$"));
		stream5.forEach(st->System.out.println(st));
		
	}

}
