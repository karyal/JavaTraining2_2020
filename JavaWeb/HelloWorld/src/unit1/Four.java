package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Four extends GenericServlet {
	private static final long serialVersionUID = 1L;
           
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//Getting values from Client/Web Form
		double num1 = Double.parseDouble(request.getParameter("txt_n1"));
		double num2 = Double.parseDouble(request.getParameter("txt_n2"));
		
		//Process
		double sum, diff, prd, div, max, min;
		
		//Addition
		sum = num1+num2;
		
		//Substraction
		if (num1>= num2) { 
			diff = num1 - num2;
		}
		else {
			diff = num2 - num1;
		}						
		
		//Product
		prd = num1 * num2;
		
		//Division
		if (num1>= num2) { 
			div = num1/num2;
		}
		else {
			div = num2/num1;
		}
		
		//Min and Max
		if (num1 >= num2) { 
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		//Redirect result to text file, pdf, csv, xml, json, rdbms, nosql.
		
		//Print Result - Display
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");		
		out.println("<h3>Number Processing System</h3>");
		out.println("Num1 : "+num1+"<br/>");
		out.println("Num2 : "+num2+"<br/>");
		out.println("SUM : "+sum+"<br/>");
		out.println("DIFF : "+diff+"<br/>");
		out.println("PRD : "+prd+"<br/>");
		out.println("DIV : "+div+"<br/>");
		out.println("MAX : "+max+"<br/>");
		out.println("MIN : "+min+"<br/>");
		
		out.println("<br><br><br>");
		out.println("<a href='index.jsp'>Index</a>");
	}
}