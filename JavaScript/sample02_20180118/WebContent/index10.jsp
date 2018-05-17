<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="form1">
전화하는 시간은
<input type="text" size="10" name="formSec">
입니다.
<br>
전화요금은
<input type="text" size="10" name="formWon">
입니다.
</form>

<button onclick="document.bgColor='#ffff00'">버튼</button>

<script type="text/javascript">
var myCnt = 1;

function func() {
	document.form1.formSec.value = myCnt +"초";
	document.form1.formWon.value = ((Math.floor(myCnt/5)*10)+10) + "원";
	
	myCnt = myCnt + 1;
}

setInterval("func()", 1000);
</script>

</body>
</html>