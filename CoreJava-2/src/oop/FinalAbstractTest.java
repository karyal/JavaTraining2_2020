package oop;

/*

final
class - cann't extends
method - cann't override
variable - cann't change

final class C1{
	
}

class C2 extends C1{
	
}
//final class -> blocks to extends the class /block inheritance    


class C1{
	final int N1=10; //Can Access
}

C1 obj1=new C1();
System.out.println(obj1.N1);
//obj1.N1=20; //N1 is read-only; we can only access the value of N1.

class C1{
	String message="Hi";
	final public void print_message() {
		System.out.println("Message: "+this.message);
	}
}

class C2 extends C1{
	String new_message="How are you?";
	
	@Override //Cannt override final method of C1
	public void print_message() {
		System.out.println("Message: "+this.new_message);
	}
}

//abstract - Must Extends, Must Override
abstract
class - must extends
method - must override
non abstract method - must be static

abstract class C1{
	
}

class C2 extends C1{
	
}

//C1 obj1 = new C1(); //Cannt initantiate type C1

abstract class C1{
	abstract public void print_message();//Must Override in Sub Class
}

class C2 extends C1{
	public void print_message() {
		System.out.println("Hi from print_message");
	}
}

C2 obj1= new C2();
obj1.print_message();


//Abstract class can have non abstract method which must be static.
abstract class C1{
	abstract public void print_message();
	static public void print_message(String message) {
		System.out.println(message);
	}
}

C1.print_message("Hi from here");
*/

public class FinalAbstractTest {
	
	public static void main(String[] args) {
		
		
	}
}