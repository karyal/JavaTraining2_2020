package lib_test;

import my_lib.Maths;

public class Main {

	public static void main(String[] args) {
		int num1 = 58;
		int num2 = 9;
		int num3 = 0;
		Maths m = new Maths();
		num3 = m.calc_sum(num1, num2);
		System.out.println("Result : "+num3);		
	}
}