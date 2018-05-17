package sample12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dispatchtest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/html; charset=utf-8");		
		PrintWriter out = resp.getWriter();		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		
		// include(가져오기) A <- B, forward(이동) A -> B
		
		out.println("<p>이 다음으로 include 처리를 시작합니다</p>");
		
		String disp = "includetest";
		RequestDispatcher dispatch = req.getRequestDispatcher(disp);
		dispatch.include(req, resp);
		//dispatch.forward(req, resp);		
				
		out.println("<p>여기서 include 처리를 끝입니다</p>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	
}
