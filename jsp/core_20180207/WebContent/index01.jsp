<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.JspTestBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- core + EL -->

<c:set var="data" value="JSTL입니다" />

<%-- <%=data %> --%>

${data }

<%--
String data ="JSTL입니다";
request.setAttribute("data", data);
--%>


<c:out value="${_data }"/>

<br><br>

<%
session.setAttribute("sessionData", "sTest");
%>

<c:set var="data1" value="${sessionData }"/>
<c:out value="${data1 }"></c:out>

<c:set var="data2" value="테스트"></c:set>
<c:remove var="data2"/>
<c:out value="${data2 }"></c:out>

<br>-----------------------------<br>

if

<%
request.setAttribute("count", "15");
%>

<c:if test="${count >=10 }">
	count:<c:out value="${count }"></c:out>
</c:if>

<br><br>

JSP if

<%
String count = (String)request.getAttribute("count");
int num = Integer.parseInt(count);

if(num >= 10){
	%>
	count:<%=num %>
<%
}
%>
<br><br>

<%
session.setAttribute("name", "홍길동");
%>

<c:if test="${name=='김길동' }" var="flg"/>

<c:if test="${flg }">
이름은 김길동 입니다.
</c:if>

<c:if test="${!fig }">
이름은 홍길동 입니다.
</c:if>

<br><br>


<%
request.setAttribute("data3", "data3");
%>
객체 data3이 비어있는지? (==null)<br>
${empty data3 }<br><br><br>

<br>---------------------------<br>

for(int i=0;i<10;i++) 
<c:forEach begin="0" end="9" step="1" varStatus="i">
index:<c:out value="${i.index }"></c:out><br>
</c:forEach>


<br>---------------------------<br>

<%
List<JspTestBean> list = new ArrayList<JspTestBean>();

JspTestBean bean = new JspTestBean();
bean.setMessage("HI");
list.add(bean);

bean = new JspTestBean();
bean.setMessage("BYE");
list.add(bean);

bean = new JspTestBean();
bean.setMessage("SEE");
list.add(bean);

request.setAttribute("slist", list);
%>
for(int i=0;i< list.size;i++){<br>
	JspTestBean bean = list.get(i);<br>

for(JspTestBean obj : list)<br>

<c:forEach var="obj" items="${slist }" varStatus="i">
index:<c:out value="${i.index }"></c:out><br>
data:<c:out value="${obj.message }"></c:out><br><br>
</c:forEach>

<br>---------------------------<br>

<%
HashMap<String, String> map = new HashMap<String, String>();
map.put("aa","arar");
map.put("bb","brbr");
map.put("cc","crcr");

request.setAttribute("hmap", map);
%>

<c:forEach var="obj" items="${hmap }">
키:<c:out value="${obj.key }"/><br>
값:<c:out value="${obj.value }"/><br><br>
</c:forEach>


</body>
</html>