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
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

String hobby[] = request.getParameterValues("hobby");

String age = request.getParameter("age");

String desc = request.getParameter("desc");

out.println("id=="+id);
out.println("pwd=="+pwd);

for(int i=0;i<hobby.length;i++){
	out.println("hobby["+i+"] = "+hobby[i]);
}

out.println("age=="+age);

out.println("desc=="+desc);

%>


</body>
</html>