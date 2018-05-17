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
 XML
 eXtensible Markup Language
 확정 마크업 언어

html -> web printing
xml  -> 
 
 -->
 
 <button type="button" onclick="loadXMLDoc()">내용 변경</button>
 
 <p id="demo"></p>
 
 <script type="text/javascript">
 	function loadXMLDoc() {
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function () {
			if(this.readyState == 4 && this.statue == 200){
				document.getElementById("demo").innerHTML = this.responseText;
			}
		};
		
		xhttp.open("GET", "test.txt", true);
		xhttp.send();

	}
 </script>
 <!-- 
 readyState 처리상태
 0: open() 메소드를 수행전
 1: 로딩중
 2: 로딩완료
 3: 서버처리중
 4: 서버처리끝
 
 status 서버처리 결과
 ㅋ
 
  -->
 

</body>
</html>