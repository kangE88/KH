<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- ver 1.12.1 최신버전 -->
<!-- slider 를 사용하려면 각각의 버전을 최신으로 맞춰주어야함 -->
<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" type="text/css" />

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
 
<script src="http://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>JQuery UI</h1>
<h2>Slider</h2>

<img alt="" src="p1.jpg"><img alt="" src="p2.jpg"><img alt="" src="p3.jpg">

<p>
Slider의 키를 좌우로 이동시키면, 이미지의 투명도를 조정할 수 있습니다.
</p>

<div id="slider1" style="width: 250px"></div><br>

<p id="opa"></p>

<script type="text/javascript">
$(function() {
	$("#slider1").slider({
		animate : true,
		range : "min",
		value : 100,
		slide : function(event,ui){
			//console.log("move");
			$("img").css("opacity", ui.value/100);
			$("#opa").text(ui.value);
		}
	});
});
</script>

</body>
</html>