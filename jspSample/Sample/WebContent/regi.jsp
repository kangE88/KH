<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원 등록</h1>
<p>환영합니다.</p>

<div class="center">
<form action="regiAf.jsp">

<table border="1">

<tr>
	<td>아이디</td>
	<td>
		<input type="text" name="id" size="20">
	</td>
</tr>

<tr>
	<td>패스워드</td>
	<td>
		<input type="password" name="pwd" size="20">
	</td>
</tr>

<tr>
	<td>이름</td>
	<td>
		<input type="text" name="name" size="20">
	</td>
</tr>

<tr>
	<td>이메일</td>
	<td>
		<input type="text" name="email" size="20">
	</td>
</tr>

<tr>
	<td colspan="2" align="center">
		<input type="submit" value="회원가입">
	</td>
</tr>

</table>

</form>
</div>

<a href="index.jsp">Home</a>

</body>
</html>