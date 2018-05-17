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
var text ='{"name":"홍길동", "add":"서울", "phone":"123-4567" }';
var obj = JSON.parse(text);

document.getElementById("demo").innerHTML = obj.name + "<br>" + obj.add + "<br>" + obj.phone;
</script>

</body>
</html>