package exceptions;

public class Example1 {
	public static void f1() {
		int num1;
		int num2;
		int num3;
		
		num1 = 10;
		num2 = 8;
		num3 = num1+num2;
		
		System.out.println("Result : "+num3);		
		//System.out.println("Hello");		
	}
	
	//Exception
	public static void f2() {		
		int num1 = 10;
		int num2 = 5;
		
		int num3 = num1 + num2;//Add - 15
		int num4 = num1 - num2;//Sub - 5
		int num5 = num1 * num2;//Prd - 50
		int num6 = num1 / num2;//Div - 2
		
		System.out.println("Result "+ num3);
		System.out.println("Result "+ num4);
		System.out.println("Result "+ num5);
		System.out.println("Result "+ num6);
	}
	
	public static void main(String[] args) {
		f2();//Stop point
	}
}