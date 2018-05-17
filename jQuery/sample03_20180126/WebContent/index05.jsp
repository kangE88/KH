<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#box{
	width: 100%;
	display: black;
}
#box p{
	display: inline-black;
}
</style>
</head>
<body>
<!-- 이미지 크기 변경 -->
<div id="q01">
	<img alt="" src="./image/b_pic01.jpg">
</div>

<script type="text/javascript">
$(function () {
	$(window).resize(function () {
		//alert("window resize");
		$("#q01 img").css({"width":"100", "height":"50"});
	});
});
</script>

<ul class="list">
	<li>커피</li>
	<li>홍차</li>
	<li>우유</li>
	<li>쥬스</li>
	<li>녹차</li>
</ul>

<p id="q02"></p>
<p id="q03"></p>

<ul class="applist">
	<li>오늘의 차</li> <!-- 커피 홍차 우유 -->

</ul>


<script type="text/javascript">
$(function () {
	var len = $("ul.list").children().length;
	$("#q02").text("ul count " + len );
	
	$("ul.list").children().click(function () {
		var choice = $("ul.list").children().index(this);
		$("#q03").text("선택한 요소는" +choice+"입니다.");	
	});
	
/* 	$("ul.applist").children().click(function () {
		$("ul.applist").append("<ul><li>coffee</li></ul>");
		$("ul.applist").append("<ul><li>tea</li></ul>");
		$("ul.applist").append("<ul><li>milk</li></ul>");
	}); */
	
	var menu= new Array("coffee", "tea", "milk");
	for(i=0;i<menu.length;i++){
		$("ul.applist").append("<li>"+menu[i]+"</li>");
	}
	
	
});
</script>

</body>
</html>