<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="form1">
<h1>환영합니다.</h1>

※현재시각은 <input type="text" size="20" name="txt1">입니다.

</form>
<script type="text/javascript">


function time() {
	var now = new Date();
	var hours = now.getHours();
	var minutes = now.getMinutes();
	var seconds = now.getSeconds();
	
	document.form1.txt1.value = hours+"시 "+ minutes+" 분 "+seconds +"초";
}

setInterval("time()", 1000);

</script>
</body>
</html>