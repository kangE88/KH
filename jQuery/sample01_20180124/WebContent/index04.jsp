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
이름: <input type="text" name="firstname"><br><br>
이메일:<input type="text" name="email"><br>

<p>P tag</p>

<button id="hideBtn">감추기</button>
<button id="showBtn">보이기</button>
<button id="toggleBtn">감췄다보여줬다</button>

<br><br>

<div align="center">
	<div id="test"style="background-color: red; width: 50%; text-align: center;">
		div Tag
	</div>
</div>

<script type="text/javascript">
$(function() {
	$("input").focus(function() {
		$(this).css("background-color","#ffff00");	
	});
	$("input").blur(function() {
		$(this).css("background-color","#ffffff");	
	}); //input창 선택 시 배경색이 변함
	
	$("#hideBtn").click(function() {
		$('p').hide();
	});
	$("#showBtn").click(function() {
		$('p').show(1000);
	});
	$("#toggleBtn").click(function() {
		$('p').toggle(1000); //숫자기입 시 밀리는듯한 효과
	});
	
	/* 	
	$('p').click(function () {
		$(this).hide();
	}); 
	*/
	/* 
	$('p').dblclick(function () {
		$(this).hide();
	});
	*/
	/*
	$('#test').mouseenter(function() {
		alert("mouseenter 동작");
	});
	 */
	/* 
	$('#test').mouseleave(function() {
		alert("mouseleave 동작");
	});
	*/
	/*
	$('#test').mousedown(function() {
		alert("mousedown 동작");
	});
	$('#test').mouseup(function() {
		alert("mouseup 동작");
	});
	*/
	
	$('#test').hover(function() {
		alert("hover 동작");
	}); //mouseenger와 mouseleave의 2가지기능을 합쳐놓은기능
});
</script>
</body>
</html>