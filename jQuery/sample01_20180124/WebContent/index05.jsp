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

<div id="div1" style="width: 80px; height: 80px; background-color: red">
</div>
<div id="div2" style="width: 80px; height: 80px; background-color: green">
</div>
<div id="div3" style="width: 80px; height: 80px; background-color: blue">
</div>
<br><br><br>
<button id="fadein">Fade In</button>
<button id="fadeout">Fade Out</button>
<button id="toggle">Fade Toggle</button>

<br><br>
<img src="./pic2.gif" class="pic">


<script type="text/javascript">
$(function() {
	$("#fadein").click(function() {
		$('#div1').fadeIn();
		//$('#div1').fadeIn(3000);
		$('#div1').fadeIn('slow');
	});
	$('#fadeout').click(function() {
		//$('#div2').fadeOut();
		$('#div1').fadeOut(1000);
		$('#div2').fadeOut(2000);
		$('#div3').fadeOut(3000);
	});
	$('#toggle').click(function() {
		//$('#div3').fadeToggle();
		//$('#div3').fadeToggle('slow');
		$('#div1').fadeToggle(1000);
		$('#div2').fadeToggle(2000);
		$('#div3').fadeToggle(3000);
	});
	
	
/* 	
	$('.pic').click(function () {
		$('.pic').css("border", "solid 5px #0000ff");
	}); 
*/
	$(function () {
		$('.pic').click(setBorder);
	});

	function setBorder() {
		$(this).css("border", "solid 10px #00ffff");
	}
	
});
</script>



</body>
</html>