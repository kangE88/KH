<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>(문제)</h1>
영어 속담으로 1일 1개씩 먹으면 의사 필요없다 라고한 과일은 무엇일까요?<br><br>

ㅁ 영어(소문자)로 답한다.<br>
답:&nbsp;<input type="text" id="txt">&nbsp;<button onclick="answer()">button</button>
<script type="text/javascript">
	function answer() {
		
		var answer = "apple";
		var str = document.getElementById("txt").value;
		
		if(answer == str){
			alert("정답입니다.");
		}else{
			alert("오답입니다.");
		}
		
		
	}
</script>

</body>
</html>