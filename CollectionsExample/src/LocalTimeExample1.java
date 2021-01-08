import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
public class LocalTimeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("Indian time zone:"+time1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("japan time zone:"+time2);
		long hours=ChronoUnit.HOURS.between(time1,time2);
		System.out.println("hours between two time zone:"+hours);
		long minutes=ChronoUnit.MINUTES.between(time1, time2);
		System.out.println("minutes between two time zone:"+minutes);
		
		

	}

}
