package exceptions;
import java.util.Scanner;
public class Example5 {
	public static void main(String[] args){	
		try {
			System.out.print("Enter first no : ");
			int n1 = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.print("Enter second no : ");
			int n2 = Integer.parseInt(new Scanner(System.in).nextLine());
			int n3 = n1/n2;
			System.out.println(n3);
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
			System.out.println("Error to divident, please enter >0 value");
		}
		
		/*
		System.out.print("Enter first no : ");
		int n1 = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter second no : ");
		int n2 = Integer.parseInt(new Scanner(System.in).nextLine());
		int n3 = n1/n2;
		System.out.println(n3);
		*/
	}
}
