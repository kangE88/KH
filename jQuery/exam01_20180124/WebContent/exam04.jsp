<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Table</h1>

<table border="solid 1px">
	<tr id="thead">
		<th>유형</th>
		<th>정원</th>
		<th>화장실</th>
		<th>목욕탕</th>
		<th>1박요금</th>
	</tr>
	<tr>
		<td>a타입</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	<tr id="trow">
		<td id="td1">b타입</td>
		<td id="td2">15명</td>
		<td id="td3">유</td>
		<td id="td4">유</td>
		<td id="td5">28,000원</td>
	</tr>
	<tr>
		<td>c타입</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
	<tr id="trow">
		<td>d타입</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
		<tr>
		<td>e타입</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
	<tr id="trow">
		<td>f타입</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
</table>

<script type="text/javascript">
	$('#thead').click(function() {
		$('#thead').css("background-color","lightgray");
	});
	$('#trow').click(function() {
		$('#trow td').css("background-color","lightgray");
	});
	

</script>
</body>
</html>