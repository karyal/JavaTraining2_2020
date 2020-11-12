package oop;
			//Sub Class         Super Class

public class NewStudent extends Student{
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	
	//Constructors
	public NewStudent() {
		super();//Student(); //Default Constructor of Student Class
		this.sub1=0;
		this.sub2=0;
		this.sub3=0;
		this.sub4=0;
	}
	
	public NewStudent(int roll_no, String full_name, String grade, int sub1, int sub2, int sub3, int sub4) {
		super(roll_no, full_name, grade); //Parameterized Constructor of Student Class
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	
	//Getters
	public int getSub1() {
		return this.sub1;
	}
	public int getSub2() {
		return this.sub2;
	}
	public int getSub3() {
		return this.sub3;
	}	
	public int getSub4() {
		return this.sub4;
	}
	
	//Setters
	public void setSub1(int sub1) {
		this.sub1=sub1;
	}
	public void setSub2(int sub2) {
		this.sub2=sub2;
	}
	public void setSub3(int sub3) {
		this.sub3=sub3;
	}
	public void setSub4(int sub4) {
		this.sub4=sub4;
	}
	
	public String toString() {
		return (super.toString()+", "+this.sub1+", "+this.sub2+", "+this.sub3+", "+this.sub4);
	}
}
