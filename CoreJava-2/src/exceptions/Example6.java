package exceptions;
import java.util.Scanner;
import javax.swing.JFrame;

public class Example6 {
	JFrame frame;

	public Example6() {
		try {
			frame.setTitle("Hello"); //NullPointerException
		}
		catch(NullPointerException ex) {
			System.out.println("Error1 : "+ex.getMessage()); //Error1 : null
		}
	}

	public static void main(String[] args) {
		new Example6();
		int n1, n2, n3;
		
		try {
			System.out.print("Enter first no : ");
			n1 = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.print("Enter second no : ");
			n2 = Integer.parseInt(new Scanner(System.in).nextLine());
			n3 = n1/n2;
			System.out.println("resutl : "+n3);
		}
		catch(NumberFormatException ex) {
			System.out.println("Error2 : "+ ex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println("Error3 : "+ ex.getMessage());
		}
	}
}