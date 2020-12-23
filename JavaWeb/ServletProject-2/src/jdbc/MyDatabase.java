package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyDatabase {

	//Insert Record
	public boolean insert(Contact contact) {		
		boolean result=false;
		//Step-1
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java2";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "INSERT INTO contacts(name, address, email, phone) VALUES(?, ?, ?, ?)";

		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			//Insert Record
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setString(1, contact.getName());
			pstat.setString(2, contact.getAddress());
			pstat.setString(3, contact.getEmail());
			pstat.setString(4, contact.getPhone());

			pstat.executeUpdate(); //executeUpdate-> Insert, Update, Delete Record
			pstat.close();
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}

	//All Records
	public List get_all() {		
		List result=new ArrayList();
		//Step-1
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java2";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "SELECT * FROM contacts";

		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			//Insert Record
			Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			ResultSet rs = pstat.executeQuery(); //executeUpdate-> Insert, Update, Delete Record

			while (rs.next()) {
				int sn;
				String name;
				String address;
				String email;
				String phone;

				sn = rs.getInt("sn");
				name = rs.getString("name");
				address = rs.getString("address");
				email = rs.getString("email");
				phone = rs.getString("phone");

				Contact tmp = new Contact(sn, name, address, email, phone);
				result.add(tmp);

			}			
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			result=new ArrayList();
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}

	public Contact search_contact(int id) {		
		Contact tmp_contact = new Contact();

		//Step-1
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java2";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "SELECT * FROM contacts WHERE sn = ?";

		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			//Insert Record
			Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setInt(1, id);
			ResultSet rs = pstat.executeQuery(); //executeUpdate-> Insert, Update, Delete Record

			while (rs.next()) {
				int sn;
				String name;
				String address;
				String email;
				String phone;

				sn = rs.getInt("sn");
				name = rs.getString("name");
				address = rs.getString("address");
				email = rs.getString("email");
				phone = rs.getString("phone");

				tmp_contact = new Contact(sn, name, address, email, phone);
			}			
			stat.close();
			conn.close();
		}
		catch(Exception ex) {			
			System.out.println("Error : "+ex.getMessage());			
		}
		return tmp_contact;
	}

	//Update Record
	public boolean update(Contact contact) {		
		boolean result=false;
		//Step-1
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java2";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "UPDATE contacts SET name=?, address=?, email=?, phone=? WHERE sn=?";

		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			//Insert Record
			Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setString(1, contact.getName());
			pstat.setString(2, contact.getAddress());
			pstat.setString(3, contact.getEmail());
			pstat.setString(4, contact.getPhone());
			pstat.setInt(5, contact.getSn());

			pstat.executeUpdate(); //executeUpdate -> Insert, Update, Delete Record
			stat.close();
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}

	//Delete Record
	public boolean delete(int id) {		
		boolean result=false;
		//Step-1
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java2";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "DELETE FROM contacts WHERE sn=?";

		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			//Insert Record
			Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setInt(1, id);

			pstat.executeUpdate(); //executeUpdate -> Insert, Update, Delete Record
			stat.close();
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}

	public User login(User user) {
		//Step-1
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java2";
		String db_user="admin";
		String user_pass="admin@123";

		//SQL Statement
		String str_sql = "SELECT * FROM users WHERE user_name = ? and user_pass = ?";

		try {
			//Step-2
			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);

			//Insert Record
			Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setString(1, user.getUser_name());
			pstat.setString(2, user.getUser_pass());
			
			ResultSet rs = pstat.executeQuery(); //executeUpdate-> Insert, Update, Delete Record

			while (rs.next()) {
				int id = rs.getInt(1);
				String login_name = rs.getString(2);
				String login_pass = rs.getString(3);				
				user = new User(id, login_name, login_pass);
			}	
			rs.close();
			stat.close();
			conn.close();
		}
		catch(Exception ex) {			
			System.out.println("Error : "+ex.getMessage());			
		}
		return user;
	}
}
