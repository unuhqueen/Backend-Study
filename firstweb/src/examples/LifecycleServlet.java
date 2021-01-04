package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LifecycleServlet() {
    	//콘솔에 출력하는 것, 응답결과로 보내줘는 아님
       System.out.println("LifecycleServlet 생성!!");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init test 호출!!");
	}

	
	public void destroy() {
		//servlet이 수정되면 기존의 객체를 destroy 메서드를 통해 삭제함
		System.out.println("destroy 호출!!");
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println의 값을 응답으로 보내줌
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		//submit이 눌렸을 때 action의 URL로 요청해달라는 의미, 이 때 메서드는 POST로
		out.println("<form method='post' action='/firstweb/LifecycleServlet'>");
		out.println("name : <input type='text' name='name'><br>");
		out.println("<input type='submit' value='ok'><br>");                                                 
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//parameter 중에 name으로 들어있는 값을 꺼내서 응답
		String name = request.getParameter("name");
		out.println("<h1> hello " + name + "</h1>");
		out.close();
	}

	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//요청된 객체가 이미 메모리에 있다면, service 메서드만 호출됨 (예: 새로고침)
//		System.out.println("service 호출!!");
//	}

}
