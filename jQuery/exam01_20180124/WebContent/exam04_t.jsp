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

<h1>요금</h1>
<table border="1">
	<tr>
		<th>유형</th>
		<th>정원</th>
		<th>화장실</th>
		<th>목욕탕</th>
		<th>1박요금</th>
	</tr>
	<tr>
		<td>Atype</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
		<tr>
		<td>Btype</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
		<tr>
		<td>Ctype</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
		<tr>
		<td>Dtype</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
		<tr>
		<td>Etype</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
		<tr>
		<td>Ftype</td>
		<td>15명</td>
		<td>유</td>
		<td>유</td>
		<td>28,000원</td>
	</tr>
	
</table>

<script type="text/javascript">
$(function() {
	$('tr:even').css("background-color", "#cccc99"); //tr태그 한칸 건너 뛰어 적용
})
</script>

</body>
</html>