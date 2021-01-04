package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TenServlet
 */
public class TenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//브라우저가 응답을 받았을 때 응답의 type을 알려주는 메서드
		response.setContentType("text/html; charset=utf-8");
		//print하는 통로를 만듦, getWriter()를 수행하면 PrintWriter 객체가 return됨 
		PrintWriter out = response.getWriter();
		out.println("<h1>1에서 10까지 출력</h1>");
		for (int i = 1; i <= 10; i++) {
			out.print(i+"<br>");
		}
		out.close();
	}

}
