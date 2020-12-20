package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import jdbc.Contact;
import jdbc.MyDatabase;

public class Five extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		//Receive values from Web Form-3
		String name = request.getParameter("txt_name");
		String address = request.getParameter("txt_address");
		String email = request.getParameter("txt_email"); 
		String phone = request.getParameter("txt_phone");

		Contact contact = new Contact(0, name, address, email, phone);
		MyDatabase mdb = new MyDatabase();
		boolean result = mdb.insert(contact);
		if (result==true) {
			//System.out.println("Insert Record Successfully");
			out.println("Insert Record Successfully");
		}
		else {
			//System.out.println("Error to insert record");
			out.println("Error to insert record");
		}
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='index.jsp'>Index</a>");
	}
}