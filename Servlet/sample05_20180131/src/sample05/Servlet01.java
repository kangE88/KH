package sample05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter out = resp.getWriter();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<p>");
		
		//element들을 보관할 수 있는 List형
		Enumeration<String> names = req.getParameterNames();

		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			String values[] = req.getParameterValues(name);
			
			if(values != null) {
				for(int i = 0; i<values.length;i++) {
					sb.append(name);
					sb.append(":");
					sb.append(values[i]);
					sb.append("<br>");
					
				}
			}
		}
		
		sb.append("</p>");
		
		sb.append("</body>");

		sb.append("</html>");
		
		out.println(new String(sb));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
