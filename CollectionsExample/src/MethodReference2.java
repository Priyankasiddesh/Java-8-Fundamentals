import java.util.function.BiFunction;

public class MethodReference2 {
public static int add(int a,int b) {
	return a+b;
}
public static float add(int a,float b) {
	return a+b;
}
public static float add(float a,float b) {
	return a+b;
}
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> adder=MethodReference2::add;
		BiFunction<Integer,Float,Float> adder1=MethodReference2::add;
		BiFunction<Float,Float,Float> adder2=MethodReference2::add;

		int result=adder.apply(10, 20);
		float result1=adder1.apply(10,20.0f);
		float result2=adder2.apply(10.0f, 20.0f);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);


	}

}
