<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	
	Java Script != Java
		--간결하게 한 언어 JQuery
	
	보조 프로그래밍적인 요소이다. (UI)
	컴파일을 하지 않는다. == 가볍다
	클라이언트 언어
	
	JSP = Server(Web) + Client
	Restful 방식 -- Spring
	
	ex) ID 글자수를 조사
		PW 숫자를 포함, 기호를 포함
		Timer를 설정하여 특수효과 처리 할 수 있다.
		
		특정 Tag의 값을 추가, 변경, 삭제, Tag도 삭제, 추가
		
		ex)<p>Hello</p>
			<input type="text" name="" id="id">
			
			목적: tag값을 가지고 오기 위해서
			name -- 동일한 이름이 있음.. 웹페이지에서 웹페이지로 송신
			id 	 -- 한개밖에 없음. JavaScript용, JQuery
 -->	
 
 <p id="demo">여기가 p태그입니다.</p>
 
 <script type="text/javascript">
 var ptag = document.getElementById("demo").innerHTML;
 
 alert(ptag);
 
 console.log("ptag = "+ptag);
 
 document.getElementById("demo").innerHTML = "변경된 문자열";
 </script>
 
</body>
</html>