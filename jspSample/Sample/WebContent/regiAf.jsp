<%@page import="mem.MemberDto"%>
<%@page import="mem.MemberDao"%>
<%@page import="mem.iMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String name = request.getParameter("name");
String email = request.getParameter("email");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>regiAf.jsp</title>
</head>
<body>

<%
iMemberDao dao = MemberDao.getInstance();

boolean isS = dao.addMember(new MemberDto(id, pwd, name, email, 0));

if(isS){
	%>
	<script type="text/javascript">
		alert("성공적으로 가입하셨습니다.");
		location.href = "index.jsp";
	</script>
<%	
}else{
	%>
	<script type="text/javascript">
		alert("다시 기입하십시오.");
		location.href = "regi.jsp"
	</script>
	
<%
}
%>

</body>
</html>