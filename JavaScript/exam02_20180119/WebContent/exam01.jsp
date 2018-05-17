<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>문제</h1>
<br><br>
한국에서 제일 높은 산은? &nbsp; 
<button onclick="answer()">해답</button>
 
 <p id="answer"></p>
 
<script type="text/javascript">
function answer() {
	var answerStr = "백두산";
	document.getElementById("answer").innerHTML = answerStr;

}
</script>
</html>