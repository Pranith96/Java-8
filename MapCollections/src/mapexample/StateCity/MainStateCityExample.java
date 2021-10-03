package mapexample.StateCity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStateCityExample {

	public static void main(String[] args) {

		List<Address> list = Arrays.asList(new Address(1, "hyd", "TS", "India"), new Address(2, "VZG", "AP", "India"),
				new Address(3, "hyd", "TS", "India"), new Address(4, "VZG", "AP", "India"),
				new Address(5, "hyd", "TS", "India"));

		Map<String, Map<String, List<Address>>> map = list.stream()
				.collect(Collectors.groupingBy(Address::getState, Collectors.groupingBy(Address::getCity)));

		System.out.println(map.get("AP"));
	}

}
