package cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dispCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/html charset=utf-8"); 
		PrintWriter out = resp.getWriter();
		
/*		//쿠키명 value
		Cookie cookie = new Cookie("visited", "1");
		resp.addCookie(cookie);
		
		cookie = new Cookie("cookie1", "123");
		resp.addCookie(cookie);*/
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>title</title>");
		sb.append("</head>");
		sb.append("<body>");
	
		sb.append("<h1>DispCookies</h1>");
		
			
		Cookie cookies[] = req.getCookies();
		
		for(int i=0;i<cookies.length;i++) {
			if(cookies != null) {
				cookies[i].setMaxAge(0);
				resp.addCookie(cookies[i]);
			}
		}
		sb.append("<p>쿠키 삭제</p>");
		sb.append("<a href=\"Servlet01\">되돌아가기</a>");
		
		sb.append("</body>");
		sb.append("</html>");
		
		out.println(new String(sb));
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
