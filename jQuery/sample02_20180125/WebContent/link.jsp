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

<form action="index01.jsp">
	<!-- 다른페이지로 이동할때 사용 -->
	<!-- type1 : <input type="submit" value="버튼제목명"> -->
	<!-- type2 : <button type="button" onclick="btnclick()">버튼제목명</button> -->
	<!-- type3 : <button type="button" id="btn">버튼제목명</button> -->
	<input type="button" id="btn" value="버튼제목명">
</form>

<script type="text/javascript">
/*typ2
function btnclick() {
	location.href = "index01.jsp";
}
*/
/* type3,4 */
$(function () {
	$('#btn').click(function () {
		location.href = "index01.jsp";
	})
});

</script>

</body>
</html>