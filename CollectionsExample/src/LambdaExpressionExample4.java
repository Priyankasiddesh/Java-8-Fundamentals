import java.util.*;
interface Addition{
	public int add(int a,int b);
}
public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad=(a,b)->a+b;
		System.out.println(ad.add(3, 4));
		Addition ad1=(int a,int b)->{return (a+b);};
		System.out.println(ad1.add(30, 40));
		//for each loop lambda expression
		List <String>li=new ArrayList<String>();
		li.add("hai");
		li.add("how");
		li.add("are");
		li.add("you");
		li.forEach(n->System.out.println(n));
		

	}

}
