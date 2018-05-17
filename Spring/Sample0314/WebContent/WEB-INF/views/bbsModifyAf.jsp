<%@page import="bbs.BbsDao"%>
<%@page import="bbs.iBbsDao"%>
<%@page import="bbs.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bbsModify.jsp</title>

<style type="text/css">
.center{
	margin: auto;
	width: 60%;
	border: 3px solid #8AC007;
	padding: 10px;
}
input {
	size: 50;
}
</style>

</head>
<body>
<%
request.setCharacterEncoding("utf-8");

String sseq = request.getParameter("seq");
String title = request.getParameter("title");
String content = request.getParameter("content");

int seq = Integer.parseInt(sseq.trim());

iBbsDao dao = BbsDao.getInstance();

boolean isS = dao.Modify(seq, title, content);

System.out.println(isS);

if(isS){%>
<script type="text/javascript">
alert("글 수정 완료");
location.href = "bbslist.jsp";
</script>
<%
}else{
%>
<script type="text/javascript">
alert("글 수정 실패");
location.href = "bbslist.jsp";
</script>
<%
}
%>

</body>
</html>