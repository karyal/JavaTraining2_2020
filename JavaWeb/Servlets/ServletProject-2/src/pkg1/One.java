package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Form Method Get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	//Form Method Post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	protected void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");		
		
		out.println("Hello world of HttpServlet!");
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='index.jsp'>Index</a>");
		out.close();
	}
}