<%@page import="mem.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bbswrite.jsp</title>
<style type="text/css">
.center{
	margin:auto;
	width: 60%;
	border: 3px solid #8ac007;
	padding: 10px; 
}
</style>
</head>
<body>

<%
Object ologin = session.getAttribute("login");

MemberDto mem = (MemberDto)ologin;
%>

<a href="Logout.jsp">로그아웃</a>

<h1>글쓰기</h1>

<div class="center">
<form action="bbswriteAf.jsp">
<table border="1">
<col width="200"><col width="700">
<tr>
	<td>아이디</td>
	<td><input style="width: 99%;" type="text" name="id" readonly="readonly"  value="<%=mem.getId() %>"></td>
</tr>
<tr>
	<td>제목</td>
	<td> <input style="width: 99%" type="text" name="title" width="100%"></td>
</tr>
<tr>
	<td>내용</td>
	<td> <textarea style="width: 99%" rows="10" cols="20" name="content"></textarea></td>
</tr>
<tr>
	<td><button style="width: 100%" type="submit">글개시</button></td>
</tr>
</table>
</form>
</div>

</body>
</html>