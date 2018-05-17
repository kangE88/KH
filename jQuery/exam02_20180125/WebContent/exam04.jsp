<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>photo auto add</h1>

<p>jQuery Auto Add</p>

<div class="pic">

</div>

<script type="text/javascript">
var p;

$(function () {

	for(i=1;i<9;i++){
		p = $("<img>").attr("src","image/photo_"+i+".jpg")
		$(".pic").append( p );
	}
	
	$("img").mouseover(function () {
		$(this).css("cursor","pointer");			
	});
	$("img").click(function () {
		$(this).remove();
	});
});
</script>


</body>
</html>