import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
public class StreamApiExample4 {

	public static void main(String[] args) {
		List<Person> p=Arrays.asList(new Person("max",18),
				new Person("min",20),
				new Person("nil",21),
				new Person("moh",21));
		List<Person> filterd=p.stream().filter(p1->p1.name.startsWith("m"))
				.collect(Collectors.toList());
		System.out.println(filterd);
		Map<Integer,List<Person>> personByAge=p.stream()
				.collect(Collectors.groupingBy(p2->p2.age));
		personByAge
	    .forEach((age, p3) -> System.out.format("age %s: %s\n", age, p3));
		Double averageage=p.stream().collect(Collectors.averagingInt(p4->p4.age));
		System.out.println(averageage);
		IntSummaryStatistics ageSummary=p.stream().collect(Collectors.summarizingInt(p5->p5.age));
		System.out.println(ageSummary);
		String phrase=p.stream()
				.filter(p6->p6.age>=18).map(p6->p6.name)
				.collect(Collectors.joining(" and ","in germany "," are of legal age."));
		System.out.println(phrase);
		Map<Integer,String> map=p.stream()
				.collect(Collectors.toMap(
						p7->p7.age, 
						p7->p7.name,
						(name1,name2)->name1+";"+name2));
		System.out.println(map);
		//creating own special collector
		Collector<Person,StringJoiner,String> personNameCollector=Collector.of(
				()->new StringJoiner("|"),//supplier
				(j,p8)->j.add(p8.name.toUpperCase()),//accumulator
				(j1,j2)->j1.merge(j2),//combiner
				StringJoiner::toString//finisher
				);
		String name=p.stream().collect(personNameCollector);
		System.out.println(name);
				
		

	}

}
