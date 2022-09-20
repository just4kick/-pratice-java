package superman;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo2
 */
@WebServlet("/demo2")
public class demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		request.getContextPath();
		response.getWriter();
		request.getContextPath();
		response.setContentType("text/html");
		//response.sendRedirect("http://www.google.com");
		PrintWriter pw = response.getWriter();
		String name1 = request.getParameter("fname");
		//String name2 = request.getParameter("lname");
		pw.println(name1);
		pw.close();
	}

}
