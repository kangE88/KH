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
	<input type="checkbox" id="ch1" name="ch1" onclick="myfunc(0)">아이템1<br>
	<input type="checkbox" id="ch2" name="ch2" onclick="myfunc(1)">아이템2<br>
	<input type="text" name="test2" value="hello">
</form>

<p id="demo"></p>

<script type="text/javascript">
//document 는 모든 html코드를 가져온다.
// . 이후는 하위 태그들에 속성값을 가져올때 사용
function myfunc( n ) {
	if(document.form1.elements[n].checked == true){
		alert(n+" Check!");
	}else{
		alert(n+" Check Uncheck");
	}
	
//////////////////////////////////////////////////////////
var name = document.getElementsByName("test2");
document.getElementById("demo").innerHTML = name[0].value;
	
}
</script>

</body>
</html>