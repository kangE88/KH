<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

변수(Variable)
<p id="demo"></p>

<script type="text/javascript">
/* var  -- int, double, string, object */
 var x = 5;
 var y = 6;
 var z = x+y;
 
 /*
 	문자, 숫자(정수, 실수), 문자열, (true/false)
 	대소문자 구분
 	double, int, char, class, struct
 	8		4	 2
 */
 
 var pi = 3.141592;
 var person ="홍길동";
 var answer = "YES | NO";
 var num = 123;
 var updown = true;
 
 var per = "일지매", _num = 234 + 3;
 alert("_num = "+_num);
 
 _num = "World";
 alert("_num = "+_num);
 
 var str = "5" + 2 + 3;
 alert("str = "+ str);
 
 document.getElementById("demo").innerHTML = str;
 
 
</script>

</body>
</html>