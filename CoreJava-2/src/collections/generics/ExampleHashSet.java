package collections.generics;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
	public static void main(String[] args) {
		Set set1 = new HashSet();
		set1.add("SUN");
		set1.add("MON");
		set1.add("TUE");
		set1.add("SUN");
		set1.add("WED");
		set1.add("THU");
		set1.add("FRI");
		set1.add("SUN");
		set1.add("SAT");
		set1.add("FRI");
		set1.add("WED");
		System.out.println(set1.size());
	}
}
