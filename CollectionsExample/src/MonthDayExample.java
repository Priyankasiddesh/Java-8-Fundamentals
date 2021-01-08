import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthDay month=MonthDay.now();
		LocalDate d=month.atYear(2015);
		System.out.println(d);
		MonthDay m=MonthDay.parse("--02-29");
		boolean b=m.isValidYear(2019);
		System.out.println(b);
		long n= month.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("month of the year is:"+n);
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);
		System.out.println(r2);

	}

}
