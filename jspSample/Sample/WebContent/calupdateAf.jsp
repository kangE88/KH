<%@page import="java.util.Calendar"%>
<%@page import="cal.CalendarDto"%>
<%@page import="cal.CalendarDao"%>
<%@page import="mem.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	MemberDto user = (MemberDto)session.getAttribute("login");

	String seq = request.getParameter("seq");
	int seqInt = Integer.parseInt(seq);
	
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	System.out.println("title===>"+title);
	System.out.println("content===>"+content);
	
	Calendar cal = Calendar.getInstance();
	cal.get(Calendar.YEAR);
	
	
	CalendarDao dao = CalendarDao.getInstance();
	
	boolean isS = dao.UpdateCalendar(seqInt, title, content);
	
	if(isS){
		%>
		<script type="text/javascript">
		alert("업데이트 성공");
		location.href="calendar.jsp";
		</script>
		<%		
	}else{
		%>
		<script type="text/javascript">
		alert("업데이트 실패");
		location.href="calendar.jsp";
		</script>
		<%} %>
<h1>updateAf</h1>
</body>
</html>