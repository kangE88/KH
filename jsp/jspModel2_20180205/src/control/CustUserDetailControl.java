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

public class CustUserDetailControl extends HttpServlet {

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
		
		System.out.println("CustUserDetailControl doprocess");
		
		String command = req.getParameter("command");
		
		if(command.equals("detail")) {
			CustUserService service = CustUserService.getInstance();
			
			String id = req.getParameter("id");
			
			CustUserBean custDto = service.getcustUserDetail(id);
			
			req.setAttribute("cust", custDto);
			
			dispatch("custuserdetail.jsp", req, resp);
		}
		if(command.equals("updateBf")) {
			
		}
	}
		
	public void dispatch(String urls, HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		RequestDispatcher dispatch = req.getRequestDispatcher(urls);
		dispatch.forward(req, resp);
	}

}
