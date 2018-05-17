<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
<title>상세보기</title>
</head>

<body>

<h1>상세글보기</h1>

<div>	

<table border="1">
<col width="200"/>
<col width="500"/>
<tr>
	<td>작성자</td>
	<td>${bbs.id}</td>
</tr>
<tr>
	<td>제목</td>
	<td>${bbs.title}</td>
</tr>	
<tr>
	<td>작성일</td>
	<td>${bbs.wdate}</td>
</tr>
<tr>
	<td>조회수</td>
	<td>${bbs.readcount}</td>
</tr>
<tr>
	<td>정보</td>
	<td>${bbs.ref}-${bbs.step}-${bbs.depth}</td>
</tr>
<tr>
	<td>내용</td>
	<td><textarea rows="10" cols="50" name='content'>${bbs.content}</textarea></td>
</tr>	
					
</table>
<form action="answer.do" method="post">

<input type="hidden" name='seq' value="${bbs.seq}"/>
<input type="submit" value="답글"/>

</form>


<c:if test="${bbs.id eq login.id}">
<form action="bbsupdate.do" method="post">

<input type="hidden" name='seq' value="${bbs.seq}"/>
<input type="submit" value="수정"/>

</form>
</c:if>


</div>

</body>
</html> 