package sample04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		
		String tax = getInitParameter("tax");
		System.out.println("tax-->"+tax);
		
		String url = req.getParameter("url");
		System.out.println("url===> "+url);
		
		resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
		
		if(url.equals("naver")){
			//action
			//resp.sendRedirect("NewFile.html");
			resp.sendRedirect("http://naver.com");
			resp.setHeader("Location", "http://www.naver.com");
		}else {
			//resp.sendRedirect("http://google.com");
		}
	}

}