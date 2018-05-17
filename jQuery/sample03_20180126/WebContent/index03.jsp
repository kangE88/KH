<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<style type="text/css">
.important{
	font-weight: bold;
	font-size: xx-large;
}
.blue{
	color: blue;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>title1</h1>
<h2>title2</h2>

<p>P1 tag</p>
<p>P2 tag</p>

<div>div tag</div>

<pre>
pre tag
!!!!!!!
</pre>

<button>class add</button>
<button id="remove">class delete</button>

<script type="text/javascript">
$(function () {
	$("button").click(function () {
		$("h1, h2, p").addClass("blue");
		$("div").addClass("important");
		$("pre").addClass("blue important");
	});
	
	$("#remove").click(function () {
		$("pre").removeClass("important");
	});
})
</script>

</body>
</html>