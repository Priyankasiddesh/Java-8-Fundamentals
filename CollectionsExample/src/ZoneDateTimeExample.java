import java.time.*;
public class ZoneDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zone=ZonedDateTime.now();
		System.out.println(zone.getZone());
		LocalDateTime ldt=LocalDateTime.of(2020, Month.JANUARY,9,5,56);
		ZoneId  india = ZoneId.of("Asia/Kolkata"); 
		ZonedDateTime zone1=ZonedDateTime.of(ldt,india);
		System.out.println("In India central time zone:"+zone1);
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone2=ZonedDateTime.of(ldt, tokyo);
		System.out.println("In tokyo central time Zone:"+zone2);
		ZonedDateTime m=zone.minus(Period.ofDays(35));
		System.out.println(m);
		ZonedDateTime p = zone.plus(Period.ofDays(126));  
		System.out.println(p);  
	
		

	}

}
