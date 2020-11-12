package collections.generics;

class Person{
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

class Example1{
	private Object obj1;
	
	public Example1() {
		this.obj1= new Object();
	}
	public Example1( Object obj1) {
		this.obj1= obj1;
	}
	
	public Object get() {
		return this.obj1;
	}
	
	public void set(Object obj1) {
		this.obj1=obj1;
	}
}

public class Example1Test {
	public static void main(String[] args) {
		//Byte
		Example1 obj1 = new Example1();
		obj1.set(21);
		System.out.println(obj1.get());
		
		//char
		obj1 = new Example1();
		obj1.set('C');
		System.out.println(obj1.get());
		
		//double
		obj1 = new Example1();
		obj1.set(123456789123.456789);
		System.out.println(obj1.get());
		
		//String
		obj1 = new Example1();
		obj1.set("Manish Rai");
		System.out.println(obj1.get());
		
		Person p1 = new Person(1, "Krishna");
		obj1 = new Example1();
		obj1.set(p1);
		System.out.println(obj1.get());
	}
}
