package collections.generics;

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
	}
}
