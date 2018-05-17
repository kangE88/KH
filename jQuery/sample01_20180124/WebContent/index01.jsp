<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
<!-- <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script> -->
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 
	JavaScript : client 언어 webServer와는 관계하지 않는다.
	css : clent, 디자인
	jQuery : JavaScript 를 경량화 시켜놓은것. 간략화 시켜놓음. Ajax 호출, DOM 조작
	head 태그에 <script src="./jQuery/jquery.min.js"></script> 파일 호출해야 함.
 -->

<p>P tag</p>
<p id="demo">demo P tag</p>
<p class="demo">P tag className demo</p>

<h1 class="cls">h1 tag className cls</h1>

<pre>
입력:<input type="text" id="id" value="abc">
<button type="button" id="btn" onclick="myfunc()">button</button>
</pre>

<script type="text/javascript">

$(function(){
	alert("jQuery 실행"); //메세지띄우기
	
	//$("p").hide();
	//$("p#demo").hide(); //p태그 id demo 값 감추기
	//$("#demo").hide(); // id 중복해서 사용을 안함.
	//$(".cls").hide(); // class는 중복해서 사용한다.
	//$("#id").hide();
	
	//alert($("#demo").text()); //demo id에 있는 내용 가져오기_일반태그
	//alert($("#id").val()); // textfield, textarea
	
/* 	$("#btn").click(function(){
		$("#demo").text("클릭되었습니다.");
	}); */
	
 	$("#btn").click(function(){
		$("#demo").text($("#id").val());
	}); 
	
});

/* function myfunc() {
	var text = document.getElementById("demo").innerHTML;
	document.getElementById("demo").innerHTML = "<b>Hello</b>";
	
	var _text = document.getElementById("id").value;
	document.getElementById("id").value = "<b>Hello</b>";
} */
</script>


</body>
</html>