package oop.interfaces;

interface Inf1{
	//declare variables - Yes
	// by default this is static and final	
	int N1=10;	
	//public Inf1() { }//declare constructors - Yes
	/*
	public void f1() {
		System.out.println("Hello");
	}
	*/
	public void f1(); //abstract method can define in interface //by default abstract method
}

class C1{	
	static int N1=20; //declare variables - Yes
	public C1() {} //declare constructors - Yes
	
	public void f1() {
		System.out.println("Hello");
	}
}
public class InterfaceTest {	
	public static void main(String[] args) {
		//Inf1 inf1 = new Inf1(); //Cann't initialize object of interface.
		
		System.out.println(Inf1.N1);//Access
		//Inf1.N1=90;		
		System.out.println(C1.N1);
		
		C1 obj1 = new C1();
		obj1.N1=90;
		System.out.println(obj1.N1);
		
	}	
}