package pkg2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.MyDatabase;
import jdbc.User;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String login_name = request.getParameter("login_name");
		String login_pass = request.getParameter("login_pass");
		
		User user = new User(0, login_name , login_pass );
		
		MyDatabase mdb = new MyDatabase();
		user = mdb.login(user);
		
		if (user.getId()>=1) {
			out.println("Login success");
		}
		else {
			out.println("Error to login");
		}				
		out.close();		
	}
}