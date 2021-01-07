
public class LambdaExpressionExample6 {

	public static void main(String[] args) {
		// without using lambda expression
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("thread t1 is running");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=()->System.out.println("thread t2 is running");
		Thread t2=new Thread(r2);
		t2.start();
		

	}

}
