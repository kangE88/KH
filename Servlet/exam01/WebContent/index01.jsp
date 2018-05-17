<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="result">
	name : <input type="text" name="name">
	age : <input type="text" name="age">
	<table>
		<tr>
			<td>Like Frults</td>
			<td>
				<select name="frults" size="3" multiple="multiple">
					<option value="apple">apple</option>
					<option value="orange">orange</option>
					<option value="pear">pear</option>
				</select>
			</td>
		</tr>
	</table>
	<input type="submit" value="send">
</form>
</body>
</html>