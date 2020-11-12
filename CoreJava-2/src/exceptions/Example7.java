package exceptions;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		int n1;
		try {
			System.out.print("Enter any number (1-10) : ");
			n1 = Integer.parseInt(new Scanner(System.in).nextLine());
			if (n1<1) {
				throw new MyException("Number range too low. Please enter number between 1-10 only.");
			}
			else if(n1>10) {
				throw new MyException("Number range too hight. Please enter number between 1-10 only.");
			}
			else {
				System.out.println("Number is : "+n1);
			}
		}
		catch(NumberFormatException ex) {
			System.out.println("Error1 : "+ex.getMessage());
		}
		catch(MyException ex) {
			System.out.println("Error2 : "+ex);
		}
	}
}