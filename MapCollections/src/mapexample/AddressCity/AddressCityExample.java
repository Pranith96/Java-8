package mapexample.AddressCity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressCityExample {

	public static void main(String[] args) {

		List<Address> list = new ArrayList<>();
		list.add(new Address(1, "hyd", "India"));
		list.add(new Address(2, "bang", "India"));
		list.add(new Address(3, "vzg", "India"));
		list.add(new Address(4, "hyd", "USA"));
		list.add(new Address(5, "vzg", "India"));
		list.add(new Address(6, "chennai", "India"));
		list.add(new Address(7, "hyd", "Rusia"));
		list.add(new Address(8, "vzg", "UK"));

		Map<String, List<Address>> address = list.stream().collect(Collectors.groupingBy(Address::getCity));
		System.out.println(address.get("hyd"));

	}

}
