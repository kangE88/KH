<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<style type="text/css">
#id{
	border: 10px solid;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<p style="background-color: #ff0000">P tag1 R</p><br>
<p style="background-color: #00ff00">P tag2 G</p><br>
<p style="background-color: #0000ff">P tag3 B</p><br>

<button>click background color</button>

<div id="news">loading......</div>

<script type="text/javascript">
$(function () {
	$("#news").load("news.txt",function(txt, status){
		if(status == "success"){
			alert("loading success");
		}else if(status == "error"){
			alert("loading error");
		}
	});
	
	$("button").click(function () {
		//var color= $("p").css("background-color"); // getter
		//alert("color = "+color);
		
		//$("p").css("background-color","yellow"); //setter
		
		$("p").css({
				"background-color":"gray",
				"font-size":"200%",
				"border":"solid 5px red"
		});
	})
});
</script>

</body>
</html>