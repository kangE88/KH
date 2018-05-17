<%@page import="sample06_20180205.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

//memberDTO memdto = (memberDTO)session.getAttribute("mem");
//memberDTO memdto = (memberDTO)application.getAttribute("mem");
memberDTO memdto = (memberDTO)request.getAttribute("mem");

out.println(memdto.toString());

%>
</body>
</html>