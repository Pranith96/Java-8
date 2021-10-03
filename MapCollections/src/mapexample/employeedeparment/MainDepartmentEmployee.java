package mapexample.employeedeparment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainDepartmentEmployee {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(1, "Pranith", "HCL", new Department("1", "Software")),
				new Employee(2, "Shiva", "Google", new Department("2", "Software")),
				new Employee(3, "Jayanth", "MS", new Department("3", "Manager")),
				new Employee(4, "Shiva", "Google", new Department("4", "Manager")));

		Map<Department, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(map);
	}
}
