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

<p>p tag</p>

<p id="test">p tag id=test</p>

<p class="cls">p tag class=cls</p>

<ul id="list">
	<li>커피
		<ul>
			<li>블랙</li>
			<li>밀크</li>
		</ul>
	</li>
	<li>홍차</li>
	<li>우유</li>
</ul>

<button type="button" name="button" id="btn">button</button>

<script type="text/javascript">
/* 
$(function() {
	$('p').click(function() {
		console.log($(this).text());
	});
});
 */

 $(document).ready(function() {
	$("button").click(function() {
		//alert("클릭");
		//$('p').hide();
		//$('*').hide();
		//$('p#test').hide();
		//$('p.cls').hide();
		//$('#list').hide();
		//$('ul li:first').hide(); //list 첫번째 요소 삭제 (커피-블랙-밀크)
		$('ul ul li:first').hide(); //list 첫번째 요소중 첫번째 리스트 삭제 (블랙)
	});
});
 
</script>

</body>
</html>