<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cookie 저장</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="http://lab.alexcican.com/set_cookies/cookie.js" type="text/javascript" ></script>

<style type="text/css">
.center{
	margin: auto;
	width: 60%;
	border: 3px solid #ff0000;
	padding: 10px;
}
</style>

</head>
<body>

<h1>로그인</h1>

<div class="center">

<form id="_frmForm" action="NewFile.jsp">

<table border="1">
<tr>
	<td>아이디</td>
	<td>
		<input type="text" id="_userid" name="id" size="20"
			data-msg="아이디를">
		<input type="checkbox" id="_chk_save_id">ID 저장	
	</td>
</tr>
<tr>
	<td>패스워드</td>
	<td>
		<input type="text" id="_pwd" name="pwd" size="20" 
			data-msg="암호를">
	</td>
</tr>
<tr>
	<td colspan="2" style="height: 50px; text-align: center;">
		<a href="#none" id="_btnLogin" title="로그인"	>
			<img alt="로그인" src="login_btn.jpg">
		</a>
	</td>
</tr>
</table>
</form>
</div>

<script type="text/javascript">
$("#_btnLogin").click(function () {
	
	if($("#_userid").val() == ""){
		alert($("#_userid").attr("data-msg") + " 입력해 주십시오");
	}else if($("#_pwd").val() == ""){
		alert($("#_pwd").attr("data-msg") + " 입력해 주십시오");
	}else{
		$("#_frmForm").attr("target", "_self").submit();
	}	
});

var user_id = $.cookie("user_id");
if(user_id != null){
	$("#_userid").val(user_id);
	$("#_chk_save_id").attr("checked", "checked");
}

$("#_chk_save_id").click(function () {

	if($('input:checkbox[id="_chk_save_id"]').is(":checked")){
	//	alert("checked");
		if($("#_userid").val() == ""){
			alert("아이디를 입력해 주십시오");
			$(this).attr("checked", false);
		}else{
			$.cookie("user_id", $("#_userid").val(), {expires:7, path:'/'});
		}
	}
	else{
	//	alert("no checked");
		$.removeCookie("user_id", { path: '/' });
	}
	
});

</script>


</body>
</html>










