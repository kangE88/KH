<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<style>
input:focus {
    background-color: green;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
	<h1>송부정보의 입력</h1>
	이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름: <input type="text" id="name"><br><br>
	우편번호: <input type="text" size="3" id="front_num"> - <input type="text" size="3" id="back_num"> <button type="button" id="addr_change">주소변환</button><br><br>
	주&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;소: <textarea rows="5" cols="70" id="addrtext"></textarea><br>
	전화번호: <input type="text" size="3" id="ph1"> - <input type="text" size="3" id="ph2"> - <input type="text" size="3" id="ph3"><br>
	배달시간:
	<select>
		<option>10:00 ~ 12:00</option>
		<option>12:00 ~ 15:00</option>
		<option>15:00 ~ 17:00</option>
		<option>17:00 ~ 20:00</option>
		<option>지정하지않음</option>
	</select><br>
	영수증 요청: <input type="checkbox" id="ck"><br>
	메일 매거진을 수신: <input type="radio" value="0" checked>신청<input type="radio" value="1">신청하지 않음<br>
	<button type="submit" id="submit">확인화면으로 진행</button>
</form>

<script type="text/javascript">

$(document).ready(function () {
	$("#submit").click(function() {
		if($("#name").val().length==0){alert("이름을 입력하세요");return false;} 
		if($("#front_num").val().length==0){alert("주소번호를 입력하세요(front)"); $("#front_num").focus(); return false;}
		if($("#back_num").val().length==0){alert("주소번호를 입력하세요(back)"); $("#back_num").focus(); return false;}
		if($("#addrtext").val().length==0){alert("주소를 입력하세요"); $("#addrtext").focus(); return false;}
		if($("#ph1").val().length==0){alert("휴대폰번호 맨앞 입력하세요"); $("#ph1").focus(); return false;}
		if($("#ph2").val().length==0){alert("휴대폰번호 중간 입력하세요"); $("#ph2").focus(); return false;}
		if($("#ph3").val().length==0){alert("휴대폰번호 끝 입력하세요"); $("#ph3").focus(); return false;}
		if(!$("#ck").is(":checked")){$("#ck").blur(); return false;}
	});
	
/* 	$("#addr_change").click(function() {
		var addrtext = $("#addrtext").val();
		$("#addrtext").val("( "+$("#front_num").val()+" - "+$("#back_num").val()+" )\n"+addrtext);
		$("#addrtext").attr("readOnly","readOnly");
	}); */
	$("#addr_change").click(function() {
	    new daum.Postcode({
	        oncomplete: function(data) {
	            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
	            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
	            $("#front_num").val(data.zonecode);
	            $("#addrtext").val(data.roadAddress);
	        }
	    }).open();
	});
	
});


</script>

</body>
</html>