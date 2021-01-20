import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product1{
	int id;
	String productName;
	float price;
	
	public Product1(int id,String productName,float price) {
		this.id=id;
		this.productName=productName;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return productName;
	}
	public float getPrice() {
		return price;
	}
}


public class CollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product1> items=new ArrayList<Product1>();
		items.add(new Product1(1,"hp laptop",30000.0f));
		items.add(new Product1(2,"dell laptop",35000.0f));
		items.add(new Product1(3,"hp desktop",28000.0f));
		items.add(new Product1(4,"dell desktop",28000.0f));
		items.add(new Product1(5,"mac probook",90000.0f));
		List<Float> list=items.stream().map(x->x.price).collect(Collectors.toList());
		System.out.println("list of products"+list);
		System.out.println("converting to set");
		Set<Float>list1=items.stream().map(t->t.price).collect(Collectors.toSet());
		System.out.println(list1);
		Double sumprice=items.stream().collect(Collectors.summingDouble(y->y.price));
		System.out.println("sum of prices "+sumprice);
		Integer sumId=items.stream().collect(Collectors.summingInt(x1->x1.id));
		System.out.println("sum of the id "+ sumId);
		double avg=items.stream().collect(Collectors.averagingDouble(x->x.price));
		System.out.println(avg);
		
		Long count=items.stream().collect(Collectors.counting());
		System.out.println("total elements"+" "+count);

		

	}

}
