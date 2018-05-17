package sample10;

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
		
		if(session == null) {
			sb.append("<p>첫 방문입니다</p>");
			session = req.getSession(true);
			
			// session object 생성			
			session.setAttribute("visited", "1");			
		}else {
			String visitedStr = (String)session.getAttribute("visited");
			int visited = Integer.parseInt(visitedStr);
			visited++;
			
			sb.append("<p>방문회수는 ");
			sb.append(visited);
			sb.append("번째입니다</p>");	
			
			session.setAttribute("visited", Integer.toString(visited));
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
