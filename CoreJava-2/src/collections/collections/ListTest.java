package collections.collections;

import java.util.ArrayList;
import java.util.List;

class Person {
	private int id;
	private String name;	
	
	public Person() {
		this.id=0;
		this.name="";
	}
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.id+", "+this.name;
	}
}

public class ListTest {

	public static void main(String[] args) {
		List list1; //list1 is an object of List Interface
		list1 = new ArrayList(); //Collections
		
		//add item
		list1.add('A');
		list1.add(true);
		list1.add(1);//byte
		list1.add(150); //short
		list1.add(35897); //int
		list1.add(8585854);//long
		list1.add(123.456); //float
		list1.add(123456789.123456789); //double
		list1.add("Kathmandu");		
		list1.add(new Person(1, "Krishna"));
		
		//get size
		System.out.println(list1.size());
		
		//get value
		System.out.println(list1.get(0));
		System.out.println(list1.get(3));
		
		//Looping through list
		for(Object item : list1) {
			System.out.print(item+" ");
		}
		System.out.println();
	}

}
