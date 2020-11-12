package exceptions;

import javax.swing.JFrame;

class Person2{		
	public void f1() {
		System.out.println("Hello from f1() of Person Class");
	}		
}

public class Example2 {
	
	/*
	public static void main(String[] args) {
		int n1, n2, n3;
		n1=20;
		n2=0; // / by zero
		n3=n1/n2;
		System.out.println("Result : "+n3);
	}
	*/
	
	JFrame frame;	
	public Example2() {
		frame.setTitle("Hello");
	}
	
	public static void main(String[] args) {
		int n1, n2, n3;
		int nums[] = new int[5];
		Person2 obj1;
		
		try {
			n1 = 20; //input from keyboard - 20 | 30 |
			n2 = 3; //input from keyboard - 3   | 0  |			
			n3 = n1/n2; //ArithmeticException - Move to 25
			System.out.println("Result : "+n3);
			//System.out.println(nums[-1]); //ArrayIndexOutOfBoundsException - Move 28 | input from keyboard
			new Example2();
		}
		catch(ArithmeticException ex) {
			System.out.println("Error1 : "+ ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error2 : "+ ex.getMessage());
		}
		catch(NullPointerException ex) {
			System.out.println("Error3 : "+ ex.getMessage());
		}
	}
}