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
// String -> int, double
document.getElementById("demo").innerHTML = 
	parseFloat("10") + "<br>" +
	parseFloat("10.33") + "<br>" +
	parseFloat("10 6") + "<br>" +
	parseFloat("10 abc") + "<br>" +
	parseFloat("abc 10") + "<br>"
	

//int -> String
var number = 123;
number = number.toString()+1;
alert(number);

</script>

</body>
</html>