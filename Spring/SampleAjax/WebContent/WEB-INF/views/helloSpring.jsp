<%@page import="kh.com.a.MyClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

<h1>hello Spring</h1>

<!-- 1 -->
<%
MyClass cls = (MyClass)request.getAttribute("hgd");
%>

번호:<%=cls.getNumber() %>
<br>
이름:<%=cls.getName() %>
<br><br>

<!-- 2 -->
<form action="inputData.do">
번호:<input type="text" name="number">
이름:<input type="text" name="name">
<input type="submit" value="전송">
</form>

<!-- 3 -->
<form method="post">
아이디:<input type="text" id="formid">
<button type="button" onclick="idcheck()">idCheck</button>
</form>

<script type="text/javascript">
function idcheck(){
	$.ajax({
		url : "idcheck.do",
		type: "post",
		data: "id="+$("#formid").val(),  /* idcheck.do?id=aaa */
		success:function(data){
			alert("data:"+data+"   옥케이!");
			$("#formid").val(data);
		},
		error:function(request, status, error){
			alert("실패");
		}
	})
}
</script>


<br><br>

<!-- 4 -->
<form id="testform" name="get">
이름:<input type="text" id="name">
전화:<input type="text" id="tel">
이메일:<input type="text" id="email">
생년월일:<input type="text" id="birth">
<button type="button" onclick="account()">account</button>
</form>

<script type="text/javascript">
function account(){
	var data = {
			name:$("#name").val(),
			tel:$("#tel").val(),
			email:$("#email").val(),
			birth:$("#birth").val(),
	};
	
	$.ajax({
		dataType:'json',
		url:'account.do',
		data:data,
		type:'get',
		async:true,
		success:function(resp){
			alert("success");
			alert(resp.message);
		},
		error:function(r, s, e){
			alert("error");
		}
	})
}
</script>

<br><br>

<!-- 4 -->
<form name="post">
이름:<input type="text" id="_name">
전화:<input type="text" id="_tel">
이메일:<input type="text" id="_email">
생년월일:<input type="text" id="_birth">
<button type="button" onclick="account2()">account22</button>
</form>

<script type="text/javascript">
function account2(){
	var data = {};
	
	data["name"] = $('#_name').val();
	data["tel"] = $('#_tel').val();
	data["email"] = $('#_email').val();
	var birth = $('#_birth').val();
	data["birth"] = birth.replace(/-/g,''); //2018-03-13 => 20180313
	
	
	$.ajax({
		contentType:'application/json',
		dataType:'json',
		data:JSON.stringify(data), // Javascript 값을 JSON으로 변환한다
		url:"updateUser.do",
		type:'POST',
		success:function(res){
			alert(res.msg);
		},
		error:function(req, status, error){
			alert("error");
		}
	});
}
</script>

</body>
</html>