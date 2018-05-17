package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.CustUserBean;
import model.CustUserService;

public class CustUserListControl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text.html, charset=UTF-8");
		
		System.out.println("UserList doprocess");
		
		String command = req.getParameter("command");
		
		if(command.equals("list")) {
			//list 
			CustUserService service = CustUserService.getInstance();
			
			List<CustUserBean> custlist = service.getcustUserList();
			
			req.setAttribute("custlist", custlist);
			
			dispatch("custuserlist.jsp", req, resp);
		}
	}
		
	public void dispatch(String urls, HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		RequestDispatcher dispatch = req.getRequestDispatcher(urls);
		dispatch.forward(req, resp);
	}

}
