package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class Person {
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

public class NewDatabase {
	//Code Optimize Database.java
	//Remove code repeated 

	private Connection conn=null;

	public Connection connect() {		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String host = "localhost";
			int port = 3306;
			String dbname = "java2";		
			String user = "admin";
			String pass = "admin@123";
			Class.forName(driver);//Load Driver
			this.conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname, user, pass);//Connect database server with database			
		}
		catch(Exception ex) {
			this.conn=null;
			System.out.println("Error : "+ex.getMessage());
		}
		return this.conn;
	}

	public boolean close() {
		boolean result = false;
		try {
			this.conn.close();
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}

	public boolean insert(Person p) {
		boolean result = false;
		try {
			Connection conn = connect();
			String str_sql = "insert into person(id, full_name, contact_address) values(?, ?, ?)";
			Statement stat = conn.createStatement();
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setInt(1, p.getPID());
			pstat.setString(2, p.getFullName());
			pstat.setString(3, p.getContactAddress());					
			pstat.executeUpdate(); //Insert, Update, Delete
			pstat.close();
			conn.close();
			result =true;
			//System.out.println("Insert Record Successfully");
		}
		catch(Exception ex) {
			result =false;
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}

	public void select() {		
		try {
			Connection conn = connect();
			String str_sql = "SELECT id, full_name, contact_address FROM person";
			PreparedStatement pstat = conn.prepareStatement(str_sql);			
			ResultSet rs = pstat.executeQuery(); //Insert, Update, Delete
			while(rs.next()) {
				System.out.println(rs.getInt("id")+", "+rs.getString("full_name")+", "+rs.getString("contact_address"));				
			}
			rs.close();
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}

	public void search(int id) {
		try {
			Connection conn = connect();
			String str_sql = "SELECT id, full_name, contact_address FROM person where id=?";
			PreparedStatement pstat = conn.prepareStatement(str_sql);
			pstat.setInt(1, id);
			ResultSet rs = pstat.executeQuery(); //Insert, Update, Delete
			while(rs.next()) {
				System.out.println(rs.getInt("id")+", "+rs.getString("full_name")+", "+rs.getString("contact_address"));				
			}
			rs.close();
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	public static void main(String[] args) throws Exception{
		NewDatabase db1 = new NewDatabase();
		/*		
		Connection conn1  = db1.connect();
		if (conn1 == null) {
			System.out.println("Error to connect with db");
		}
		else {
			System.out.println("Connect db successfully");
		}
		boolean res = db1.close();
		System.out.println(res);

		NewDatabase db1 = new NewDatabase();
		Person p=new Person(2,"Krishna","Ktm");
		boolean res = db1.insert(p);
		if(res==true) {
			System.out.println("Record Insert Successfully");
		}
		else {
			System.out.println("Error: to insert record");
		}
		 */
		
		db1.select(); //Select All
		System.out.println("-------------------------");
		db1.search(2);//Search Record based on id
		
		
		//HW-Nov 29, 2020
		//CRUD - Create, Retrieve, Update, Delete 
		//Insert - Create
		//Select - Retrieve
		//Edit - Update
		//Remove - Delete
		
		//Search Record based on full name
		//Search Record based on contact address		
		//Search Record based on any field of table (id, full name, contact address)
	}

}