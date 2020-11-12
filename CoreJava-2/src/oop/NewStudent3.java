package oop;

public class NewStudent3 extends NewStudent2 {
	
	private int total;
	private int average;
	private String result;
	
	public NewStudent3() {
		super();
		this.total=0;
		this.average=0;
		this.result="";
	}	
	public NewStudent3(int roll_no, String full_name, String grade, int sub1, int sub2, int sub3, int sub4) {
		super(roll_no, full_name, grade, sub1, sub2, sub3, sub4);
		this.total=0;
		this.average=0;
		this.result="";
	}	
	//Method Overloading-> Polymorphism
	
	//Getters	
	public int getTotal() {
		return this.total;
	}
	public int getAverage() {
		return this.average;
	}
	public String getResult() {
		return this.result;
	}
	//Setters
	public void setTotal(int total) {
		this.total=total;
	}
	public void setAverage(int average) {
		this.average=average;
	}
	public void setResult(String result) {
		this.result=result;
	}
	
	//Methods
	public void calcTotal() {
		this.total=super.getSub1()+super.getSub2()+super.getSub3()+super.getSub4();
	}
	public void calcAverage() {
		this.average = this.total/4;
	}
	public void calcResult() {
		this.result="FAIL";
		if (this.getSub1()>=Global.PM) {
			if(this.getSub2()>=Global.PM) {
				if(this.getSub3()>=Global.PM) {
					if (this.getSub4()>=Global.PM) {
						this.result="PASS";
					}
				}
			}
		}		
	}
	
	public void calculateResults() {
		this.calcTotal();
		this.calcAverage();
		this.calcResult();
	}
	
	@Override
	public String toString() {
		return (super.toString()+", "+this.total+", "+ this.average+", "+this.result);
	}
}