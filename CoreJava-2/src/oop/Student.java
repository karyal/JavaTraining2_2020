package oop;
/*
//Encapsulation{
	variables
	functions
	access specifiers
	constructors //method overloading
	getters methods
	setters methods
	processing methods
	toString
}
*/

public class Student {
	//Instance Variable
	private int roll_no;
	private String full_name;
	private String grade;
	
	//Constructors | Special method of a class which is used to initialize an object of the class.	
	public Student() { //Default Constructor
		this.roll_no=0;
		this.full_name="";
		this.grade="";
	}
	
	public Student(int roll_no, String full_name, String grade) {//Parameterized Constructor
		this.roll_no=roll_no;
		this.full_name=full_name;
		this.grade=grade;
		//Instance variable = parameter variable
	}
	
	//If a class have same name of two or more than two methods with different parameter list is called Method Overloading	
	//Getters
	public int getRollNo() {
		return this.roll_no;
	}
	public String getFullName() {
		return this.full_name;
	}
	public String getGrade() {
		return this.grade;
	}
	
	//Setters
	public void setRollNo(int roll_no) {
		this.roll_no=roll_no;
	}
	public void setFullName(String full_name) {
		this.full_name=full_name;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	
	//Multiple Value return
	public String toString() {
		return (this.roll_no+", "+this.full_name+", "+this.grade);				
	}
}