package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	public static void connect() {
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
			String dbname = "java2";		
			String user = "admin";
			String pass = "admin@123";									
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

	public static void insert() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String host ="localhost";
			int port =3306;
			String dbname = "java2";		
			String user = "admin";
			String pass = "admin@123";				

			//oracle, ms sql server, mysql - RDBMS - SQL 
			//sqlite, mangodb, influxdb - NOSQL


			//Load Driver
			Class.forName(driver);
			//Connect database server with database
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname, user, pass);
			//System.out.println("Connect database server/database successfully");			
			//Insert Record
			String str_sql = "INSERT INTO person(id, full_name, contact_address) VALUES(1, 'Krishna','Balaju')";
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql);
			System.out.println("Record insert successfully");
			stat.close();			
			conn.close();			
			//System.out.println("Close database server/database connection.");
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}	
	}

	public static void select() {
		try {			
			String driver = "com.mysql.cj.jdbc.Driver";
			String host ="localhost";
			int port =3306;
			String dbname = "java2";		
			String user = "admin";
			String pass = "admin@123";									

			//Load Driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname, user, pass);

			String str_sql = "SELECT id, full_name, contact_address FROM person";
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(str_sql);
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("full_name")+" "+rs.getString("contact_address"));				
			}
			conn.close();	
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

	public static void update() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String host ="localhost";
			int port =3306;
			String dbname = "java2";		
			String user = "admin";
			String pass = "admin@123";				

			//Load Driver
			Class.forName(driver);

			//Connect database server with database
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname, user, pass);			

			//Update Record/Edit Record			
			String str_sql = "UPDATE person SET full_name='New Name1', contact_address='new address1' WHERE id = 3";
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql);
			System.out.println("Record update successfully");
			stat.close();			
			conn.close();
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}	
	}

	public static void delete() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String host ="localhost";
			int port =3306;
			String dbname = "java2";		
			String user = "admin";
			String pass = "admin@123";				

			//Load Driver
			Class.forName(driver);

			//Connect database server with database
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname, user, pass);			

			//Update Record/Edit Record			
			String str_sql = "DELETE FROM person WHERE id = 1";
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql);
			System.out.println("Delete record successfully");
			stat.close();			
			conn.close();
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}	
	}
	
	public static void main(String[] args) {
		//connect()
		//insert();
		//select();
		//update();// Edit Record
		//delete();

	}
}