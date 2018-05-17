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

<!-- radio, checkbox -->

<ul>
	<li><input type="radio" name="radio_text" value="사과" checked>사과</li>
	<li><input type="radio" name="radio_text" value="배">배</li>
	<li><input type="radio" name="radio_text" value="바나나">바나나</li>
</ul>

<p id="get_btn">click</p>
<br><br>

<input type="checkbox" id="rd2">그림 그리기
<br><br>

<input type="text" id="hoge"><br><br>
<input type="text" id="hogeKeyCode">

<script type="text/javascript">
$(function () {
	$('#get_btn').click(function() {
		//getter
		/* var radioVal = $("input[name='radio_text']:checked").val();
		alert("radioVal = "+radioVal);
		 */
		//setter
		//$("input[name='radio_text']").val(["배"]);
		
		 
		 //checkbox
		 //var check = $("#rd2").is(":checked");
		 //alert("check = "+check);
		 
		 var check = $("input:checkbox[id='rd2']").is(":checked");		
		 alert("check=="+check);
	});
	
	$("#hoge").keydown(function(event) {
		var keyCode = event.keyCode;
		$("#hogeKeyCode").val("keyCode:"+keyCode);
	});
});
</script>


</body>
</html>