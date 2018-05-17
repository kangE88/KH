<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>미술관 및 박물관의 링크</h1>
<form name="f1">
	<select name="links" onchange="goLink()">
		<option>대상을 선택</option>
		<option>미술관----------</option>
		<option value="http://sema.seoul.go.kr">서울시립미술관</option>
		<option value="http://mmca.go.kr">국립현대미술관</option>
		<option value="http://sac.or.kr">예술의전당</option>
		<option>박물관----------</option>
		<option value="http://www.museun.go.kr">국립중앙박물관</option>
		<option value="http://www.meseum.seoul.kr">서울역사박물관</option>
		<option value="http://www.nfm.go.kr">국립민속박물관</option>
	</select>
</form>

<script type="text/javascript">
function goLink() {
	var n = document.f1.links.selectedIndex;
	
	if(n !=0 && n !=1 && n !=5){
		location.href = document.f1.links.options[n].value;
	}
}
</script>
</body>
</html>