<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>배경색의 변경</h1>

※ 다음 버튼을 클릭하면 홈페이지의 배경색을 변경할 수 있습니다.<br>

<button onclick="color(0)">빨강</button>
<button onclick="color(1)">녹색</button>
<button onclick="color(2)">청색</button>
<button onclick="color(3)">주황색</button>
<button onclick="color(4)">검정색</button>
<button onclick="color(5)">흰색</button>
 
<script type="text/javascript">
function color(n) {
	var arr = new Array(6);
	
	arr[0] = "red";
	arr[1] = "green";
	arr[2] = "blue";
	arr[3] = "orange";
	arr[4] = "black";
	arr[5] = "white";
	
	//document.bgColor="red";
	document.bgColor=arr[n]; 
}
</script>

</body>
</html>