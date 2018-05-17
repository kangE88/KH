<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>redirection 설정</h1>

<form action="hello" method="post">
<table>
	<tr>
		<td>Redirect set</td>
		<td>
			<select name="url" size="2">
				<option value="naver">naver</option>
				<option value="google">google</option>
			</select>
		</td>
	</tr>
</table>

<input type="submit" value="send">

</form>

</body>
</html>