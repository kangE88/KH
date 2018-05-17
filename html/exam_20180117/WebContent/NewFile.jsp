<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>설문조사 확인 페이지</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String anser = request.getParameter("anser");
	String[] anser2array = request.getParameterValues("anser2");
	String anser2 ="";
	for(int i=0;i<anser2array.length;i++){
		anser2 = anser2+anser2array[i]+", ";
	}
	
	String anser3 = request.getParameter("anser3");
	String anser4 = request.getParameter("anser4");
	
%>
이름 : <%=name %><br>
영어로 대화 유무 : <%=anser %><br>
다른 관심있는 언어 : <%=anser2 %><br>
영어수업 의견 : <%=anser3 %><br>
연령: <%=anser4 %><br>


</body>
</html>