<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:requestEncoding value="utf-8"/>

<c:if test='${empty login}'>
<script type="text/javascript">
alert('로그인 하세요.');
location.href='login.do';
</script>
</c:if>

<h1>글쓰기</h1>
<div id="content_wrap">
<form action="bbswriteAf.do" method="post">

<table class="content_table" style="width:85%;">

<tr class="id">
	<td>아이디</td>
	<td><input type="text" name="id" readonly="readonly" 
	value='${login.id}' size="20"/></td>
</tr>
<tr>
	<td>제목</td>
	<td><input type="text" name="title" size="50"/></td>
</tr>
<tr>
	<td>내용</td>
	<td><textarea rows="10" cols="70" name='content'></textarea></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="글쓰기"/></td>
</tr>

</table>

</form>
</div>
