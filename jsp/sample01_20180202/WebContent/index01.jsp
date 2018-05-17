<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>Insert title here</title>
</head>
<%!
	//선언부
	//global 변수 (static)
	//함수선언
	//class 선언
	
	//ex
	int gl_num = 0;
	int num = 0;

	public void func(){
		System.out.println("func() 호추");
	}
%>
<body>

<!-- html -->

<%-- jsp 주석문 --%>
<!-- 
JSP Java Server Page - Java + html = JSP 웹페이지를 생성하는 언어

Servlet java(html)
JSP html(java)

Java 코드 -> scriptlet

JSP 목적 -> 클라이언트와 통신(클라이언트를 생성)
 -->
 
 <p>P tag</p>
 
 <h1>title</h1>
 
 <%

 gl_num = 12;
 num = 34;
 
 gl_num++;
 num++;
 
 System.out.println("gl_num = " + gl_num);
 System.out.println("num = "+ num);
 
 out.println("gl_num = " + gl_num);
 out.println("num = "+ num);
 
 func();
 
 //out : 내장객체 - new 를 하지 않고 클래스명 그대로 사용할 수 있는 object
 
 //request(요청), response(응답)
 
 %>

</body>
</html>