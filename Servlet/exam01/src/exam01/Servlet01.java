package exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		
		resp.setCharacterEncoding("euc-kr");
		
		PrintWriter out = resp.getWriter();
		
		String[] frults = req.getParameterValues("frults");
		System.out.println("frults==>"+frults);
		
		String name = req.getParameter("name");
		System.out.println("name==>"+name);
		
		if(name == null || name.length()==0){
			name="지정하지않았습니다";
		}
		
		String age = req.getParameter("age");
		System.out.println("age==>"+age);
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<p>이름 : "+name+"</p>");
		out.println("<p>나이 : "+age+"</p>");
		for(int i=0;i<frults.length;i++) {
			out.println("<p>frults : "+frults[i]+"</p>");
		}
		out.println("</body>");

		out.println("</html>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
	}

}
