interface Sayable1{
	public String say(String name);
}
public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		// with parameter
		Sayable1 s=(name)->{
			return "Hello"+" "+name;
		};
		System.out.println(s.say("aman"));
		Sayable1 s2=(name)->{
			return "hai"+" "+name;
		};
		System.out.println(s2.say("abc"));


	}

}
