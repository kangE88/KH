<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#ff0000">

<h2>여기는 index02 입니다.</h2>

<form>
	<input type="button" value="이전으로 돌아가기" onclick="history.back()">
	<input type="button" value="갱신" onclick="history.reload()">
	<input type="button" value="진행" onclick="history.forward()">
	<input type="button" value="Top페이지로" onclick="location.href='index01.jsp'">
</form>

<a href="index03.jsp">jsp3 로 이동</a>

<!-- 
<script type="text/javascript">
location.href = "index01.jsp";
</script>
 -->
</body>
</html>