package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/param")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ParameterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 응답으로 보낸 모든 정보: response, 요청으로 보낸 모든 정보: request
	// 요청: 클라이언트 -> 서버, 응답: 서버 -> 클라이언트
	// GET: 서버에 요청을 하는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");

		//name 변수에 파라미터의 name 값인 kim이 들어간다.
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		out.println("name : " + name + "<br>");
		out.println("age : " + age + "<br>");

		out.println("</body>");
		out.println("</html>");
	}

}
