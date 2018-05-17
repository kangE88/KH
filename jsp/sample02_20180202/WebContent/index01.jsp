<%@page import="sample02.myCls"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
    
    public class myClass{
    	private int num;
    	private String name;
    	
    	public myClass(){
    		num = 12;
    		name = "kang";
    	}
    	public String print(){
    		System.out.println("num = " + num);
    		System.out.println("num = " + name);
    		return num + " " + name;
    	}
    	
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

myClass cls = new myClass();
out.println(cls.print());

myCls _cls = new myCls();
out.println(_cls.print());

int x = 0;
/* 
for(int i = 0; i < 10; i++){
	x++;
	out.println(x);
} 
*/
%>
<%
for(int i = 0; i < 10; i++){
	x++;
%>
<%=x %>
<%} %>


<br>
<br>


<%
for(int i = 0; i < 10; i++){
	out.println("<h1>루프:"+i+"</h1>");
}

for(int i = 1; i < 7; i++){
	out.println("<h"+i+">루프:"+i+"</"+i+">");
}
%>

<%
for(int i = 0; i < 10; i++){
%>
	<h1>루프 :<%=i %></h1>
<%
}
%>

<%-- 
<%! %> 선언부 : class, function, 변수
<%  %> 코드부 : 소스
<%= %> 값     : value
 --%>

<%
myCls cls1 = new myCls();
out.println("<p>" + cls1.print()+"</p>");
%>

<p><%=cls.print() %></p>

</body>
</html>