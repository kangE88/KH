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
var length = 16;		//number
var name = "World"; //String

//Array
var cars = ["Saab","Volvo","BMW"];
alert("cars = "+cars[1]);

var obj = { firstname:"길동", lastname:"홍", age:24};

var y = 123e5;
var z = 123e-3;
alert(z);

document.getElementById("demo").innerHTML = 
	typeof "홍길동" + "<br>"+
	typeof 352 + "<br>"+
	typeof 3.141592 + "<br>"+
	typeof true + "<br>"+
	typeof [1, 2, 3, 4] + "<br>"+
	typeof {num:24, name:"aaa"} + "<br>";
</script>

</body>
</html>