package collections.collections;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, String> person = new HashMap<String, String>();
		
		person.put("pid", "1");
		person.put("full_name", "Raj Rai");
		person.put("contact_address", "Kathmandu, Nepal");
		
		System.out.println(person); //{full_name=Raj Rai, pid=1, contact_address=Kathmandu, Nepal}
		
		System.out.println(person.get("pid"));		
	
		System.out.println(person.size());
			
		for(String str : person.keySet()) {
			System.out.println(str);
		}
		
		for(String str : person.values()) {
			System.out.println(str);
		}
		
		person.remove("pid");
		System.out.println(person);
	}
}