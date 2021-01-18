interface Messagable{
	Message getMessage(String msg);
	
}
class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messagable message=Message::new;
		message.getMessage("Hello");

	}

}
