interface Saying{
	public String say(String message);
}
public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saying s=(message)->{
			String s1="there is a saying that ";
			String s2=s1+message;
			return s2;
		};
		System.out.println(s.say("time is precious"));

	}

}
