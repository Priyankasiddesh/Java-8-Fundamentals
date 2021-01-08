import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDateTime time1=LocalDateTime.now();
		LocalDateTime time1=LocalDateTime.of(2021,1,8,13,45);
		LocalDateTime time2=time1.minusDays(25);
		System.out.println("befor formatting the date:"+time2);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime=time2.format(format);
		System.out.println("after formatting the date :"+formatDateTime);
		
		
		//	LocalDateTime a=LocalDateTime.now(); current system date time details
		LocalDateTime a=LocalDateTime.of(2021,1,8,15,56);
		System.out.println(a.get(ChronoField.DAY_OF_WEEK));
		System.out.println(a.get(ChronoField.DAY_OF_YEAR));
		System.out.println(a.get(ChronoField.DAY_OF_MONTH));
		System.out.println(a.get(ChronoField.HOUR_OF_DAY));
		System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
		
		

	}

}
