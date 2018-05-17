<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="LoginForm" name="LoginForm" onsubmit="return submitform(this);">
	<fieldset>
		<legend>회원가입</legend>
		아이디 : <input type="text" id="LoginId" name="LoginId" maxlength="15"><br>
		비밀번호 : <input type="password" id="LoginPass" name="LoginPass" maxlength="15"><br>
		<input type="submit" value="로그인">
	</fieldset>
</form>

<script type="text/javascript">
function submitform(formEI) {
	var errorMessage = null;
	var objFucus = null;
	
	if(formEI.LoginId.value.length == 0){
		errorMessage = "아이디를 넣어 주세요";
		objFucus = formEI.LoginId;
	}else if(formEI.LoginId.value.length < 8){
		errorMessage = "아이디가 짧습니다.";
		objFucus = formEI.LoginId;	
	}else if(formEI.LoginPass.value.length == 0){
		errorMessage = "비밀번호를 넣어주세요.";
		objFucus = formEI.LoginPass;		
	}
	
	if(errorMessage != null){
		alert(errorMessage);
		objFucus.focus();
		return false;
	}
	return true;
}

</script>

</body>
</html>