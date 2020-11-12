package oop;

public class Global {
	
	static public int PM = 40;
	
	static public void printPM() {
		System.out.println("PM : "+PM);
	}
	
	public void printPM(String message) {
		System.out.println(message+" : "+ PM);
	}
	
	public static void main(String[] args) {
		System.out.println(Global.PM);
		Global.printPM();
		new Global().printPM("Hello");
	}
}
