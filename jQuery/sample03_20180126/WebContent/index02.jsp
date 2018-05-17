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

<img alt="" src="./image/b_pic01.jpg" width="150" height="120">

<button id="btn1">insert before</button>
<button id="btn2">insert after</button>

<script type="text/javascript">
$(document).ready(function () {
	$("#btn1").click(function () {
		$("img").before("<b>before</b><br>");
	});
	$("#btn2").click(function () {
		$("img").after("<br><b>after</b>");
	});
});
</script>

<br><br>

<div id="div1" style="height: 100px; width: 500px; border: 1px solid black; background-color: yellow;">
	여기가 div1 태그입니다.

<p id="pid">1월 ㅇㄴ금수령ㄴㅇㄻㄻ</p>

<p class="pcls">30년만에 처음으로 ㅁㄴㅇㄻㄴㅇㄹ</p>
</div>

<button id="btn3">remove</button>

<script type="text/javascript">
$(function () {
	$("#btn3").click(function () {
		//$("#div1").remove(); //div 전체삭제
		//$("#div1").empty();  //div안 태그 삭제
		//$(".pcls").remove();   //pcls 요소 삭제
		$("p").remove("#pid, .pcls"); //pcls, pid 요소 삭제 (복수)
	});
})
</script>



</body>
</html>