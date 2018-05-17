<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>2개의 주사위</h1>
버튼을 클릭하면 2개의 주사위가 랜덤됩니다.<br><br>
<img src="./images/sai_1.gif" id="img1">
<img src="./images/sai_6.gif" id="img2">

<br><br>

<button onclick="random()">shk!! shk!!</button>

<script type="text/javascript">
function random() {
	var random1 = parseInt((Math.random() * 6) + 1);
	var random2 = parseInt((Math.random() * 6) + 1);
	
	var img1 = document.getElementById("img1");
	var img2 = document.getElementById("img2");
	
	img1.src = "./images/sai_"+random1+".gif";
	img2.src = "./images/sai_"+random2+".gif";
	
	/*
		
	*/
}
//Math.round(Math.random() * 10);
</script>
</body>
</html>