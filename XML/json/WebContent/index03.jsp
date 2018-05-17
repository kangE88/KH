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
var xmlhttp = new XMLHttpRequest();
var url = "data.js";

xmlhttp.onreadystatechange = function() {
	if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
		myfunc(xmlhttp.responseText);
	}
};

xmlhttp.open("GET", url, true);
xmlhttp.send();

function myfunc(resp) {
	var arr = JSON.parse(resp);
	var out = "<table border='1'>";
	
	for(i=0;i<arr.length;i++){
		out += "<tr>"+"<td>"+ arr[i].name+"</td>" + "<td>" + arr[i].age+ arr[i].add+"</td>" +"</tr>";  
	}
	out +="</table>";
	
	document.getElementById("demo").innerHTML = out;
}

</script>

</body>
</html>