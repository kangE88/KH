<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>체육관 이용요금</h1>
기본이용료 4시간 40,800원

<form name="f1">
<input type="checkbox" onclick="sum(0)" id="ch1" value="20000">야간조명20,000
<br>
<input type="checkbox" onclick="sum(1)">배구네트 4,000
<br>
<input type="checkbox" onclick="sum(2)">배구공 5,000
<br>
<input type="text" name="result" id="t1" value="40800">
</form> 

<script type="text/javascript">
var total = Number(document.getElementById("t1").value);
var arr = new Array(2);

arr[0] = Number(document.getElementById("ch1").value);
arr[1] = 4000;
arr[2] = 5000;

function sum( n ) {
	if(document.f1.elements[n].checked == true){
		total = total + arr[n];
	}else{
		total = total - arr[n];
	}
	document.f1.elements[3].value = total;
}
</script>

</body>
</html>