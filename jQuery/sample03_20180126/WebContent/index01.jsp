<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>d월 200만 국민연금 수급자 나왔다</p>
<button onclick="appendText()">추가텍스트</button>

<script type="text/javascript">
function appendText() {
	var txt1 = "<p>추가텍스트</p>"; //html
	var txt2 = $("<p></p>").text("추가텍스트2"); //jQuery
	var txt3 = document.createElement("p"); //javascript 생성
	txt3.innerHTML = "추가텍스트3";
	
	
	$("body").append(txt1, txt2, txt3);
}
</script>

</body>
</html>