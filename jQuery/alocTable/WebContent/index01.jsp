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

<h1>동적 케이블</h1>

<table border="1" id="list_table">

<colgroup>
	<col style="width:70px">
	<col style="width:200px">
	<col style="width:300px">
	<col style="width:200px">
</colgroup>

<thead>
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>생년월일</th>
		<th>Action</th>
	</tr>
</thead>
<tbody>
	<tr>
		<td>1</td>
		<td>홍길동</td>
		<td>2010/11/11</td>
		<td><a href="#" class="delete-link">삭제</a></td>
	</tr>
	
	<tr>
		<td>2</td>
		<td>일지매</td>
		<td>2010/12/11</td>
		<td><a href="#" class="delete-link">삭제</a></td>
	</tr>
	<tr>
		<td>3</td>
		<td>꺽정</td>
		<td>2010/01/11</td>
		<td><a href="#" class="delete-link">삭제</a></td>
	</tr>
	
	
</tbody>

</table>


<h3>추가 입력 테이블</h3>

<table border="1" id="append_table">
<colgroup>
	<col style="width:70px">
	<col style="width:200px">
	<col style="width:300px">
	<col style="width:200px">
</colgroup>

<thead>
	<tr>
		<th><label for="add_no">번호</label></th>
		<th>이름</th>
		<th>생년월일</th>
		<th>Action</th>
	</tr>
</thead>

<tbody>
	<tr>
		<td><input type="text" id="add_no"></td>
		<td><input type="text" id="add_name"></td>
		<td><input type="text" id="add_birth"></td>
		<td><button type="button" id="append_row">데이터 추가</button></td>
	</tr>
</tbody>

</table>

<script type="text/javascript">
//추가
$("#append_row").on("click", function () {
	$("#list_table").append(
		$("<tr>").append(
			$("<td>").append($("#add_no").val()),
			$("<td>").append($("#add_name").val()),
			$("<td>").append($("#add_birth").val()),
			$("<td>").append($("<a>").prop("href", "#").addClass("delete-link").append("삭제"))
		)
	)
});


$("#list_table").on("click", ".delete-link", function () {
	$(this).parent().parent().remove();
});
</script>

</body>
</html>