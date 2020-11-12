package oop;

public class NewTeacher extends Teacher{
	
	private String email;
	private String mobile;	
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}
	
}
