package sample11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/html; charset=utf-8");		
		PrintWriter out = resp.getWriter();
			
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Insert title here</title>");
		sb.append("</head>");
		sb.append("<body>");
		
		HttpSession session = null;
	//	HttpSession session = req.getSession(false);
		
		if(session == null) {
			session = req.getSession(true);
			
			session.setAttribute("age", "24");
			session.setAttribute("name", "홍길동");
			
			sb.append("<p>세션 object를 등록했습니다</p>");
		}
		
		/*현재 등록되어 있는 세션을 표시*/
		sb.append("<p>");
		sb.append("현재 등록되어 있는 세션을 표시<br>");
		
		Enumeration<String> enum_session = session.getAttributeNames();
		while(enum_session.hasMoreElements()) {
			String key = enum_session.nextElement();
			String val = (String)session.getAttribute(key);
			
			sb.append(key + " = " + val + "<br>");		
		}		
		
		sb.append("</p>");
		
		sb.append("<a href=\"deleteobject\">age 오브젝트 삭제</a>");
		
		sb.append("<br>");
		
		sb.append("<a href=\"invalidateSession\">session 삭제</a>");
		
		sb.append("</body>");
		sb.append("</html>");
		
		out.println(new String(sb));		
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	
}
