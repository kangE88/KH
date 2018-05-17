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

<h1>Life on the water</h1>

<img src="./image/img01.jpg" class="pic">
<img src="./image/img02.jpg" class="pic"><br>
<img src="./image/img03.jpg" class="pic">
<img src="./image/img04.jpg" class="pic">

<script type="text/javascript">

	$('img').hover(function() {
		$(this).css("border", "solid 10px #00ffff");
	},
	function() {
		$(this).css("border", "solid 0px");
	});
/*
	$(function() {
		$('.pic').click(function() {
			$(this).css("border", "solid 5px #00ffff");
		});
	});
*/	
</script>


</body>
</html>