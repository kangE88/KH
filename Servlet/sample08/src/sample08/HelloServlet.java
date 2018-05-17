package sample08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		sb.append("<h1>Cookie</h1>");
		
		Cookie cookies[] = req.getCookies();
		Cookie visitedCookie = null;
		
		if(cookies != null) {
			
			// 쿠키의 취득
			for (int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("visited1")) {
					visitedCookie = cookies[i];
				}
			}
			
			if(visitedCookie != null) {	// 찾은 쿠키가 있을 때
				int visit = Integer.parseInt(visitedCookie.getValue()) + 1;
				
				sb.append("<p>");
				sb.append(visit);
				sb.append("번째 방문입니다");
				sb.append("</p>");
				
				visitedCookie.setValue(visit + "");
				visitedCookie.setMaxAge(30);	// <-- 30초       시간설정 (60*60)==1시간 
				resp.addCookie(visitedCookie);	// 갱신			
				
			}else {	// 없을 때
				sb.append("<p>첫번째 방문입니다</p>");
				Cookie newCookie = new Cookie("visited1", "1");		
				resp.addCookie(newCookie);
			}				
			
		}else {
			sb.append("<p>첫번째 방문입니다</p>");
			Cookie newCookie = new Cookie("visited1", "1");		
			resp.addCookie(newCookie);
		}	
		/*
		// 쿠키를 모두 삭제시
		Cookie cookies[] = req.getCookies();
		if(cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				cookies[i].setMaxAge(0);	// 유효기간을 만료
				resp.addCookie(cookies[i]);				
			}
		}
		
		// 특정 쿠키를 삭제
		Cookie cookie = new Cookie("cookiename", null);
		cookie.setMaxAge(0);
		resp.addCookie(cookie);
		*/
		
		
		sb.append("</body>");
		sb.append("</html>");
		
		out.println(new String(sb));		
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}
