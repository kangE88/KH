<%@page import="mem.MemberDto"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="cal.CalendarDao"%>
<%@page import="cal.CalendarDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
//숫자 포멧 처리 1 -> 01
 public String two(String msg){
 	return msg.trim().length()<2?"0"+msg:msg.trim();
 }
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
MemberDto user = (MemberDto)session.getAttribute("login");

String seq =request.getParameter("seq");
String id = user.getId();
String title = request.getParameter("title");
String content = request.getParameter("content");

String year = request.getParameter("year");
String month = request.getParameter("month");
String day = request.getParameter("day");
String hour = request.getParameter("hour");
String min = request.getParameter("min");

String rdate = year+two(month+"")+two(day+"")+two(hour+"")+two(min+"");


System.out.println("seq"+seq);
System.out.println("id"+id);
System.out.println("title"+title);
System.out.println("content"+content);

System.out.println("year"+year);
System.out.println("month"+month);

System.out.println("rdate"+rdate);


CalendarDto dto = new CalendarDto();

dto.setId(id);
dto.setTitle(title);
dto.setContent(content);
dto.setRdate(rdate);

List<CalendarDto> list = new ArrayList<CalendarDto>(); 

list.add(dto);

CalendarDao dao = CalendarDao.getInstance();

boolean isS = dao.addCalendar(dto);

if(isS){
	%>
	<script type="text/javascript">
	alert("글작성 성공");
	location.href = "calendar.jsp";
	</script>
	<%
}else{
	%>
	<script type="text/javascript">
	alert("글작성 실패");
	</script>
	<%
}
%>	
</body>
</html>