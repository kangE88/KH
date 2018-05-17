<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p id="demo">나는 성공한다.</p>

<script type="text/javascript">
/*
 	함수로 특정 처리
 	Client 코드
 	화면 출력 내용 취득, 변경, 추가
 	
 	DOM(Document Object Model)
 
 	head 위에 script 작성은 항상하는것이 아님
 	body 태그에 사용하는것이 가장빠르다
 	innerHTML html코드를 얻어온다.
 */
 
//////////////////////////////////////////////////////////////////////////////////////////////////
 	function MyFunc(a, b) {
		return a* b;
	}

 	document.getElementById("demo").innerHTML = MyFunc(2, 4);
 	//document.getElementById("demo").innerHTML = MyFunc; /*함수 정의 내용이 표시된다*/
////////////////////////////////////////////////////////////////////////////////////////////////// 	
 	var x = toCelsius(40);
 	var text = "온도는 섭씨" + x + "도 입니다.";
 	
 	document.getElementById("demo").innerHTML = text;
 	
 	function toCelsius(fahrenheit) { // Celsius 섭씨 fahrenheit 화씨
		return ( 5 / 9 ) * (fahrenheit - 32);
	}
////////////////////////////////////////////////////////////////////////////////////////////////// 	
 	var arr = ["aaa", "bbb", "ccc"];
 	//arr[0] ~ arr[2]
////////////////////////////////////////////////////////////////////////////////////////////////// 	
 	var person={
 			firstname:"길동",  // key:value --> json
 			lastname:"홍",
 			id:1212,
 			fullname:function(){
 				return this.firstname + " " + this.lastname;
 			}
 	};
 	document.getElementById("demo").innerHTML = person.fullname();
 	
 	//scope(범위) --> 변수의 적용 범위
 	var num;
 	
 	function func() {
		var _num;
	}
 	
 	
</script>



</body>
</html>