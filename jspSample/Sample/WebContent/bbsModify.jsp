<%@page import="bbs.BbsDao"%>
<%@page import="bbs.iBbsDao"%>
<%@page import="bbs.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bbsModify.jsp</title>

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

<h1> 글 수정</h1>

<%
request.setCharacterEncoding("utf-8");

String sseq = request.getParameter("seq");
int seq = Integer.parseInt(sseq.trim());

iBbsDao dao = BbsDao.getInstance();

BbsDto bbs = dao.getBBS(seq); 

%>


<div class="center">
<form action="bbsModifyAf.jsp?seq=<%=bbs.getSeq() %>" method="post" style="display: inline">
<table border="2">
<col width="200"><col width="500">

<tr>
	<td>제목</td>
	<td><input type="text" name="title"> </td>
</tr>


<tr>
<td>내용</td>
<td>
<textarea rows="10" cols="50" name="content">
</textarea>
</td>
</tr>
</table>


<input type="submit" value="수정">
</form>

</div>

<a href='bbslist.jsp'>글 목록</a>


</body>
</html>