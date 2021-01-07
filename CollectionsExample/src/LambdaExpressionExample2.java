interface Sayable{
	public String say();
}
public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		//without parameter or no parameter
		Sayable s=()->{return "don't say anything";	
		};
		System.out.println(s.say());
	}

}
