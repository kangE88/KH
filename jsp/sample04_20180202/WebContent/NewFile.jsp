<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>NewFile.jsp</h1>

<%
//session.invalidate();
String myStr = (String)request.getAttribute("myStr");
String requestStr = (String)request.getSession().getAttribute("myStr");
String sessionMyStr = (String)session.getAttribute("myStr");


%>

request 받은 객체 : <%=myStr%><br>
session 받은 객체 : <%=sessionMyStr%><br>
requestStr 받은 객체 : <%=requestStr %>

</body>
</html>