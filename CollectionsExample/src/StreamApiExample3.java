import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample3 {

	public static void main(String[] args) {
		// collect stream elements to a list
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		Stream<Integer>stream=list.stream();
		List<Integer> listOfEvenNo=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(listOfEvenNo);
		
		Stream<Integer>stream1=list.parallelStream();
		Integer[] evenNumbersArr = stream1.filter(i1->i1%2==0).toArray(Integer[]::new);		
		System.out.println(Arrays.toString(evenNumbersArr));

		
		

	}

}
