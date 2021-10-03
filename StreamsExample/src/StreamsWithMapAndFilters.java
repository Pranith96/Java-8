import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamsWithMapAndFilters {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		list.forEach(System.out::println);
		System.out.println("-----------------maps--------------------------------------");
		list.stream().map(i -> i * i).forEach(System.out::println);
		System.out.println("-------------------filetr------------------------------------");
		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println("-----------------map and filter--------------------------------------");
		// when we use map operation and next filter then filter operation wont work
		list.stream().map(i -> i * 2).filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println("-----------------filter and map--------------------------------------");
		list.stream().filter(i -> i % 2 == 0).map(i -> i * 2).forEach(System.out::println);

		Set<Integer> set = new HashSet<>(list);
		set.forEach(data -> System.out.println(data));
	}

}
