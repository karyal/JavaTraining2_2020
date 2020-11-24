package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
	
	public static void main(String[] args) {
		//1. Connect with database server
		//2. Insert/Create
		//3. Retrieve/Select
		//4. Update/Edit
		//5. Delete/Remove
		
		//pre-requirements
		//1. Databasebase Server (localhost)
		//2. Database Server Port (3306)
		//3. Database Server User (admin)
		//4. Database Server User Password (admin@123)
		//5. Database Name (mydb)
		
		//Add jdbc library (mysql connector)
		
		try {			
			String driver = "com.mysql.cj.jdbc.Driver";
			String host ="localhost";
			int port =3306;
			String dbname = "mydb";		
			String user = "admin";
			String pass = "admin@123";
			
			//String user = "root";
			//String pass = "";
			
			//Load Driver
			Class.forName(driver);
			//Connect database server with database
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname, user, pass);
			System.out.println("Connect database server/database successfully");
			conn.close();
			System.out.println("Close database server/database connection.");
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}		
	}
}