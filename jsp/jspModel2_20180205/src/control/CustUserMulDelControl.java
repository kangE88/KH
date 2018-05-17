package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustUserService;

public class CustUserMulDelControl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text.html charset=utf-8");
		
		System.out.println("muldel");
		
		String command = req.getParameter("command");
		
		if(command.equals("muldel")) {
			
			CustUserService service = CustUserService.getInstance();
			
			String ids[] = req.getParameterValues("delck");
			
			if(ids==null || ids.length==0) {
				System.out.println("한개이상 체크하시오.");
			}else{
				boolean isS = service.deleteCustUser(ids);
				
				if(!isS) {
					System.out.println("고객정보 삭제 실패");
				}
			}
			
			dispatch("CustUserListControl?command=list", req, resp);
			
			
		}
	}
	
	public void dispatch(String urls, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		RequestDispatcher dispatch = req.getRequestDispatcher(urls);
		dispatch.forward(req, resp);
	}

}
