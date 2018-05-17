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
var parser, xmlDoc;
var text = "<bookstore><book>" +
				"<title>탈무드</title>" +
				"<author></author>" +
				"<year>2001</year>" +
			"</book></bookstore>";
			
parser = new DOMParser();
xmlDoc = parser.parseFromString(text, "text/xml");

alert(xmlDoc);

//document.getElementById("demo").innerHTML = xmlDoc.getElementsByTagName("book")[0].childNodes[0].nodeName;
//document.getElementById("demo").innerHTML = xmlDoc.getElementsByTagName("book")[0].childNodes[1].nodeName;
document.getElementById("demo").innerHTML = xmlDoc.getElementsByTagName("book")[0].childNodes[0].childNodes[0].nodeValue;


			
</script>

</body>
</html>