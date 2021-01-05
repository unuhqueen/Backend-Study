package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/header")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	//요청이 들어올 때 모든 정보는 request에 담아둠
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		
		//모든 헤더 이름을 문자열 Enumeration 객체로 반환
		Enumeration<String> headerNames = request.getHeaderNames();
		
		//while문을 통해 header의 name을 알아내는 과정
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			//getHeader 메서드로 헤더의 값 정보를 알아냄
			String headerValue = request.getHeader(headerName);
			//브라우저에 출력
			out.println(headerName + " : " + headerValue + " <br> ");
		}		
		
		out.println("</body>");
		out.println("</html>");
	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
