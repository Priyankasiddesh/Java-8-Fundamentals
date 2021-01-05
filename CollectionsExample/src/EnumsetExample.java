import java.util.*;

public class EnumsetExample {
enum days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	
}
	public static void main(String[] args) {
		Set<days> set=EnumSet.of(days.TUESDAY,days.WEDNESDAY);
		Iterator<days> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set<days> set1=EnumSet.allOf(days.class);
		System.out.println(set1);
		Set<days> set2=EnumSet.noneOf(days.class);
		System.out.println(set2);


	}

}
