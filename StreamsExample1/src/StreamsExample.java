import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		list.forEach(data -> System.out.println(data));
		list.forEach(System.out::println);

		System.out.println("------------------------------------");
		Stream<Integer> stream = list.stream().filter(data -> data % 2 == 0);
		stream.forEach(System.out::println);

		System.out.println("------------------------------------");

		List<Integer> set = list.stream().filter(data -> data % 2 == 0).collect(Collectors.toList());

		System.out.println("------------------------------------");

		list.stream().filter(data -> data % 2 == 0).forEach(System.out::println);

		System.out.println("------------------------------------");

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		List<Integer> ll = list1.stream().map(data -> data * 5).collect(Collectors.toList());
		System.out.println(ll);
	}

}
