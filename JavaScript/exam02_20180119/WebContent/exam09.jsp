<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="black">
<h1 style="color:white;">사진들</h1>
<img id="img" src="./images/meiji01.jpg">
<select id="selectBox" onchange="sel()">
  <option value="" hidden>사진선택</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
</select>

<script type="text/javascript">
function sel() {
	var img = document.getElementById("img");
	var obj = document.getElementById("selectBox");
	var indexNum = obj.options[obj.selectedIndex].value;
	
	if(indexNum){
		img.src = "./images/meiji0"+indexNum+".jpg";
	}
	
/* 	switch(indexNum){
	case 1:
		alert("1");
		img.src = "./images/meiji01.jpg";
		break;
	case 2:
		alert("2");
		img.src = "./images/meiji02.jpg";
		break;
	case 3:
		img.src = "./images/meiji03.jpg";
		break;
	case 4:
		img.src = "./images/meiji04.jpg";
		break;
	} */
	
}
</script>

</body>
</html>