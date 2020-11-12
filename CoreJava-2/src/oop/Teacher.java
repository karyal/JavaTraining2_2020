package oop;

public class Teacher {
	private String name;
	private String address;
	
	public Teacher() {
		this.name="";
		this.address="";
	}
	
	public Teacher(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
}
