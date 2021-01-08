import java.time.*;
public class OffsetDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffsetDateTime offsetDt=OffsetDateTime.now();
		System.out.println(offsetDt.getDayOfMonth());
		System.out.println(offsetDt.getDayOfYear());
		System.out.println(offsetDt.getDayOfWeek());
		System.out.println(offsetDt.toLocalDate());
		OffsetDateTime value=offsetDt.minusDays(25);
		System.out.println(value);
		OffsetDateTime value1=value.plusDays(25);
		System.out.println(value1);
		

	}

}
