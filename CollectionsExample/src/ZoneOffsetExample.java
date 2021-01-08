import java.text.*;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
public class ZoneOffsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneOffset z=ZoneOffset.UTC;
		Temporal temp=z.adjustInto(ZonedDateTime.now());
		System.out.println(temp);
		ZoneOffset zone=ZoneOffset.ofHours(5);
		System.out.println(zone);
		ZoneOffset zone1=ZoneOffset.ofHoursMinutes(5, 30);
		System.out.println(zone1);
		boolean b1=z.isSupported(ChronoField.OFFSET_SECONDS);
		System.out.println(b1);
		boolean b2=z.isSupported(ChronoField.SECOND_OF_MINUTE);
		System.out.println(b2);
	}

}
