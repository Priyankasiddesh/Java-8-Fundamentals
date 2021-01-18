interface Sayable21{
	public void say();
}
public class InstanceMethodReference {
	public void saySomething1() {
		System.out.println("Instance method reference");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodReference im=new InstanceMethodReference();
		Sayable21 sayable=im::saySomething1;
		sayable.say();
		Sayable21 say1=new InstanceMethodReference()::saySomething1;
		say1.say();

	}

}
