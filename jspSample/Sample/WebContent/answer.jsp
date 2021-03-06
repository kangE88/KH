<%@page import="bbs.BbsDao"%>
<%@page import="bbs.iBbsDao"%>
<%@page import="mem.MemberDto"%>
<%@page import="bbs.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
.center{
	margin: auto;
	width: 60%;
	border: 3px solid #8AC007;
	padding: 10px;
}
input {
	size: 50;
}
</style>

</head>
<body>
<a href="logout.jsp">로그아웃</a>
</head>
<body>

<%
String sseq = request.getParameter("seq");

int seq = Integer.parseInt(sseq.trim());

iBbsDao bbsDao = BbsDao.getInstance();

BbsDto bbs = bbsDao.getBBS(seq);

System.out.println("answer =="+bbs.toString());

%>

<h1>부모글</h1>

<div class="center">

<table border="2">
<col width="200"><col width="500">

<tr>
	<td>작성자</td>
	<td><%=bbs.getId() %> </td>
</tr>
<tr>
	<td>제목</td>
	<td><%=bbs.getTitle() %> </td>
</tr>
<tr>
	<td>작성일</td>
	<td><%=bbs.getWdate() %> </td>
</tr>
<tr>
	<td>조회수</td>
	<td><%=bbs.getReadcount() %> </td>
</tr>
<tr>
	<td>정보</td>
	<td><%=bbs.getRef()%>-<%=bbs.getStep()%>-<%=bbs.getDepth()%> </td>
</tr>

<tr>
<td>내용</td>
<td>
<textarea rows="10" cols="50" readonly="readonly"
name="content"><%=bbs.getContent() %>
</textarea>
</td>
</tr>
</table>

<hr>
<%
Object ologin = session.getAttribute("login");
MemberDto mem = (MemberDto)ologin;
%>

<h1>답글달기</h1>

<form action="answerAf.jsp" method="post">
<input type="hidden" name="seq" value="<%=bbs.getSeq()%>">

<table border="1">
<col width="200"><col width="500">

<tr>
	<td>아이디</td>
	<td><input type="text" name="id" readonly="readonly" size="50" value="<%=mem.getId() %>"></td>
</tr>

<tr>
	<td>제목</td>
	<td><input type="text" name="title" size="50"></td>
</tr>

<tr>
	<td>내용</td>
	<td><textarea rows="10" cols="50" name="content"></textarea></td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" value="답글">
	</td>
</tr>

</table>

</form>


</body>
</html>