package jdbc;

public class User {
	private int id;
	private String loginName;
	private String loginPass;
	
	public User() {
		this.id = 0;
		this.loginName = "";
		this.loginPass = "";
	}

	public User(String loginName, String loginPass) {		
		this.id = 0;
		this.loginName = loginName;
		this.loginPass = loginPass;
	}
	
	public User(int id, String loginName, String loginPass) {		
		this.id = id;
		this.loginName = loginName;
		this.loginPass = loginPass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", loginPass=" + loginPass + "]";
	}				
}
