import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>gamesList=new ArrayList<String>();
		gamesList.add("chess");
		gamesList.add("hokey");
		gamesList.add("carrom");
		gamesList.add("cricket");
		System.out.println("Iterating by passing lambda expression");
		gamesList.forEach(games->System.out.println(games));
		System.out.println("Iterating by passing method reference");
		gamesList.forEach(System.out::println);
		System.out.println("Using java stream");
		gamesList.stream().forEachOrdered(game->System.out.println(game));
		System.out.println("using java stream with method reference");
		gamesList.stream().forEachOrdered(System.out::println);


	}

}
