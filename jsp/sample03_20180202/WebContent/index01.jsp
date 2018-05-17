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

//내장객체: 동적할당 하지않고 사용할 수 있는 Object = 암사객체
request.setCharacterEncoding("utf-8");

String name = request.getParameter("name");

System.out.println("name== "+ name);

String num = request.getParameter("num");

System.out.println("num== "+ num);


//웹에 입력한 Param값 가져오기
String[] strArr = request.getParameterValues("hobby");

for(int i=0;i<strArr.length;i++){
	out.println(strArr[i] + "<br>");
}

%>

</body>
</html>