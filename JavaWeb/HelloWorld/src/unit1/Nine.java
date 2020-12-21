package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import jdbc.MyDatabase;

public class Nine extends GenericServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		//Delete Record from Database
		PrintWriter out = response.getWriter();
		int sn = Integer.parseInt(request.getParameter("id"));
		MyDatabase mydb = new MyDatabase();
		boolean result = mydb.delete(sn);
		if (result == true) {
			out.println("Record Delete Successfully");
		}
		else {
			out.println("Error: to delete record");
		}
		
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='index.jsp'>Index</a> | <a href='six'>Display All</a>");
	}
}
