<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>변수의 연산</h1>

a=
<input type="text" id="a_text" name="a_text"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
b=
<input type="text" id="b_text" name="b_text">

<button onclick="operation('+')">덧셈</button>
<button onclick="operation('-')">뺄셈</button>
<button onclick="operation('*')" id="*">곱셈</button>
<button onclick="operation('/')" id="/">나눗셈</button>
<button onclick="operation('%')" id="%">나머지</button>

<p id="result"></p>


<script type="text/javascript">
function operation(n) {
	var a = parseInt(document.getElementById("a_text").value);
	var b = parseInt(document.getElementById("b_text").value);


	if(n=='+'){
		document.getElementById("result").innerHTML = a + b;
	}else if(n=='-'){
		document.getElementById("result").innerHTML = a - b;
	}else if(n=='*'){
		document.getElementById("result").innerHTML = a * b;
	}else if(n=='/'){
		if(a==0||b==0){
			document.getElementById("result").innerHTML ="0말고 입력해";
		}else{
			document.getElementById("result").innerHTML = a / b;
		}
	}else if(n=='%'){
		if(a==0||b==0){
			document.getElementById("result").innerHTML ="0말고 입력해";
		}else{
			document.getElementById("result").innerHTML = a % b;
		}
	}
	
	
}
</script>

</body>
</html>