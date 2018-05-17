<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p id ="demo"></p>

<p onclick="_func(33)">클릭하세요</p>

<button type="button" onclick="_func(22)">button</button>

<script type="text/javascript">
function myFunc(a, b) {
	return a * b;
}

document.getElementById("demo").innerHTML = myFunc(4, 3);

function _func(num) {
	document.getElementById("demo").innerHTML = num * 2;
}
</script>
</body>
</html>