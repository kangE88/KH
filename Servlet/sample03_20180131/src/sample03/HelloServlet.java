package sample03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html charset=utf-8"); 
		PrintWriter out = resp.getWriter();
		
		String code = req.getParameter("code");
		
		if(code == null || code.length() == 0) {
			code = "200";
		}
		
		if(code.equals("200")) {

				StringBuffer sb = new StringBuffer();
				
				//servlet --> java --> web
				//jsp --> java + web
				
				sb.append("<html>");
				sb.append("<head>");
				sb.append("<title>here title</title>");
				sb.append("</head>");
				
				sb.append("<body>");
				sb.append("<p>200:SC_OK</p>");

				sb.append("</body>");
				sb.append("</html>");
				
				
				out.println(new String(sb));

		}else {
			if(code.equals("404")) {
				resp.sendError(HttpServletResponse.SC_NOT_FOUND, "NOT_FOUND");
			}else if(code.equals("500")) {
				resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "SERVER_ERROR");
			}
			out.close();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet doPost");
	}

}
