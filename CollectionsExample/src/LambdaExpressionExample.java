interface Drawable{
	public void draw();
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		// without using lambda expression
		int width=10;
		Drawable d=new Drawable() {
			public void draw() {
			System.out.println("drawing"+width);
		}

		};
		d.draw();
		//with lambda expression
		Drawable d2=()->{
			System.out.println("drawing"+width);
		};
		d2.draw();

	}

}
