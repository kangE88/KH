<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="style.css" type="text/css"
	media="print, projection, screen">

<script src="./jQuery/jquery.min.js"></script>
<script src="./jQuery/jquery-latest.js"></script>
<script src="./jQuery/jquery.tablesorter.js"></script>
<script src="./jQuery/jquery.tablesorter.min.js"></script>


<style type="text/css">
#sampleTable td:nth-of-type(3){
	text-alin: right;
	padding-right:0.7em;
}
#sampleTable td:nth-of-type(4){
	text-alin: right;
	padding-right:0.7em;
}
#sampleTable td:nth-of-type(5){
	text-alin: right;
	padding-right:0.7em;
}
</style>
</head>
<body>

<h1>테이블 정렬</h1>

<table id="sampleTable" class="tablesorter">
<thead>
	<tr>
		<th>이름</th>
		<th>나이</th>
		<th>주소</th>
	</tr>
</thead>

<tbody>
	<tr>
		<td>홍길동</td>
		<td>24</td>
		<td>서울</td>
	</tr>
	<tr>
		<td>일지매</td>
		<td>21</td>
		<td>경기</td>
	</tr>
	<tr>
		<td>임꺽정</td>
		<td>20</td>
		<td>부산</td>
	</tr>
</tbody>

</table>

<script type="text/javascript">
	$(function () {
		$("#sampleTable").tablesorter();
	})
</script>

</body>
</html>