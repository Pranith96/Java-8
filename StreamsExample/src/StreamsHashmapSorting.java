import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamsHashmapSorting {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("ten", 10);
		map.put("two", 2);
		map.put("five", 5);
		map.put("four", 4);

		//using streams api
		System.out.println("-----------------------------------------------");
		
		map.entrySet().stream().sorted((i,j)->i.getKey().compareTo(j.getKey())).forEach(System.out::println);
		
		System.out.println("-----------------------------------------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("-----------------------------------------------");

		List<Entry<String,Integer>> map1 = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());

		System.out.println(map1 +"-----------------------------------------------");
	}
}
