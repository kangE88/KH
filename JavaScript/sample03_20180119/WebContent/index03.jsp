<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">

<h1>여기는 index3입니다.</h1>

<form name="myForm">
	<input type="text" size="30" name="myFormMsg">
</form>

<script type="text/javascript">
myMsg = "환영합니다 어서오십시오";
myCnt = 0;

function myFunc() {
	document.myForm.myFormMsg.value = myMsg.substring(0, myCnt) + "_";
	
	myCnt = ( myCnt == myMsg.length ) ? 0 : myCnt+1;
}

setInterval("myFunc()", 500);

</script>

</body>
</html>