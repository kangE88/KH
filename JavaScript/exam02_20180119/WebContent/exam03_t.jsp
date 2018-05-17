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
다음 생일까지 남은 일수를 볼 수 있습니다<br><br>
<button onclick="dayCount()">생일을 입력</button>

<script type="text/javascript">
function dayCount() {
	var birthmonth = prompt("생일월을 1~12사이로 입력하세요");
	var birthday = prompt("생일일자를 1~31사이로 입력하세요");
	
	var now = new Date();
	var birth = new Date();
	
	birth.setMonth(birthmonth-1);
	birth.setDate(birthday);
	
	var ms = birth.getTime()-now.getTime();
	
	if(ms<0){
		//올해 생일이 지난경우
		var by = birth.getFullYear();
		birth.setsetFullYear(by + 1);
		ms = birth.getTime() - now.getTime();
	}else if(ms == 0){
		//오늘 생일
	}
	
	var days = ms / (24 * 60 * 60 * 1000);
	days = Math.ceil(days);
	alert("남은일수 "+days+"입니다.");
	
}
</script>

</body>
</html>