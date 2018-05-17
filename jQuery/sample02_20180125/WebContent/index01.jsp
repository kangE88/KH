<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<h1>수행사항</h1>
<button id="woman">여자부</button>
<button id="man">남자부</button>
<br><br>
<table id="result">
	<tr>
		<th></th>
		<th>이름</th>
		<th>타임</th>
	</tr>
	<tr>
		<th>우승</th>
		<td></td>
		<tD></td>
	</tr>
	<tr>
		<th>2위</th>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<th>3위</th>
		<td></td>
		<td></td>
	</tr>
</table>

<script type="text/javascript">
var man=[
	["",""],
	["홍길동","1:21:14"],
	["일지매","1:21:14"],
	["임꺽정","1:21:14"],
];

var woman=[
	["",""],
	["홍길녀","1:21:14"],
	["일지녀","1:21:14"],
	["임꺽녀","1:21:14"],
];

$(function() {
	$('tr:even').css("background-color","#00ff00");
	
	//$('tr:eq(3)>td:eq(0)').html('test');
	
	 $('#woman').click(function() {
			for(i=0;i<4;i++){
				for(j=0;j<2;j++){
					$('tr:eq('+i+')>td:eq('+j+')').html(woman[i][j]);
				}
			}
		}); 
	 $('#man').click(function() {
			for(i=0;i<4;i++){
				for(j=0;j<2;j++){
					$('tr:eq('+i+')>td:eq('+j+')').html(man[i][j]);
				}
			}
		}); 
});



</script>


</body>
</html>