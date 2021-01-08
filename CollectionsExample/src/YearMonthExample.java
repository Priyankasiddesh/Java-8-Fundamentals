import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
public class YearMonthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YearMonth y=YearMonth.now();
		System.out.println(y);
		String s=y.format(DateTimeFormatter.ofPattern("MM-yyyy"));
		System.out.println(s);
		long l1=y.get(ChronoField.YEAR);
		System.out.println(l1);
		long l=y.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(l);
		YearMonth ym2 = y.plus(Period.ofYears(2));  
	    System.out.println(ym2);  
	    YearMonth ym3 = y.minus(Period.ofYears(2));  
	    System.out.println(ym3); 

	}

}
