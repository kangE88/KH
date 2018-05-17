<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>문제</h1>
사나이들의 영화인 탑건은 군인 영화입니다. 그러면 육군,해군,공군 중 어느군의 영화일까요?<br>
<input type="text" id="txt1">
<button onclick="clickEvent()">답을보다</button><br><br>

※버튼을 한번 누르면 힌트<br>
※버튼을 두번 누르면 정답
<p id="p1"></p>

<script type="text/javascript">

var cnt = 1;
function clickEvent() {
	
	var m_para = document.getElementsByTagName("p1");

	for(i=0;i<m_para.length; i++){
		if(cnt > 1){
			var para = document.createElement("p"); //<p></p>
			var node = document.createTextNode("해군");
			var pid = document.getElementById("p1");
			para.appendChild(node);		
			pid.appendChild(para);
			cnt = 1;
		}else{
			var para = document.createElement("p"); //<p></p>
			var node = document.createTextNode("바다");
			var pid = document.getElementById("p1");
			para.appendChild(node);	
			pid.appendChild(para);
			cnt++;
		}
	
	
		m_para[i].remove;
	}
	
	
}
</script>
</body>
</html>