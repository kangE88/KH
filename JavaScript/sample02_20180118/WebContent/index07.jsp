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

<button onclick="myFunc()">button</button>

<script type="text/javascript">

function myFunc() {
	document.getElementById("demo").innerHTML = 
		//Math.round(4.4); //반올림
		//Math.round(Math.random() * 10);
		Math.min(1, 7, 5, 6, 3, 2); //
		Math.max(1, 7, 5, 6, 3, 2);
		Math.ceil(4.1); //올림
		Math.floor(4.9);//내림
		Math.E; //Euler
		Math.PI;
		Math.SQRT2;
}

</script>

</body>
</html>