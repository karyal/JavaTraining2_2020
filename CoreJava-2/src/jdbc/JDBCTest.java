package jdbc;

public class JDBCTest {

	public static void main(String[] args) {
		User user = new User();
		user.setLoginName("user");
		user.setLoginPass("user");		
		NewDatabase ndb = new NewDatabase();
		user = ndb.login(user);
		if (user.getId()!=0) {
			System.out.println("Login success");
			//System.out.println("User Details: "+user);			
		}
		else {
			System.out.println("Error: to login");			
		}
	}
}