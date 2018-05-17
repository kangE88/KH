<%@page import="javax.swing.JOptionPane"%>
<%@page import="DAO.CustUserManager"%>
<%@page import="DTO.CustUserBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
public boolean isNull(String str){
	return str == null || str.trim().equals("");
}
%>

<%
String command = request.getParameter("command");

CustUserManager manager = new CustUserManager();

if(command.equals("list")){
	List<CustUserBean> custlist = manager.getcustUserList();
	
	request.setAttribute("custlist", custlist);
	//session.setAttribute("custlist", custlist);
	//application.setAttribute("custlist", custlist);
	
	pageContext.forward("custuserlist.jsp");
	
}else if(command.equals("add")){
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	
	if(isNull(id)||isNull(name)||isNull(address)){
		System.out.println("모든정보를 입력하셔야합니다.");
		pageContext.forward("custadd.jsp");
	}
	CustUserBean list = new CustUserBean();
	
	list.setId(id);
	list.setName(name);
	list.setAddress(address);
	
	int count = manager.addlist(list);
	
	if(count == 0){
		System.out.println("추가하지 못했습니다");
		pageContext.forward("custadd.jsp");
	}
	
	response.sendRedirect("custusercontrol.jsp?command=list");
	
}else if(command.equals("muldel")){
	String ids[] = request.getParameterValues("delck");
		 
	if(ids == null || ids.length == 0){
		JOptionPane.showMessageDialog(null, "id를 1개이상 선택하셔야 합니다.");
	}else{
		boolean isS = manager.deleteCustUser(ids);
		 
		if(!isS){
		 JOptionPane.showMessageDialog(null, "고객정보 삭제 실패");
		}
	}
	
	response.sendRedirect("custusercontrol.jsp?command=list");
	
}else if(command.equals("detail")){
	//id 값으로 DB에서 해당 user 정보 조회
	
	String id = request.getParameter("id");
	
	CustUserBean custDao = manager.getcustUserDetail(id);	
	request.setAttribute("cust", custDao);
	pageContext.forward("custuserdetail.jsp");
	
}else if(command.equals("updateBf")){
	System.out.println("updateBf");
	
	String id = request.getParameter("id");
	
	CustUserBean custDao = manager.getcustUserDetail(id);		
	request.setAttribute("cust", custDao);

	pageContext.forward("custuserupdate.jsp");
	
}else if(command.equals("update")){
	System.out.println("update");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	
	CustUserBean list = new CustUserBean();
	
	//list.setId(id);
	list.setName(name);
	list.setAddress(address);
	
	int count = manager.updateCustUser(list);
	
	if(count==0){
		System.out.println("업데이트 실패");
	}else{
		response.sendRedirect("custusercontrol.jsp?command=list");
	}
	
}else if(command.equals("delete")){
	String ids[] = request.getParameterValues("delck");
	 
	if(ids == null || ids.length == 0){
		JOptionPane.showMessageDialog(null, "id를 1개이상 선택하셔야 합니다.");
	}else{
		boolean isS = manager.deleteCustUser(ids);
		 
		if(!isS){
		 JOptionPane.showMessageDialog(null, "고객정보 삭제 실패");
		}
	}
	
	response.sendRedirect("custusercontrol.jsp?command=list");
}
%>

</body>
</html>