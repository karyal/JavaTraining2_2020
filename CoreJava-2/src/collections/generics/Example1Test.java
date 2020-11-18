package collections.generics;

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

class Example1 {
	//Instance Variable
	private Object obj1;
	
	public Example1() {
		this.obj1= new Object();
	}
	public Example1(Object obj1) {
		this.obj1= obj1;
	}
	//Retrive value
	public Object get() {
		//Auth and Authr 
		return this.obj1;
	}
	//Set value
	public void set(Object obj1) {
		//validation and set
		this.obj1=obj1;
	}
}

class Example2 <T>{
	//Generic Type
	private T t;
	
	public Example2(T t) {
		this.t = t;
	}
	
	//Generic Method
	public T get() {
		return this.t;
	}

	//Generic Method
	public void set(T t) {
		this.t = t;
	}	
}

interface Inf1<T1, T2>{
	void print_info(T1 t1, T2 t2);
	void newLine();
}

class Example3 implements Inf1 {
	
	@Override
	public void print_info(Object t1, Object t2) {
		System.out.println(t1+" : "+t2);
	}
	
	@Override
	public void newLine() {
		System.out.println();
	}		
}

//Generic Array

class Example4{	
	private Object []myArray;
	private int count = 0;
	
	public Example4() {
		myArray = new Object[1000]; //Max Capacity to store values
	}
	
	public Example4(int MAX) {
		myArray = new Object[MAX]; //Max Capacity to store values
	}
	
	public Object get(int index) {
		return myArray[index];
	}
	
	public void set(Object value) {
		this.myArray[count++]=value;
	}
	
	public void print_values() {
		for(int i=0; i<count; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
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
		
		//T Type
		//Example2 obj2 = new Example2();
		//obj2.set('A');
		//System.out.println(obj2.get());
		
		//obj2 = new Example2();
		//obj2.set(12);
		//System.out.println(obj2.get());
		
		Example2 obj2 = new Example2("Kathmandu");
		System.out.println(obj2.get());
		
		//Person p2 = new Person(2, "Manish");
		//obj2 = new Example2(p2);
		obj2 = new Example2(new Person(2, "Manish"));
		System.out.println(obj2.get());	
		
		Example3 obj3 =  new Example3();
		obj3.print_info("Value1", 20);
		obj3.newLine();
		obj3.print_info("Value2", 30);
		obj3.newLine();
		obj3.print_info("Result", 20+30);
		obj3.newLine();
		
		//Generic Array
		Example4 collections= new Example4();
		collections.set(1);
		collections.set('A');
		collections.set("Kathmandu");
		
		System.out.println(collections.get(0));
		
		collections.print_values();
	}
}
