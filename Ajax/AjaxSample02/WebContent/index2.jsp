<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>

<h2>Ajax Sample</h2>

<p id="demo"></p>

<button>Ajax run</button>
 
<script type="text/javascript">

$(function () {	
	$("button").click(function () {
		
		$.ajax({
			type:"post",
			url:'https://iwb.jp/s/js/data.jsonp',
			dataType:'jsonp',
			jsonpCallback: 'android',
			success:function(json){
				$.each(json, function(i, item){
					$('body').prepend(i + ":" + item.version + " " + item.codename + "<br>");
				});
			},
			error:function(xhr){
				alert("error");	
			}			
		});		
	});
});	
</script>	

</body>
</html>




