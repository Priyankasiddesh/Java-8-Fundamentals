import java.time.LocalTime;
public class LocalTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalTime time1=LocalTime.of(10, 25,30);
		System.out.println(time1);
		LocalTime time2=time1.minusHours(2);
		LocalTime time3=time2.minusMinutes(20);
		System.out.println(time3);
		

	}

}
