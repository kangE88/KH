<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="./images/m_nature01.jpg" id="1" onmouseover="hover(1)" onmouseout="out(1)">
<img src="./images/m_nature02.jpg" id="2" onmouseover="hover(2)" onmouseout="out(2)">
<img src="./images/m_nature03.jpg" id="3" onmouseover="hover(3)" onmouseout="out(3)">
<img src="./images/m_nature04.jpg" id="4" onmouseover="hover(4)" onmouseout="out(4)">
<img src="./images/m_nature05.jpg" id="5" onmouseover="hover(5)" onmouseout="out(5)">
<img src="./images/m_nature06.jpg" id="6" onmouseover="hover(6)" onmouseout="out(6)">

<script type="text/javascript">
function hover(n) {
	document.getElementById(n).src = "./images/nature0"+n+".jpg"	
}
function out(n) {
	document.getElementById(n).src = "./images/m_nature0"+n+".jpg"
}
	
</script>
</body>
</html>