<%@page import="bbs.BbsDao"%>
<%@page import="bbs.iBbsDao"%>
<%@page import="bbs.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bbsdetail.jsp</title>

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

<h1>상세 글 보기</h1>

<%
String sseq = request.getParameter("seq");
int seq = Integer.parseInt(sseq.trim());

iBbsDao dao = BbsDao.getInstance();
// 조회수를 증가
dao.readCount(seq);
BbsDto bbs = dao.getBBS(seq); 

%>


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
<textarea rows="10" cols="50" 
name="content"><%=bbs.getContent() %>
</textarea>
</td>
</tr>
</table>

<form action="answer.jsp" method="post" style="display: inline">
<input type="hidden" name='seq' value="<%=bbs.getSeq() %>">
<input type="submit" value="답글">
</form>

<form action="bbsModify.jsp?seq=<%=bbs.getSeq() %>" method="post" style="display: inline">
<input type="submit" value="수정">
</form>

<form action="bbsDelete.jsp?seq=<%=bbs.getSeq() %>" method="post" style="display: inline">
<input type="submit" value="삭제">
</form>


</div>

<a href='bbslist.jsp'>글 목록</a>


</body>
</html>