package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Third extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");//Set Content Type of Output

		//Receive value from Web Form
		String name = request.getParameter("txt_name");
		String address = request.getParameter("txt_address");
		String email = request.getParameter("txt_email");
		String phone = request.getParameter("txt_phone");
		
		//Task-2
		//Server Side Validation Java Language (Regular Expression)
		
		//Task-3
		//Process Value(s)
			//Arithmetic Process
			//Logical Process
			//Redirect output on Display, File (text file), PDF, CSV, XML, JSON, Database (RDBMS, NOSQL)
		
		out.println("<h3>Personal Info</h3>");
		out.println("NAME : "+name.toUpperCase());
		out.println("<br/>ADDRESS : "+address.toUpperCase());
		out.println("<br/>EMAIL : "+email.toLowerCase());
		out.println("<br/>PHONE : "+phone.toUpperCase());
		
		out.println("<br/><br/><br/><br/>");
		out.println("<a href='index.jsp'> Index</a>");
		out.close();		
	}
}