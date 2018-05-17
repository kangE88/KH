<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Java Server Page(웹서버 페이지) Server + Client

<%
	String[] interest = request.getParameterValues("interest");
	
	for(int i=0;i<interest.length;i++){
		out.println("interest["+i+"] ="+interest[i]);
	}

%>

</body>
</html>