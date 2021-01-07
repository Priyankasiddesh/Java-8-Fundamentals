import java.util.*;
import java.util.stream.Collectors;

class Items{
	int id;
	String name;
	float price;
	public Items(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
}
public class streamApiExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Items> li=new ArrayList<Items>();
		li.add(new Items(1,"dell Laptop",35000f));
		li.add(new Items(2,"sony tv",50000f));
		li.add(new Items(3,"i phone",60000f));
		li.add(new Items(4,"apple laptop",80000f));
		li.add(new Items(5,"samsung mobile",25000f));
		Float totalPrice=li.stream().map(items->items.price).reduce(0.0f,(sum,price)->sum+price);
		System.out.println(totalPrice);
		//using Float class
		float totalprice2=li.stream().map(items->items.price).reduce(0.0f,(Float::sum));
		System.out.println(totalprice2);
        //using Collectors method
		double totalPrice3=li.stream().collect(Collectors.summingDouble(items->items.price));
		System.out.println(totalPrice3);
		//max and minimum price
		Items p=li.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
		System.out.println(p.price);
		Items i=li.stream().max((i1,i2)->i1.price<i2.price?1:-1).get();
		System.out.println(i.price);
		// count the items based on price
		long count=li.stream().filter(items->items.price>30000).count();
		System.out.println(count);
		//converting into set
		Set<Float> li2=li.stream().filter(items->items.price<30000f).map(items->items.price)
				.collect(Collectors.toSet());
		System.out.println(li2);
		//to map
		Map<Integer,String> m1=li.stream()
				.collect(Collectors.toMap(items->items.id,items->items.name));
		System.out.println(m1);
		//using method reference in stream
		List<Float> list=li.stream().filter(items->items.price>50000f)
				.map(Items::getPrice).collect(Collectors.toList());
		System.out.println(list);
	}
	

}
