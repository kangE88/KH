<%@page import="cal.CalendarDao"%>
<%@page import="cal.iCalendarDao"%>
<%@page import="mem.MemberDto"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page import="cal.CalendarDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
public boolean nvl(String msg){
	return msg == null || msg.trim().equals("")?true:false;
}

// 날짜를 클릭하면, 그 날의 일정이 모두 보이게 하는 calllist.jsp로 이동시키는 함수
public String calllist(int year, int month, int day){
	String s = "";
	
	s += String.format("<a href='%s?year=%d&month=%d&day=%d'>", "calllist.jsp", year, month, day);
	s += String.format("%2d", day);
	s += "</a>";
	
	return s;
}

// 일정 기입하기 위한 pen 이미지를 클릭 시 calwrite.jsp로 이동
public String showPen(int year, int month, int day){
	String s = "";
	String url = "calwrite.jsp";
	String image = "<img src='image/pen.gif'>";
	
	
	s = String.format("<a href='%s?year=%d&month=%d&day=%d'>%s</a>", url, year, month, day, image);
	
	return s;
}

// 숫자 포멧 처리 1 -> 01
public String two(String msg){
	return msg.trim().length()<2?"0"+msg:msg.trim();
}

//일정표시 -> 10자이상이면, ...으로 표시되도록 하는 함수
public String dot3(String msg){
	String s = "";
	if(msg.length() >= 10){
		s = msg.substring(0, 10);
		s += "...";
	}else{
		s = msg.trim();
	}
	
	return s;
}

// 각 날짜 별로 테이블을 생성 함수
public String makeTable(int year, int month, int day, List<CalendarDto> list){
	String s = "";
	String dates = (year+"") + two(month+"") + two(day+""); //20180213
	
	s = "<table>";
	s += "<col width='98'>";
	
	//for each
	for(CalendarDto dto : list){
		if(dto.getRdate().substring(0, 8).equals(dates)){
			s += "<tr bgcolor='pink'>";
			s += "<td>";
			s += "<a href='caldetail.jsp?seq="+dto.getSeq() + "'>";
			s += "<font style='font-size:8; color:red'>";
			s += dot3(dto.getTitle());
			s += "</font>";
			s += "</a>";
			s += "</td>";
			s += "</tr>";
		}
	}
	s += "</table>";
	return s;
}
%>

<h1>달력</h1>
<%
Calendar cal = Calendar.getInstance();
cal.set(Calendar.DATE, 1);

String syear = request.getParameter("year");
String smonth = request.getParameter("month");

int year = cal.get(Calendar.YEAR);
if(!nvl(syear)){
	year = Integer.parseInt(syear);
}

int month = cal.get(Calendar.MONTH) + 1;
if(!nvl(smonth)){
	month = Integer.parseInt(smonth);
}

if(month < 1){
	month = 12;
	year--;	
}

if(month > 12){
	month = 1;
	year++;
}

cal.set(year, month-1, 1); //연월일 set

int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일 1 ~ 7
System.out.println(year+"년 " + month + "월 ");

//<< button (년도 이동)
String pp = String.format("<a href='%s?year=%d&month=%d'><img src='image/left.gif'></a>",
							"calendar.jsp", year-1, month);
//< button (월 이동)
String p = String.format("<a href='%s?year=%d&month=%d'><img src='image/prec.gif'></a>",
							"calendar.jsp", year, month-1);

//>> button (년도 이동)
String nn = String.format("<a href='%s?year=%d&month=%d'><img src='image/last.gif'></a>",
							"calendar.jsp", year+1, month);
//> button (월 이동)
String n = String.format("<a href='%s?year=%d&month=%d'><img src='image/next.gif'></a>",
							"calendar.jsp", year, month+1);

MemberDto user = (MemberDto)session.getAttribute("login");

iCalendarDao dao = CalendarDao.getInstance();

List<CalendarDto> list = dao.getCalendarList(user.getId(), year+two(month+""));



%>

<div align="center">
<table border="1">
<col width="100"><col width="100"><col width="100"><col width="100"><col width="100"><col width="100"><col width="100">

<tr height="100">
<td colspan="7" align="center">
<%=pp %><%=p %>
<font color="black" style="font-size: 50"><%=String.format("%d년&nbsp;&nbsp;%d월", year, month) %></font>
<%=n %><%=nn %>
</td>
</tr>

<tr height="100">
<td align="center">일</td>
<td align="center">월</td>
<td align="center">화</td>
<td align="center">수</td>
<td align="center">목</td>
<td align="center">금</td>
<td align="center">토</td>
</tr>

<tr height="100" align="left" valign="top">
<%
for(int i=1;i<dayOfWeek; i++){
	%>
	<td>&nbsp;</td>
	<%
}

int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
for(int i=1; i<lastDay; i++){
	%>
	<td><%=calllist(year, month, i) %>&nbsp;<%=showPen(year, month, i) %>
		<%=makeTable(year, month, i, list) %>
	</td>
	<%
	if((i+ dayOfWeek -1) % 7 == 0 ){
		%>
		</tr>
		<tr height="100" align="left" valign="top">
		<%
	}
}

for(int i =0; i<(7-(dayOfWeek + lastDay -1)%7 )%7; i++){
	%>
	<td>&nbsp;</td>
	<%
}
%>
</tr>


</table>

</div>


</body>
</html>