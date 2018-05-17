<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" type="text/css" />

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
 
<script src="http://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
</head>
<body>

<h1>JQuery 달력</h1>
<h2>date Picker</h2>

<p>선택일:<input type="text" id="date"></p>

<p>text박스를 클릭하면 , <strong>카렌더</strong>가 표시됩니다</p>

연도:<p id="year"></p>
월:<p id="month"></p>
일:<p id="day"></p>

요일:<p id="mydate"></p>

<script type="text/javascript">
$(function () {
	$("#date").datepicker({
		dateFormat:"yy/mm/dd",
		dayNameMin:["일", "월", "화", "수", "목", "금", "토"],
		monthName:["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
		
		onSelect:function( d ){

			$("#year").text(d.substring(0,4));
			$("#month").text(d.substring(5,7));
			$("#day").text(d.substring(8,10));
			var date = $("#date").datepicker('getDate');
			var dayName = $.datepicker.formatDate('DD',date); 
			$("#mydate").text(dayName);
		}
	});
})
</script>

</body>
</html>