package cookieExam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/html charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		StringBuffer sb = new StringBuffer();
		
		Cookie cookie = new Cookie("visited", "1");
		resp.addCookie(cookie);
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("</head>");
		sb.append("<body>");
		
		sb.append(cookie);
		sb.append(" 쿠키 저장");
				
		sb.append("</body>");
		sb.append("</html>");
		
		
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
