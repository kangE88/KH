<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="cal.CalendarDao"%>
<%@page import="cal.CalendarDto"%>
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

CalendarDto dto = new CalendarDto();
CalendarDao dao = CalendarDao.getInstance();

dto = dao.getCalendar(user.getId(), Integer.parseInt(seq));

%>
<h1>일정 글등록 상세보기</h1>


<table border="1">
<col width="100"><col width="100"><col width="100"><col width="200">
<tr>
	<th>No</th>
	<th>ID</th>
	<th>글제목</th>
	<th>글내용</th>
</tr>
<tr>
	<td><%=seq %></td>
	<td><%=user.getId() %></td>
	<td><%=dto.getTitle() %></td>
	<td><%=dto.getContent() %></td>
</tr>
</table>

</body>
</html>