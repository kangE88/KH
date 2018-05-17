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

<p id="result">여기가 id = result 해당</p>
<button>버튼</button>

<script type="text/javascript">
$(document).ready(function () {	
	$("button").click(function() {		
		$.get("test.html", function (data, status, xhr) {
			if(status == "success"){
				alert(data);
				
				$("#result").html(data + " " + status + " " + xhr.status);
			}			
		});		
	});	
});
</script>

</body>
</html>


