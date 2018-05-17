<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="insertAf.jsp" method="post">

아이디&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" size="19" name="id"><br>
패스워드&nbsp;<input type="password" size="20" name="pwd"><br><br>
<br>
취미<br>
<input type="checkbox" name="hobby" value="sleep">잠자기
<input type="checkbox" name="hobby" value="game">게임
<input type="checkbox" name="hobby" value="sing">노래
<br><br>

연령대<br>
<input type="radio" name="age" value="10" checked="checked">10대
<input type="radio" name="age" value="20" checked="checked">20대
<input type="radio" name="age" value="30" checked="checked">30대
<input type="radio" name="age" value="40" checked="checked">40대
<input type="radio" name="age" value="50" checked="checked">50대
<input type="radio" name="age" value="60" checked="checked">60대 이상
<br><br>

기타하고 싶은 말<br>
<textarea rows="5" cols="50" name="desc">

</textarea>

<br><br>
<input type="submit" value="send">
<input type="reset" value="cencel">



</form>

</body>
</html>