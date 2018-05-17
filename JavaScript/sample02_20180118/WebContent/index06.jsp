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

<script type="text/javascript">
	/* 
	var d = new Date();
	d = new Date(00, 5, 24, 11, 33,  20, 0);
				//연도, 월, 일, 시, 분, 초, 밀리세컨초
	document.getElementById("demo").innerHTML = d;
	*/
	/* 
	var d = new Date("October 12,2018 12:32:33");
	document.getElementById("demo").innerHTML = d;
	*/
	 
	var d = new Date();
	document.getElementById("demo").innerHTML = d.getDay(); // 요일
	document.getElementById("demo").innerHTML = d.getFullYear(); // 연도
	document.getElementById("demo").innerHTML = d.getMonth() + 1; // 달
	document.getElementById("demo").innerHTML = d.getDate(); // 일
	document.getElementById("demo").innerHTML = d.getHours(); // 시
	document.getElementById("demo").innerHTML = d.getSeconds(); //초
	
	 
</script>




</body>
</html>