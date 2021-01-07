import java.util.*;
import java.util.stream.Stream;
class Product{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class LambdaExpressionExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>li=new ArrayList<Product>();
		li.add(new Product(1,"computer",25000));
		li.add(new Product(5,"mouse",500));
		li.add(new Product(3,"apple product",12000));
		li.add(new Product(4,"keyboard",5000));
		li.add(new Product(2,"motherboard",8000));
		Collections.sort(li,(p1,p2)->{return p1.name.compareTo(p2.name);});
		for(Product p:li) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		Stream<Product> filter_data=li.stream().filter(p->p.price>5000);
		filter_data.forEach(product->System.out.println(product.id+" "+product.name+" "+product.price));

	}

}
