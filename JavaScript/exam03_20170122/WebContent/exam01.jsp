<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		width: 50%;
		border: 1px gray solid;
	}
	th,tr,td{
		border: 1px gray solid;
	}
</style>

</head>
<body>
<h1>배열의 연산</h1>

<table id="t1">
	<tr>
		<th bgcolor="lightgray">첨자</th>
		<th bgcolor="lightgray">a</th>
		<th bgcolor="lightgray">b</th>
		<th bgcolor="lightgray">a x b 계산</th>
	</tr>
	<tr>
		<td bgcolor="lightgray">0</td>
		<td>5</td> <!-- 1 -->
		<td>33</td><!-- 2 -->
		<td><button onclick="multiply(0)">계산결과</button></td>
	</tr>
	
	<tr>
		<td bgcolor="lightgray">1</td>
		<td>12</td><!-- 5 -->
		<td>14</td><!-- 6 -->
		<td><button onclick="multiply(1)">계산결과</button></td>
	</tr>
	
	<tr>
		<td bgcolor="lightgray">2</td>
		<td>18</td><!-- 9 -->
		<td>65</td><!-- 10 -->
		<td><button onclick="multiply(2)">계산결과</button></td>
	</tr>
</table>

<script type="text/javascript">
function multiply(n) {
	var num1 = null;
	var num2 = null;
	
	if(n==0){
		num1 = document.getElementsByTagName('td')[1].childNodes[0].nodeValue;
		num2 = document.getElementsByTagName('td')[2].childNodes[0].nodeValue;
		alert(num1 * num2);
	}else if(n==1){
		num1 = document.getElementsByTagName('td')[5].childNodes[0].nodeValue;
		num2 = document.getElementsByTagName('td')[6].childNodes[0].nodeValue;
		alert(num1 * num2);
	}else if(n==2){
		num1 = document.getElementsByTagName('td')[9].childNodes[0].nodeValue;
		num2 = document.getElementsByTagName('td')[10].childNodes[0].nodeValue;
		alert(num1 * num2);
	}
   
}
</script>
</body>
</html>