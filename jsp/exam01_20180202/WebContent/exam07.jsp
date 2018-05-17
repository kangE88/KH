<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%!
	int size = 0;
%>
<title>Insert title here</title>
</head>
<body>

<%
size++;
%>

<table border="1">
<%
	for(int i=0;i<size;i++){
%>
	<tr>
		<%
		for(int j=0;j<size;j++){
		%>
			<td><%=i %>*<%=j %>=<%=i*j%></td>
		<%
		}
		%>
	</tr>
	<%
	}
	%>
</table>

</body>
</html>