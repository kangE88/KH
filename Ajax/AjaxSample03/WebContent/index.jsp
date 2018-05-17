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

<div style="width: 500px; margin: auto; margin-top: 100px">
<form id="frm">
	<div>
		<label>글번호</label>
		<input type="text" name="number" id="number">
	</div>
	<div style="margin-top: 20px">
		<label>아이디</label>
		<input type="text" name="id" id="id">
	</div>
	<div style="margin-top: 20px">
		<label>코멘트</label>
		<input type="text" name="comment" id="comment">
	</div>
	<div style="margin-top: 20px">
		<input type="button" value="button" id="button">
	</div>
	<br><br>
	<div id="ajaxReturn">결과 값</div>

</form>
</div>

<script type="text/javascript">
$(function () {
	
	$("#button").click(function () {
		
		$.ajax({
			type:"get",
			url:"./check.jsp",
			data:{ 
				number:$('#number').val(),
				id:$('#id').val(),
				comment:$('#comment').val()
			},
			success:function(data){
			//	alert("success");
			//	$("#ajaxReturn").html(data);
				$("#ajaxReturn").html("사용하실 수 있는 ID입니다");
			},
			error:function(){
				alert("error");
			}
		});		
	});	
	
});

</script>



</body>
</html>








