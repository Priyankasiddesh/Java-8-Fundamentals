import java.time.LocalDate;
import java.time.LocalDateTime;
public class LocalDateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		System.out.println("Tody's date"+" "+date);
		System.out.println("yesterday's date"+" "+yesterday);
		System.out.println("tomorrow's date"+" "+tomorrow);
		
		//is leap year or not
		LocalDate d1=LocalDate.of(2015, 02, 25);
		System.out.println(d1.isLeapYear());
		LocalDate d2=LocalDate.of(2016,5,6);
		LocalDateTime datetime=d2.atTime(1,50,00);
		System.out.println(d2.isLeapYear()+""+datetime);

	}

}
