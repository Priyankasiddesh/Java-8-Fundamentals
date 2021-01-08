import java.time.*;
import java.time.temporal.ChronoField;
public class OffsetTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffsetTime offset=OffsetTime.now();
		System.out.println(offset);
		int h=offset.get(ChronoField.HOUR_OF_DAY);
		System.out.println("hour of day is:"+h);
		int m=offset.get(ChronoField.MINUTE_OF_DAY);
		System.out.println("minute of the day:"+m);
		int s=offset.get(ChronoField.SECOND_OF_DAY);
		System.out.println("seconds of the day:"+s);
		int h1=offset.getHour();
		System.out.println("hour of day is:"+h1+" hour");
		int m1=offset.getMinute();
		System.out.println("minute of day is:"+m1+" minute");
		int s1=offset.getSecond();
		System.out.println("Second of day is:"+s1+" Seconds");


		
		
		

	}

}
