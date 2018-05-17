<%@page import="jsptag.samClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("utf-8");
%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- jsp:include -->

<p>index 시작</p>

<jsp:include page="NewFile.jsp" flush="false"></jsp:include>

<p>index 끝</p>


<!-- jsp:forward -->
<%-- <%
String fname = "NewFile";
%>
<jsp:forward page='<%=fname + ".jsp" %>'></jsp:forward>
 --%>




<!-- NewFile1.jsp 에 파라미터를 설정해서 넘기는 경우 -->
<%-- 
<jsp:forward page="NewFile1.jsp">
	<jsp:param name="number" value="1001" />
	<jsp:param name="name" value="홍길동" />
</jsp:forward>
 --%>



<!-- jsp:useBean -->
<%
samClass scls = new samClass();
scls.setName("홍길동");
%>

<jsp:useBean id="_scls" scope="request" class="jsptag.samClass"/>

<!-- jsp:setProperty (setter)-->
<jsp:setProperty name="_scls" property="name" value="홍길동" />

name=<%=_scls.getName() %>
name=<jsp:getProperty name="_scls" property="name" />
name=${_scls.name }		<!-- 가능 -->
name=${scls.name }		<!-- 안됨!! -->

</body>
</html>






