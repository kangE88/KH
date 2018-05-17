<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>다음 생일까지 남은 일수</h1>
다음 버튼을 클릭해서 생일을 입력하면<br>
다음생일까지 남은 일수를 볼 수 있습니다.<br>
<br>
<button onclick="count()">생일을 입력</button>

<script type="text/javascript">
function count() {
	var bm = prompt("생일 월을 1~12에서 입력하십시요","1"); //1부분은 default값 (처음실행시써있는숫자)
	var bd = prompt("생일 날짜를 1~31로 입력하십시요","1");
	
	var now = new Date();
	var birth = new Date();
	
	birth.setMonth(bm-1); //월은 0부터들어가기때문 [0~11까지만들어줌]
	birth.setDate(bd); //setDay()는 요일값
	
	alert(birth);
	
	var ms = birth.getTime() - now.getTime();
	if(ms <=0){  //올해 생일이 지났을경우
		var by = birth.getFullYear(); //2017
		birth.setFullYear(by+1); //2018
		ms = birth.getTime() - now.getTime();
	}
	//며칠남았는지 구하기
	var days = ms / (24 * 60 * 60 * 1000); /* 하루는 24시간, 1시간은 60분, 1분은 60초, 1초는 1000ms */
	days = Math.ceil(days); /* 올림  <->floor */
	
	alert("다음 생일까지 남은 일수는 "+days +"일 입니다.");
	
}

</script>


</body>
</html>