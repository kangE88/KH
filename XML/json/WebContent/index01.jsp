<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
JSON == 데이터, 셋팅x
JavaScript Object Notation
자바스크립트를 객체형식의 자료로 표현한것
한쌍(pair) key:value
Ajax : xml, json
 -->
 
<p id="demo"></p>

<script type="text/javascript">

/* 
var emp = [1, 2, 3];
var emp = [{1, 2}, {3, 4}]; 
*/

var emp = [
	{		//key  : value
		"firstname":"길동",
		"lastname":"홍"
	},
	{		//key  : value
		"firstname":"지매",
		"lastname":"일"
	},
	{		//key  : value
		"firstname":"수동",
		"lastname":"정"
	}
];

document.getElementById("demo").innerHTML 
	= emp[0].firstname + " " + emp[0].lastname;
	= emp[0]["firstname"]+ " " + emp[0]["lastname"]; //윗줄과 같은 내용

//alert(emp.length);

var txt = "";
for(i = 0;i<emp.length; i++){
	txt += emp[i].firstname+" "+emp[i].lastname + "<br>";
}
document.getElementById("demo").innerHTML = txt;

</script>
</body>
</html>