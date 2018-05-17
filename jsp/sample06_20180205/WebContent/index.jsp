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
memberDTO dto = new memberDTO(1,"suk");

/*
	session 을 사용			ok
	application 을 사용		ok
	request 를 사용			no
*/

//session.setAttribute("mem", dto);
//application.setAttribute("mem", dto);
request.setAttribute("mem", dto); //request는 pageContext.forward를 사용해야한다.

response.sendRedirect("NewFile.jsp");
//pageContext.forward("NewFile.jsp"); //제일 가벼운처리
// forward request 전송가능
%>

</body>
</html>