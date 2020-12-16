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
		String name = request.getParameter("txt_name");//Receive value from Web Form
		//Process (Arithemetic or Logical Processing)
		out.println("NAME : "+name);
		out.println("<br/><br/><br/><br/>");
		out.println("<a href='index.jsp'> Index</a>");
		out.close();		
	}
}