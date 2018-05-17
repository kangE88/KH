<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

10진수<br>
<input type="text" id="text"><br><br>
<!-- 2 -->
변환된 2진수<br>
<input type="text" id="2text"><br><br>
<!-- 8 -->
변환된 8진수<br> 
<input type="text" id="8text"><br><br>
<!-- 16 -->
변환된 16진수<br>
<input type="text" id="16text"><br><br>

<button onclick="change()">버튼</button>

<!-- <p id="p1"></p> -->

<script type="text/javascript">
function change() {
	var num = parseInt(document.getElementById("text").value);
	
	document.getElementById("2text").value = num.toString(2);
	document.getElementById("8text").value = num.toString(8);
	document.getElementById("16text").value = num.toString(16);
}
</script>

</body>
</html>