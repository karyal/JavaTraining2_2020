package collections.reflections;

public class Example5 {
	public static void main(String[] args) {
		Person4 obj4 = new Person4();
		if (obj4 instanceof Person4) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}