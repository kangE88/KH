<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<p id="demo"></p>

<script type="text/javascript">
 	function loadXMLDoc() {
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function () {
			if(this.readyState == 4 && this.statue == 200){
				document.getElementById("demo").innerHTML = this.responseText;
			}
		};
		
		xhttp.open("GET", "sample2.xml", true);
		xhttp.send();

	}
 	
 	function myFunc( xml ) {
 		var x, i, txt, xmlDoc;
 		xmlDoc = xml.responseXML;
 		
 		txt = "";
 		
 		x = xmlDoc.getElementsByTagName("고객")[0].attributes;
 		//속성값 가져오는 부분
 		txt = x.getNamedItem("직업").nodeValue + "<br>"+ x.length;

 		document.getElementById("demo").innerHTML = txt;
 	}
 </script>

</body>
</html>