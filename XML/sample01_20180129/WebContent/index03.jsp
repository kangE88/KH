<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p id="demo"></p>

<script type="text/javascript">
var xhttp;
xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function(){
	if(this.readyState == 4 && this.status == 200){
		//myFunc(this);
		//nodeFunc(this);
		dataFunc(this);
	}
}
xhttp.open("GET", "sample2.xml", true);
xhttp.send();

function myFunc( xml ) {
	var x, i, txt, xmlDoc;
	xmlDoc = xml.responseXML;
	
	txt = "";
	
	x = xmlDoc.getElementsByTagName("번호");
	
	for(i=0;i<x.length;i++){
		txt += x[i].childNodes[0].nodeValue +"<br>";
	}
	document.getElementById("demo").innerHTML = txt;
}

function nodeFunc( xml ) {
	var x, i, txt, xmlDoc;
	xmlDoc = xml.responseXML;
	
	txt = "";
	x = xmlDoc. documentElement.childNodes;
	for(i=0;i<x.length;i++){
		if(x[i].nodeType == 1){
			txt += x[i].nodeName +"<br>";
		}
	}
	document.getElementById("demo").innerHTML = txt;
	
}

function dataFunc( xml ) {
	var x, i, txt, xmlDoc;
	xmlDoc = xml.responseXML;
	x = xmlDoc.getElementsByTagName("고객")[0];
	xlen = x.childNodes.length;
	
	y = x.firstChild;
	txt ="";
	for(i=0;i<xlen;i++){
		if(y.nodeType == 1){
			txt += i+ " " + y.nodeName + "<br>";
		}
		y = y.nextSibling;
	}
	document.getElementById("demo").innerHTML = txt;
}

</script>

</body>
</html>