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

<button onclick="myFunc()">click</button>

<script type="text/javascript">
function myFunc(){
	var number = 123;
	document.getElementById("demo").innerHTML = 
		"123 = " + number + "Decimal <br>" +
				   number.toString(16) + " Hexadecimal<br>" +
				   number.toString(8) + " Octal<br>" +
				   number.toString(2) + " Binary";
}
</script>

</body>
</html>