import java.time.*;
public class ClockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c=Clock.systemDefaultZone();
		System.out.println(c.getZone());
		Clock c1=Clock.systemUTC();
		System.out.println(c1.instant());
		Duration d=Duration.ofHours(5);
		Clock clock=Clock.offset(c1, d);
		System.out.println(clock.instant());
	}

}
