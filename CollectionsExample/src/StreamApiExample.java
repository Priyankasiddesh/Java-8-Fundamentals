import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Products{
	int id;
	String name;
	float price;
	public Products(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamApiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> li=new ArrayList<Products>();
		li.add(new Products(1,"laptop",30000f));
		li.add(new Products(2,"desktop",25000f));
		li.add(new Products(3,"mobile",35000f));
		li.add(new Products(2,"motherboard",15000f));
		li.stream().filter(product->product.price>25000f).forEach(product->System.out.println(product.name));
		List<Float> li1=li.stream()
				.filter(p->p.price>25000f)//filtering data
				.map(p->p.price)//fetching price
				.collect(Collectors.toList());//collecting as list
		System.out.println(li1);
		 Stream.iterate(1, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(5)  
	        .forEach(System.out::println);  


	}

}
