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
<h1>단기 x 수량 알람표</h1>
<button onclick="func()">add</button>

<table id="t1">
	<tr>
		<th>개수</th>
		<th>제품1</th>
		<th>제품2</th>
		<th>제품3</th>
	</tr>
</table>

</body>
<script type="text/javascript">
var seq = 1;
var num1 = 300;
var num2 = 450;
var num3 = 520;

function func() {
	
	var table = document.getElementById("t1");
	var rowlen = table.rows.lenth;
	var row = table.insertRow(rowlen);
	
	row.insertCell(0).innerHTML = seq;
	row.insertCell(1).innerHTML = (num1*seq)+"원";
	row.insertCell(2).innerHTML = (num2*seq)+"원";
	row.insertCell(3).innerHTML = (num3*seq)+"원";
	seq++;
}
</script>
</html>