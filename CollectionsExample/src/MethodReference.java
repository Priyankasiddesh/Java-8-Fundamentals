interface Sayableee{
	public void say();
}
public class MethodReference {
	public static void saySomething() {
		System.out.println("hello this is static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayableee sayable=MethodReference::saySomething;
		sayable.say();

	}

}
