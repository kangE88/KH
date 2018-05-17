<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% // scriptlet		request(요청) response(응답)

	String car = request.getParameter("car");

	String message = request.getParameter("msg");
	
	System.out.println("message = "+message);

%>

선택자동차 : <%=car %>
</body>
</html>