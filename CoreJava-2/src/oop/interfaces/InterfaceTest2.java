package oop.interfaces;

interface Inf2{
	int MAX = 10;
	public void f1(); //must override by implemented class
}

interface Inf3{
	int MAX = 20;
	public void f2();
}
class C2 implements Inf2, Inf3{
	final int MAX = 60; 
	@Override
	public void f1() {
		System.out.println("MAX1 : "+Inf2.MAX);
	}
	
	@Override
	public void f2() {
		System.out.println("MAX2 : "+Inf3.MAX);
	}
	
	public void f3() {
		System.out.println("MAX3 : "+this.MAX);
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		C2 obj1 = new C2();
		obj1.f1();
		obj1.f2();
		obj1.f3();
		
		Inf2 obj2 = new C2();
		Inf3 obj3 = new C2();
		
		obj2.f1();
		//obj2.f2();
		
		//obj3.f1();
		obj3.f2();		
	}
}