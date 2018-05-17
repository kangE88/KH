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

<!-- Element(요소) 태그, 데이터 
	추가, 삭제 
	
	append
	prepend	
	
-->

<p>Insert</p>
<p>title here</p>

<button id="btn1">추가 텍스트</button>
<button id="btn2">추가텍스트</button>


<ol>
	<li>항목1</li>
	<li>항목2</li>
	<li>항목3</li>
</ol>

<script type="text/javascript">

//태그 뒤에 추가
$("#btn1").click(function() {
	//$("p").append("<br><b>add text</b>");
	$("ol").append("<li>add text</li>");
});
//태그 앞에 추가
$("#btn2").click(function() {
	//$("p").prepend("<b> pre add text</b><br>");
	$("ol").prepend("<li>add text</li>");
});

</script>

</body>
</html>