package unit1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import jdbc.Contact;
import jdbc.MyDatabase;

public class Six extends GenericServlet {
	private static final long serialVersionUID = 1L;
  
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		MyDatabase mdb = new MyDatabase();
		List contacts = mdb.get_all();
		
		out.println("<a href='form3.jsp'>ADD NEW</a>");				
		out.println("<table border=1>");
		out.println("<tr><td>SN</td><td>NAME</td><td>ADDRESS</td><td>EMAIL</td><td>PHONE</td><td>CONTROL</td></tr>");		
		
		for(int i =0; i<contacts.size(); i++) {
			Contact tmp_contact = (Contact) contacts.get(i); 
			System.out.println(tmp_contact.getSn());
			out.println("<tr><td>"+ tmp_contact.getSn() +"</td><td>"+ tmp_contact.getName() +"</td><td>"+ tmp_contact.getAddress() +"</td><td>"+ tmp_contact.getEmail() +"</td><td>"+ tmp_contact.getPhone() +"</td><td><a href='seven?id="+ tmp_contact.getSn() +"'>EDIT</a> | <a href='nine?id="+ tmp_contact.getSn() +"'>DELETE</a> </td></tr>");
		}		
		out.println("</table");
	}

}
