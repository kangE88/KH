<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p id="demo"></p>
<br><br>

<input type="text" id="id" size="10" value="">
<br><br>

<button type="button" onclick="myFunc()">qq</button>

<p id="p1">P1 tag</p>

<script type="text/javascript">
function myFunc() {
	//일반 Tag p h1 ~ h6 pre
	var pTag = document.getElementById("demo").innerHTML;
	
	//textfield, textArea
	var textfield = document.getElementById("id").value;
	
	document.getElementById("p1").innerHTML = textfield;
	
	document.getElementById("id").value = "문자열이 변경되었습니다.";
	
	
}
</script>

</body>
</html>