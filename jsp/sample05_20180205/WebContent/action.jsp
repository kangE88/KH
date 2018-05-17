<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--

페이지 전환


--tag
case1:
<form action="">
</form>

case2:
<a href

case3:
localhost:8090/sam/action.jsp?age=12&addr=seoul //parameter로 넘겨주는 방식
xxx.xxx.xxx.xxx


--java script 
location.href="action.jsp?age=" +age +"&addr=seoul";

--java
forward
sendRedirect

--%>
<%
String addr = "서울시";
%>

<form action="NewFile.jsp" method="get">
	<input type="text" name="age" value="10">
	<input type="text" name="addr" value=<%=addr %>>
	<input type="submit" value="send">
</form>

</body>
</html>