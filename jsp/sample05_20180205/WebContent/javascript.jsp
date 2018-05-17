<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String addr="광주시";
%>

<input type="text" id="id">
<input type="text" id="age">

<button onclick="myFunc()">전송</button>

<script type="text/javascript">

var str="<%=addr %>";

function myFunc() {
	//alert(document.getElementById("id").value));
	//alert(str);
	
	var age = document.getElementById("age").value;
	
	//location.href="NewFile.jsp?age=" + age + "&addr=" + str; 
	
	location.href="NewFile.jsp?age=" + age + "&addr=" + "<%=addr%>"; 
}
</script>

</body>
</html>