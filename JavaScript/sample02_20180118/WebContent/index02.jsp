<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p id="demo">나는 성공한다.</p>

<button onclick="displayDate()">버튼명</button>

<script type="text/javascript">
function displayDate() {
	document.getElementById('demo').innerHTML=Date();	
}
</script>
</body>
</html>