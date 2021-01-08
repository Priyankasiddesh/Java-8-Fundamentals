import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Period period=Period.ofDays(25);
		Temporal temp=period.addTo(LocalDate.now());
		System.out.println(temp);
		Period p=Period.of(2021, 05, 23);
		System.out.println(p.toString());
		 Period period1 = Period.ofMonths(4);   
		 Period period2 = period1.minus(Period.ofMonths(2));  
		 Period period3 = period1.plus(Period.ofMonths(2));  
		 System.out.println(period2);  

		 System.out.println(period3);  

	}

}
