package collections.collections;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, String> persons = new HashMap<String, String>();
		persons.put("pid", "1");
		persons.put("full_name", "Raj Rai");
		persons.put("contact_address", "Kathmandu, Nepal");
		
		System.out.println(persons);
		
		System.out.println(persons.get("pid"));		
	
		System.out.println(persons.size());
		
		System.out.println(persons.get("pid"));
		
		for(String str : persons.keySet()) {
			System.out.println(str);
		}
		
		for(String str : persons.values()) {
			System.out.println(str);
		}
		
		System.out.println(persons.remove("pid"));
	}
}