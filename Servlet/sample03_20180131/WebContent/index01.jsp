<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>상태 코드 선택</h1>

<form action="sample" method="get">
<table>
	<tr>
		<td>
			<select name="code" size="3" multiple="multiple">
				<option value="200">SC_OK</option>
				<option value="404">SC_NOT_FOUND</option>
				<option value="500">SC_INTERNAL_ERROR</option>
			</select>
		</td>
	</tr>
</table>
	<input type="submit" name="btn1" value="send">
</form>
</body>
</html>