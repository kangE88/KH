<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="my.js"></script>
</head>
<body>

<p id="demo">여기가 p태그입니다.</p>

<!-- <button type="button" onclick="documnet.write(15+26)">버튼</button> -->

<button type="button" onclick="myFunc()">버튼</button>

<script type="text/javascript">
function myFunc() {
	alert("myFunc()");
	document.getElementById("demo").innerHTML = "Hello JSP";
	
	//document.write(23+56);
}
</script>

</body>
</html>