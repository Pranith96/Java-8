import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StreamsHashmapSortingUsingObjects {

	public static void main(String[] args) {

		// traditional way sorting based on keys and Values
		//ascending order
		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> o1.getId() - o2.getId());

		// descending order
		//Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> o2.getId() - o1.getId());

		employeeMap.put(new Employee(176, "Pranith", "IT", 600000), 60);
		employeeMap.put(new Employee(179, "Aranith", "IT", 800000), 80);
		employeeMap.put(new Employee(173, "Kranith", "IT", 300000), 30);
		employeeMap.put(new Employee(175, "Jranith", "IT", 700000), 50);
		
		System.out.println(employeeMap);

		System.out.println("-----------------------------------------------");

		// using streams api
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);

		System.out.println("-----------------------------------------------");
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("-----------------------------------------------");

		//normal order comparing by key
	    employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId))).forEach(System.out::println);
	 
	    System.out.println("-------------------------------------------------");
	    //normal order comparing by value
	    employeeMap.keySet().stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	    System.out.println("-------------------------------------------------");

	    employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}
