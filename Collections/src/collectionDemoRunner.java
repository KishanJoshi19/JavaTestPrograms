import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionDemoRunner {

	public static void main(String[] args) {

		List<collectionDemo> collectiondemo = List.of(new collectionDemo(1, "ram"), new collectionDemo(5, "jay"),
				new collectionDemo(4, "dev"));

		ArrayList<collectionDemo> collectionArray = new ArrayList<>(collectiondemo);

		System.out.println(collectionArray);

		Collections.sort(collectionArray);
		System.out.println(collectionArray);
	}
}
