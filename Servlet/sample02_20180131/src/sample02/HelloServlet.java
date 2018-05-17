package sample02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text.html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.println(createHTML("GET"));
		
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hellow");
		resp.setContentType("text.html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.println(createHTML("POST"));
		
		out.close();
	}
	
	public String createHTML(String methodType) {
		
		StringBuffer sb = new StringBuffer();
		
		//servlet --> java --> web
		//jsp --> java + web
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>here title</title>");
		sb.append("</head>");
		
		sb.append("<body>");
		sb.append("<p>");
		sb.append(methodType+"method call");
		sb.append("</p>");
		
		sb.append("<p><a href=\"sample\">sample link</a></p>");
		
		sb.append("<form action=\"post.html\" method=\"post\">");
		sb.append("<input type=\"submit\" value=\"post send\">");
		sb.append("</form>");
		
		sb.append("<form action=\"get.html\" method=\"get\">");
		sb.append("<input type=\"submit\" value=\"get send\">");
		sb.append("</form>");
		
		sb.append("</body>");
		sb.append("</html>");
		
		
		return (new String(sb));
		
	}

}
