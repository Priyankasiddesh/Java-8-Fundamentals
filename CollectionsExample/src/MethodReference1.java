
public class MethodReference1 {
	public static void threadStatus() {
		System.out.println("Thread is running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thr=new Thread(MethodReference1::threadStatus);
		thr.start();

	}

}
