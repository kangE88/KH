<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 id="intro">h1</h1>

<p id="demo">p tag</p>
<p>p1</p>
<p>p2</p>
<p>p3</p>

<button onclick="myfunc()">버튼</button>

<div id="div1">
	<p id="p1">p1 test</p>
	<p id="p2">p2 test</p>
</div>

<select id="mySelect" size="4">
	<option>audi</option>
	<option>vens</option>
	<option>bmw</option>
	<option>vw</option>
</select>

<br><br>

<p id="carname">carName</p>

<script type="text/javascript">
function myfunc() {
	//childNodes
	var mytext = document.getElementById("intro").childNodes[0].nodeValue;
	document.getElementById("demo").innerHTML = mytext;
	
	//innerHTML
	//alert(document.body.innerHTML);
	
	//alert(document.documentElement.innerHTML);
	
	//appendChild
	var para = document.createElement("p"); //<p></p>
	var node = document.createTextNode("새로운 p 태그");
	
	para.appendChild(node); //<p>새로운 p 태그</p>
	
	 
	var element = document.getElementById("div1");
	/*
	element.appendChild(para);
	 */ 
	
	var child = document.getElementById("p2");
	element.insertBefore(para, child);
	
	
	//removeChild
	var parent = document.getElementById("div1");
	var child = document.getElementById("p1");
	parent.removeChild(child);
	
	var nodeList = document.getElementsByTagName("p");
	document.getElementById("demo").innerHTML = nodeList.length;
	
	for(i=0;i<nodeList.length; i++){
		nodeList[i].style.backgroundColor = "red";
	}
	
	//childNodes
	var c = document.getElementById("mySelect").childNodes;
	document.getElementById("carName").innderHTML = c[3].text;
		
}
</script>
<!-- 
DOM -- Document Object Model

<html> 
- root 
- 부모태그 없음
- <head> <body> 태그의 부모

<head>
- <html> 첫번째 자식 태그
<body>
- <html> 두번째 자식 태그

 -->

</body>
</html>