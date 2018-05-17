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
<!-- 
클릭하면, 이미지를 변경,
mouseOver한 요소(element)를 애니메이션시킨다.
동적으로 변경 
-->

<!-- 
<p id="test" onclick="func()">click</p>
<button onclick="func()">button</button>
 -->
 
 <p id="test">click</p>
 
 <p>p1</p>
 <p>p2</p>
 
 <div>
 	<p>div in p tag</p>
 </div>

<h1 class="cls" onmouseover="_mOverFunc()" style="background-color: red">H1 tag</h1>

<script type="text/javascript">
function func() {
	alert("P click");
}

/* 

$(function(){
});

아래 코드와 같음 ↓
 */
$(document).ready(function(){
	//alert("jQuery 실행");
	$("#test").click(function name(){
		alert("p click!!!!");
	}); //'#test' 작은 따옴표 사용가능
	
	$('.cls').click(function(){
		//$('.cls').text("here click");
		$(this).text("here click");
	});
	
	$('p').click(function(){
		$(this).text("p click change");
	}); //p태그 클릭 시 here click change로 text 변경
	
	$('div p').click(function(){
		$(this).text("div p click change");
	}); //div태그안에 p태그 클릭 시 here click change로 text 변경
	
	$('h1').mouseover(function(){
		alert("mouseover");
	});//아래 jsp에서 사용하는 함수를 jquery에선 이와 같이 사용
	
	$('h1').mouseout(function(){
		alert("mouseout");
	});
});
/* 
function _mOverFunc(){
	alert("_mOverFunc() over");
} //H1 tag 마우스 오버 시 알림창 뜨게하기

 */

</script>



</body>
</html>