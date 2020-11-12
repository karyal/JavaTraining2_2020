package oop;

public class StudentTest {
	
	public static void main(String[] args) {
		
		/*
		Student s1 = new Student(); //Default Constructor
		Student s2 = new Student(1, "Krishna","One"); //Parameterized Constructor

		//Setters - > Replaced default values
		s1.setRollNo(2);
		s1.setFullName("Raj Thapa");
		s1.setGrade("Two");
		
		System.out.println(s1.getRollNo()+", "+s1.getFullName()+", "+s1.getGrade());
		System.out.println(s2.getRollNo()+", "+s2.getFullName()+", "+s2.getGrade());
				
		System.out.println(s2.toString());
		System.out.println(s1.toString());
		
		System.out.println(s2);//call toString()
		System.out.println(s1);//call toString()		
		
		
		NewStudent2 ns1=new NewStudent2();
		//Super Class
		ns1.setRollNo(1);
		ns1.setFullName("Krishna");
		ns1.setGrade("One");

		//Sub Class
		ns1.setSub1(58);
		ns1.setSub2(78);
		ns1.setSub3(45);
		ns1.setSub4(96);
		
		System.out.println(ns1);
		*/

		//decalre
		
		try {
			//initialize
			//input
			//process
			//output
			
			NewStudent3 ns1 = new NewStudent3(1,"Raj Thapa","One",45, 65, 32, 89);
			NewStudent3 ns2 = new NewStudent3(2,"Raj Thapa","One",78, 47, 69, 48);
			ns1.calcTotal();
			ns1.calcAverage();
			ns1.calcResult();		
			ns2.calculateResults();
			System.out.println(ns1);
			System.out.println(ns2);
		}
		catch(Exception ex) { //Generalize Handle
			System.out.println("Error : "+ ex.getMessage());
		}
	}
}