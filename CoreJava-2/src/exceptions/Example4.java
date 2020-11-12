package exceptions;

import javax.swing.JFrame;


public class Example4 {
	
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
	public Example4() {
		frame.setTitle("Hello");
	}
	
	public static void main(String[] args) {
		int n1, n2, n3;
		int ind = 2;
		int nums[] = new int[5];
		
		try {
			n1 = 20; //input from keyboard - 20 | 30 |
			n2 = 3; //input from keyboard - 3   | 0  |			
			n3 = n1/n2; //ArithmeticException - Move to 25
			System.out.println("Result : "+n3);
			System.out.println(nums[ind]); //ArrayIndexOutOfBoundsException - Move 28 | input from keyboard
			new Example4();
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("Error1 : "+ ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Error1 : "+ ex.getMessage());
		}
	}
}