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

<!-- DOM Document Objdec Model -->

<!-- 
JavaScript : innerHTML, value

jQuery : text(), val(), html(), attr() - 속성
 -->

<p id="test">Insert <b>title</b> here</p>

<button id="btn1">show Text</button>
<button id="btn2">show Html</button>

<br><br>

<input type="text" id="id" value="홍길동">
<button id="btn3">show value</button>

<br><br>

<p>
	<a href="http://www.never.com" id="naver">네이버</a>
	<button id="btn4">attribute(속성)</button>
</p>

<script type="text/javascript">
$(function() {
	//text값을 가져올때
	$("#btn1").click(function() {
		alert("Text:" +$("#test").text() );
	});
	//html 태그 까지 전부다 가져올때
	$("#btn2").click(function() {
		alert("Text:"+$("#test").html() );
	});
	//input태그에서 값을 가져올때
	$("#btn3").click(function() {
		alert("Text:"+$("#id").val() );
	});
	//
	$("#btn4").click(function() {
		alert("Attr:"+$("#naver").attr("href") );
	});
});
</script>

</body>
</html>