package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import jdbc.Contact;
import jdbc.MyDatabase;

//Display Edit Form
public class Seven extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int sn = Integer.parseInt(request.getParameter("id"));
		MyDatabase mdb = new MyDatabase();
		Contact contact = mdb.search_contact(sn);
		//Record Found or Not
		if (contact.getName().length()>=1) {
			out.println("<h3>Contact Edit Form</h3>");
			out.println("<form action='eight' method='post'>");
			
			out.println("<input type='hidden' name='txt_sn' value='"+ sn +"'>");
			out.println("ID : <input type='text' name='txt_sn0' value='"+ sn +"' disabled><br/>");			
			out.println("NAME : <input type='text' name='txt_name' value='"+ contact.getName() +"'><br/>");
			out.println("ADDRESS : <input type='text' name='txt_address' value='"+ contact.getAddress() +"'><br/>");
			out.println("EMAIL : <input type='text' name='txt_email' value='"+ contact.getEmail() +"'><br/>");
			out.println("PHONE : <input type='text' name='txt_phone' value='"+ contact.getPhone() +"'><br/>");
			
			out.println("<input type='submit' value='UPDATE'><br/>");
			out.println("</form>");
		}
	}
}
