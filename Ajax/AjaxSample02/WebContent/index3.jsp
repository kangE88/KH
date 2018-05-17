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

<button>button</button>

<script type="text/javascript">
var _xml;
var _arrTarget = [];
var _arrLink = [];
var _arrDesc = [];

$(function () {	
	$("button").click(function () {
		
		$.ajax({
			url:'./data.xml',
			dataType: 'xml',
			success:function(data){
			//	alert("success");
				_xml = $(data).find("xmldata");
				var len = _xml.find("news").length;
				
				for(i = 0;i < len; i++){
					
					_arrTarget[i] = _xml.find("news").eq(i).find("target").text();
					_arrLink[i] = _xml.find("news").eq(i).find("link").text();
					_arrDesc[i] = _xml.find("news").eq(i).find("name").text();
					
					$("body").append(_arrTarget[i]).append(_arrLink[i]).append(_arrDesc[i]).append("<br>");
				}
			},
			error:function(xhr){
			//	alert("error");
			}			
		});
		
	});	
});

</script>

</body>
</html>






