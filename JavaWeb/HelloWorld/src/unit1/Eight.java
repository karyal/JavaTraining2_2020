package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import jdbc.Contact;
import jdbc.MyDatabase;

public class Eight extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//Receive from for update
		int sn = Integer.parseInt(request.getParameter("txt_sn"));
		String name = request.getParameter("txt_name");
		String address = request.getParameter("txt_address");
		String email = request.getParameter("txt_email");
		String phone = request.getParameter("txt_phone");
		
		Contact tmp_contact = new Contact(sn, name, address, email, phone);
		MyDatabase mdb = new MyDatabase();
		boolean result = mdb.update(tmp_contact);
		if(result == true) {
			out.println("Record Update Successfully");
		}
		else {
			out.println("Error: to update record");
		}
		
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='index.jsp'>Index</a> | <a href='six'>Display All</a>");
	}
}
