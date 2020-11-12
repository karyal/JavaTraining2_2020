package core_java;

public class HelloWord {
	public static void main(String[] args) {
		try {
			System.out.println("Hello world of Java.");
		}
		catch(Exception obj) {
			System.out.println("Error : "+obj.getMessage());
		}
	}
}
