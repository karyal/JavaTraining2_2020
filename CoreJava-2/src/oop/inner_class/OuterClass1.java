package oop.inner_class;

class OuterClass1{	
	void f1() {
		System.out.println("Hi from f1() of OuterClass1");
	}
	class InnerClass1 {
		void f1() {
			System.out.println("Hi from f1() of InnerClass1");
		}
	}
}