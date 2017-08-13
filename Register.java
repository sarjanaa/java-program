package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Register
 */
@WebServlet("/loginServlet")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("u");
		String password=request.getParameter("p");
		if(username.equals("sarjanaa")&&password.equals("sarjanaa"))
			pw.println("Login successful");
		else
			pw.println("Login failed");
	}

}
