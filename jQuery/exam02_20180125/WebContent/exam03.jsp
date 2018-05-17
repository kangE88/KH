<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>photo</h1>
<div class="pic">
	<img alt="성 자비에르 성당(외관)" src="image/img01.jpg">
	<img alt="성 자비에르 성당(내관)" src="image/img02.jpg">
	<img alt="은행" src="image/img03.jpg">
	<img alt="가로등" src="image/img04.jpg">
</div>

<script type="text/javascript">
var a;
$(function () {
	$("img").click(function () {
		a = $(this).attr("alt");
		alert(a);
	});
});
</script>

</body>
</html>