<%@page import="java.util.Date"%>
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
	Date date = new Date();
	int time = date.getHours();
	
	out.println("현재는 " + time + "시 입니다.");
	
	if(time < 9 && time <= 11){
		System.out.println("1");
		out.println("<br>좋은아침");		
	}else if(time <= 12 && time <= 13){
		System.out.println("2");
		out.println("<br>점심머겅");
	}else if(time < 22){
		out.println("<br>잘자");
	}

%>

</body>
</html>