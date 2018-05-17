<%@page import="dto.myclass"%>
<%@page import="java.util.ArrayList"%>
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
<%
ArrayList<myclass> list = new ArrayList<myclass>();

list.add(new myclass(1001, "AAA"));
list.add(new myclass(1002, "bbb"));
list.add(new myclass(1001, "CCC"));

request.setAttribute("mylist", list);
%>

<c:out value="${mylist }"></c:out>

<script type="text/javascript">

alert("<%=list.get(0).getName() %>");

// list -> json type
var jsonList ={number:"<%=list.get(0).getNumber() %>",
			name:"<%=list.get(0).getName() %>" };
			
alert(jsonList.number);
alert(jsonList.name);

// list -> list
var myArrList = [];
var loop = 0;

<% for(int i=0;i<list.size();i++){ %>
	myArrList[loop] = { number:"<%=list.get(i).getNumber() %>",
		name:"<%=list.get(i).getName() %>" };
		loop++;
<%}%>


for(i =0;i<myArrList.length;i++){
	alert("myArrList ===>"+myArrList[i].number);
	alert("myArrList ===>"+myArrList[i].name);
}

//EL 사용
var myArrList2 = [];
var loop = 0;

<c:forEach items="${mylist}" var="dto">
	myArrList2[loop] = { number:"${dto.number}", name:"${dto.name}"};
	loop++;
</c:forEach>

for(i=0; i<myArrList2.length; i++){
	alert("myArrList2 ===>"+myArrList2[i].number);
	alert("myArrList2 ===>"+myArrList2[i].name);
}

</script>

</body>
</html>