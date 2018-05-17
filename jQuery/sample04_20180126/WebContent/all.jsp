<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.aaa{
	color: #f00;
}
.bbb{
	padding:10px;
	border: #000 2px solid;
	background-color: red;
}
.q11_a{
	text-decoration: underline; <!-- 밑줄 -->
	color: #00f;
}
#q17{
	background: #f00;
	width: 100px;
	height: 100px;
}
</style>
</head>
<body>

<button>change</button>

<p id="q01">Hello JQuery</p>
<p id="q02">JQuery Start</p>
<p id="q03">Hi Hello</p>
<p id="q04"></p>

<ul id="q05">
	<li>항목1</li>
	<li>항목2</li>
	<li>항목3</li>	
</ul>

<ul id="q06">
	<li>항목1</li>
	<li>항목2</li>
	<li>항목3</li>	
</ul>

<p id="q07">최선을 다함으로</p>

<ul id="q08">
	<li>항목1</li>	
</ul>

<p id="q09"></p>

<div class="bbb">
	<p id="q10">나는 실패를 알고 있다.</p>
</div>

<p class="q11">q11</p>

<p class="q12">
	<a href="#">q12</a>
</p>

<ul id="q13">
	<li>항목1</li>
	<li>항목2</li>
	<li>항목3</li>	
</ul>

<p class="button">click</p>

<script type="text/javascript">
$(function () {
	$("button").click(function () {
	
		// 폰트의 컬러 변경
		$("#q01").css("color","red");
		// 폰트의 컬러와 배경색 변경 (복수로 부여하고싶을때)		
		$("#q02").css({
			"color":"#00f",
			"background-color":"#ffff00"
		});
		// text값 변경
		$("#q03").text("JQuery Hello");
		// html 태그 삽입
		$("#q04").html("<a href=''#'>안녕</a>");
		// Class 삽입 (css)
		$("#q05").addClass("aaa");
		// 리스트 삭제
		$("#q06 li").remove();
		// 문자열 앞에 붙이기
		$("#q07").prepend("끝까지 ");
		// 문자열 뒤에 붙이기
		$("#q07").append("나는 할수있다.");
		// list 내용 수정 (뒤)
		$("#q08 li").before("<li>항목0</li>");
		// list 내용 수정 (앞)
		$("#q08 li").after("<li>항목2</li>");
		// 다른 태그들을 감쌀때
		$("#q09").wrap("<div class='bbb'></div>");
		// 감싸여진 태그들을 풀어낼때
		$("#q10").unwrap("div.bbb");
		// 속성을 추가할때
		$(".q11").attr("class","q11_a");
		// 속성을 추가할때
		$(".q12 a").removeAttr("href");
		//
		$("p.button").click(function () {
			$("#q13").empty();
		});
	});
});
</script>

</body>
</html>