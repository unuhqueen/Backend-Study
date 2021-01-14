package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationScope01")
public class ApplicationScope01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ApplicationScope01() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext application = getServletContext();
		int value = 1;
		application.setAttribute("value", value);
		out.println("<h1>value : " + value + "</h1>");
	}

}
