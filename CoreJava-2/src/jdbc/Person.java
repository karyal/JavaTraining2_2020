package jdbc;

public class Person {
	private int pid;
	private String full_name;
	private String contact_address;

	public Person(int pid, String full_name, String contact_address) {
		this.pid=pid;
		this.full_name=full_name;
		this.contact_address = contact_address;
	}

	//getters
	public int getPID() {
		return this.pid;
	}

	public String getFullName() {
		return this.full_name;
	}

	public String getContactAddress() {
		return this.contact_address;
	}
	//Setters
	public void setPID(int pid) {
		this.pid=pid;
	}

	public void setFullName(String full_name) {
		this.full_name=full_name;
	}

	public void setContactAddress(String contact_address) {
		this.contact_address=contact_address;
	}

	@Override
	public String toString() {
		return this.pid+", "+this.full_name+", "+this.contact_address;
	}
}