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
<!-- 
text파일
xml파일 읽어들여 form에 출력
json파일        "
DB에서 읽어 들여 form에 출력(ID확인)
 -->
 
<h2>Ajax Sample</h2>

<p id="demo"></p>

<button>Ajax run</button>
 
<script type="text/javascript">

$(function () {
	
	$("button").click(function () {
		
		$.ajax({
			type:'post',
			url:'./data.json',
			datatype:'json',
			success:function(json){
			//	alert("ajax success");
			//	alert("json[0] version = " + json[0].version);
			//	alert("json[0] codename = " + json[0].codename);
			
				/* for(i = 0;i < json.length; i++){			
					$("#demo").append(json[i].version + " ");
					$("#demo").append(json[i].codename + "<br>");
				} */
				
				$.each(json, function (i, item) {
					alert("i = " + i);
					alert("item = " + item.version);
					alert("item = " + item.codename);
				});
				
			},
			error:function(){
				alert("ajax error");	
			}		
		});
	});		
});

</script> 



 
</body>
</html>










