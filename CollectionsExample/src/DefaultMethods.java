interface SaySom{
	default void msg() {
		System.out.println("Deafult method body");
	}
	public void say(String msg);
	  static void sayLouder(String msg){    
	        System.out.println(msg);    
}
}
public class DefaultMethods implements SaySom {

	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethods dm=new DefaultMethods();
		dm.say("work is worship");;
		dm.msg();
SaySom.sayLouder("HELLO");
	}

}
