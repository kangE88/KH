<%@page import="mem.MemberDto"%>
<%@page import="cal.CalendarDto"%>
<%@page import="cal.CalendarDao"%>
<%@page import="cal.iCalendarDao"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>caldetail.jsp</title>
</head>
<body>

<%!

public String toDates(String mdate){
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
	
	String s = mdate.substring(0, 4) + "-" 	// yyyy
			+ mdate.substring(4, 6) + "-"	// MM
			+ mdate.substring(6, 8) + " " 	// dd
			+ mdate.substring(8, 10) + ":"	// hh
			+ mdate.substring(10, 12) + ":00"; 
	Timestamp d = Timestamp.valueOf(s);
	
	return sdf.format(d);	
} 

public String toOne(String msg){	// 08 -> 8
	return msg.charAt(0)=='0'?msg.charAt(1) + "": msg.trim();
}
%>

<%
MemberDto user = (MemberDto)session.getAttribute("login");

String seq = request.getParameter("seq");
int seqInt = Integer.parseInt(seq);

System.out.println("update seq==>"+seq);


iCalendarDao dao = CalendarDao.getInstance();
CalendarDto dto = dao.getDay(seqInt);


%>
<form action="calupdateAf.jsp">
<table border="1">
<col width="200"><col width="500">

<tr>
	<td>아이디</td>
	<td><%=dto.getId() %></td>
</tr>

<tr>
	<td>제목</td>
	<td><input type="text" name="title"></td>
</tr>

<tr>
	<td>일정</td>
	<td><%=toDates(dto.getRdate()) %></td>
</tr>

<tr>
	<td>내용</td>
	<td>
		<textarea rows="20" cols="60" name="content"></textarea>
	</td>
</tr>

<tr>
	<td colspan="2" align="center">
		<input type="hidden" name="seq" value="<%=dto.getSeq() %>">
		<input type="submit" value="수정">
	</td>
</tr>
</table>
</form>

</body>
</html>



