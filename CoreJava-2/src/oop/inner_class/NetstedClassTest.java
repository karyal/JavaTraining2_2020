package oop.inner_class;

//Default Access Specifier Class

public class NetstedClassTest {
	public static void main(String[] args) {
		OuterClass1 obj1 = new OuterClass1();
		obj1.f1();
		
		OuterClass1.InnerClass1 obj2 = obj1.new InnerClass1();
		obj2.f1();
	}
}