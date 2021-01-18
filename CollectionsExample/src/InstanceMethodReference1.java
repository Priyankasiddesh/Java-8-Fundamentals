
public class InstanceMethodReference1 {
	public void threadStatus() {
		System.out.println("Thread is running in insatnce method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thred=new Thread(new InstanceMethodReference1()::threadStatus);
		thred.start();

	}

}
