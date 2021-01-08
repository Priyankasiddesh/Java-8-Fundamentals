import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
public class ZoneIdExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime id1=LocalTime.now(zone1);
		LocalTime id2=LocalTime.now(zone2);
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id1.isBefore(id2));
		ZoneId zone3=ZoneId.systemDefault();
		System.out.println(zone3);
		String s=zone3.getId();
		System.out.println(s);
		System.out.println(zone3.getDisplayName(TextStyle.FULL,Locale.ROOT));	

	}

}
