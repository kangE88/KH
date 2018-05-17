<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>

<p id="result">여기가 id = result 해당</p>
<button>버튼</button>

<script type="text/javascript">
$(document).ready(function () {
	$("button").click(function () {
		alert("button click");
		$.ajax({
			url:"test.jsp",			// 이동
			type:"GET",				// 방식
			data:"t1=AAA&t2=BBB",	// 넘길 데이터
			success: function (data, status, xhr) {				
				alert("통신성공");
				// 왔음!!
				$("#result").html(data);
			},
			error: function (xhr, status, error) {
				alert("통신실패");
			},
			complete: function (xhr, status) {
				alert("통신종료");
			},	
		});		
	});
});
</script>

</body>
</html>







