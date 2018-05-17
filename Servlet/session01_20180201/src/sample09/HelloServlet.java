package sample09;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		HttpSession session = req.getSession(false);
		/*
		1. getSession(), getSession(true) 
			HttpSession이 있으면, 현재 HttpSession을 반환하고 없으면 새로이 생성한다
		
		2. getSession(false)
			HttpSession이 있으면, 현재 HttpSession을 반환하고 없으면 새로이 생성하지 않고 null반환한다
		*/
		
		if(session == null) {
			sb.append("<p>세션이 존재하지 않습니다 세션을 시작합니다</p>");
			session = req.getSession(true);
		}else {
			sb.append("<p>세션을 시작합니다</p>");
		}
		
		sb.append("<a href=\"hello\">다시 표시</a>");
		
		sb.append("</body>");
		sb.append("</html>");
		
		out.println(new String(sb));		
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	
}
