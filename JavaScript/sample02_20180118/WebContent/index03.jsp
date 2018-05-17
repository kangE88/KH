<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p id="demo"></p>

<p id="p1">골프는 스코틀랜드에서 유래된 종목이라고 추정되는데요~~~~~~</p>

<script type="text/javascript">
	var str = document.getElementById("p1").innerHTML;

	//var pos = str.indexOf("스코틀");		//위치에 대한 숫자값
	//var pos = str.lastIndexOf("종목");	//
	//var pos = str.search("골프는");
	//var pos = str.slice(4,9);
	//var pos = str.substring(4,9);
	//var pos = str.charAt(1);
	
	str = "a,b,c,d,e";
	var arr = str.split(",");
	var pos = arr[1];
	
	document.getElementById("demo").innerHTML = pos;

</script>


</body>
</html>