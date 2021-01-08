import java.time.LocalDate;
import java.time.Year;

public class YearExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year y=Year.now();
		System.out.println(y);
		System.out.println(y.length());

		Year y1=Year.of(2012);
		System.out.println(y1.isLeap());

		LocalDate d=y1.atDay(124);
		System.out.println(d);
		

	}

}
