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
<h1>TOPIC</h1>

<p class="cls1">2015/02/15<br>2015시즌 1차전의 결과를 공개했다.</p>
<p class="cls2">2015/01/10<br>2015시즌 최종전의 결과를 공개했다.</p>
<p class="cls3">2014/12/20<br>2014시즌 연간 일정을 발표했다.<br>다음 시즌은 10개 지역에서 총 12경기를 예정.</p>
<p class="cls4">2014/12/15<br>2014시즌 10차전의 결과를 공개했다.</p>

<script type="text/javascript">
	$('p').mouseover(function() {
		$(this).css("background-color","#ffff00");
	});
	$('p').mouseleave(function() {
		$(this).css("background-color","#ffffff");
	});
	$('p').dblclick(function() {
		$(this).fadeOut(1000);
	});
	$('h1').dblclick(function() {
		$('p').fadeIn(1000);
	});
	
	
	
	
</script>

</body>
</html>