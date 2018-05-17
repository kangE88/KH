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

<h1>Life on the water</h1>

<button id="b1">form의 추가</button><br><br>
<button id="b2">form의 삭제</button><br><br>

<img src="./image/img01.jpg" class="pic">
<img src="./image/img02.jpg" class="pic"><br>
<img src="./image/img03.jpg" class="pic">
<img src="./image/img04.jpg" class="pic">

<script type="text/javascript">

$(function() {
	$('#b1').click(setFrame);
});

function setFrame() {
	$('.pic').css({"border-left":"solid 10px #00ff00",  //json == pair(key와 value로)
				   "border-top":"solid 10px #00ff00",
				   "border-right":"solid 10px #00ff00",
				   "border-bottom":"solid 20px #00ff00"
			});
}
	
</script>


</body>
</html>