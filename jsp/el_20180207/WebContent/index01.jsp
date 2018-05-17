<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dto.JspTestBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 

EL (Expression Language) tag
	: jsp 안의 java 코드를 tag로 대체하기 위한 용도
	
core

JSTL(Java server page Standard Tag Library)
	: 
 -->
 
 <!-- EL -->
 <%
 	String hello = "Hello";
 	request.setAttribute("str", hello);
 %>
 
 <%
 	String str = (String)request.getAttribute("str");
 %>
 
 <%
 	out.println("str = "+ str);
 %>
 <br><br>
 
 str=<%=str %>
 <br><br>
 
 <!-- EL 사용  -->
 str= ${str }
 <br><br>
 
 
 jsp : <%='값' %><br>
 
 <%=2+3 %><br>
 
 
 el : ${'값' }<br>
 
 ${2+3 }<br>
 
 ${3>2?100:200 }<br>
 
 ----------------------------------<br>
 request.setAttribute("data", "aaa");
 <%
 request.setAttribute("data", "aaa");
 %>
 <br>
 ${data }
 
 <br>-----------------------------------<br>
 
 변수의 data가 비어 있는지?(==null)<br>
 data = ${empty data }
 <br>-----------------------------------<br>
 
 변수의 data가 비어 있지 않은지?(=!null)<br>
 data = ${not empty data }
 
 <pre>
 ${1<9 } <!-- 판정 -->
 ${1+1 } <!-- 연산 -->
 </pre>
 
 <%
 Integer a, b;
 a = 10;
 b = 3;
 request.setAttribute("a", a);
 request.setAttribute("b", b);
 
 Boolean bool = false; // Boolean bool = new Boolean(false);
 request.setAttribute("_bool", bool);
 %>
 
 <pre>
 a:${a }
 b:${b }
 bool:${_bool }
 !bool: ${!_bool }
 
 eq: ${a eq b } <!--  == -->
 eq: ${a == b }
 
 ne: ${a ne b } <!--  != -->
 ne: ${a != b }
 
 lt: ${a lt b } <!-- < -->
 lt: ${a < b }
 
 gt: ${a gt b } <!-- > -->
 gt: ${a > b }
 
 le: ${a le b } <!-- <= -->
 le: ${a <= b }
 
 ge: ${a ge b } <!-- >= -->
 ge: ${a >= b }
 
 div: ${a div b } <!-- / -->
 div: ${a / b }
 
 mod: ${a mod b }<!-- % -->
 mod: ${a % b }
 
 ${a==10 && !_bool }
 
 </pre>
 <br>-----------------------------------<br>
 <%
 request.setAttribute("StringData", "testtext");
 %>
 
 StringData : ${requestScope.StringData }
 
 <br><br>
 <br>-----------------------------------<br>
 <%
 JspTestBean bean = new JspTestBean();
 bean.setMessage("hi el tag");
 
 //el 태그는 항상 request.setAttribute를 설정 해 주어야 한다.
 request.setAttribute("testBean", bean);
 %>
 
 
 <%=bean.getMessage() %><br>
 
 ${testBean.message }
 
 
 <br>-----------------------------------<br>
 
 Array<br><br>
 
 <%
 String array[] = new String[]{"hello", "world"};
 
 request.setAttribute("_array", array);
 %>
 
 ${_array[0] }
 
 <br>-----------------------------------<br>
  
 List<br><br> 
 
 <%
 List<String> list = new ArrayList<String>();
 list.add("hi");
 list.add("el");
 
 request.setAttribute("_list", list);
 %>
 
 list index 0 : ${_list[0] }
 
 
 <br>-----------------------------------<br>
 
 HashMap<br><br>
 
 <%
 HashMap<String, String> map = new HashMap<String, String>();
 
 map.put("key1", "value1");
 map.put("key2", "value2");
 
 request.setAttribute("_map", map);
 %>
 
 ${_map["key2"] }<br>
 ${_map.key1 }
 
</body>
</html>