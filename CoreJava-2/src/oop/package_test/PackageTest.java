package oop.package_test;

import oop.package_test.pkg1.C1;
import oop.package_test.pkg1.pkg2.C2;

public class PackageTest {
	
	public static void main(String[] args) {
		C1 obj1 = new C1();
		C2 obj2 = new C2();
		
		obj1.f1();
		obj2.f1();
	}
}
