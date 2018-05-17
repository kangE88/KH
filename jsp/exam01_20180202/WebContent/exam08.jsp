<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Session</h3>
(방문횟수 체크용으로 사용가능)

<%
int i;

if(session.getAttribute("count") != null){
	i = ((Integer)session.getAttribute("count")).intValue();
}else{
	i = 0;
}
i++;
%>

Count:<%=i %>

<%
session.setAttribute("count", new Integer(i));
%>

</body>
</html>