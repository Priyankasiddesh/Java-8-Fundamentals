interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  

@FunctionalInterface
interface SaySomething extends Doable{
	public void say(String msg);
	boolean equals(Object obj);
	String toString();
}
public class FunctionalInterfaceExample implements SaySomething{
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceExample fie=new FunctionalInterfaceExample();
		fie.say("HELLO");
		fie.doIt();

	}

}
