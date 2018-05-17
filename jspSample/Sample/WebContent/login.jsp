<%@page import="mem.MemberDto"%>
<%@page import="mem.MemberDao"%>
<%@page import="mem.iMemberDao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

iMemberDao dao = MemberDao.getInstance();

MemberDto mem = dao.login(new MemberDto(id, pwd, "", "", 0));
%>
<%
if(mem != null && !mem.getId().equals("")){
	session.setAttribute("login", mem);
	session.setMaxInactiveInterval(30*60);
%>
	<script type="text/javascript">
	alert("안녕하세요!");
	location.href="bbslist.jsp";
	</script>
<%
}else{
%>
	<script type="text/javascript">
	alert("아이디 또는 패스워드를 확인해주세요.");
	location.href="index.jsp";
	</script>
<%
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
</head>
<body>

</body>
</html>