<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>HR Tab</h1>

<pre>
SELECT * FROM TAB 모든 테이블의 목록 리스트를 뿌려준다.
</pre>

<%!
public boolean has$(String msg){
	//$가 포함되어있는 테이블은 링크되지 않도록 하기 위한 함수
	return msg.contains("$");
}

%>

<%

Class.forName("oracle.jdbc.driver.OracleDriver");

String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "hr";
String pass = "hr";

Connection conn = DriverManager.getConnection(url, user, pass);

String sql = "SELECT * FROM TAB";

PreparedStatement psmt = conn.prepareStatement(sql);

ResultSet rs = psmt.executeQuery();

ResultSetMetaData rsmd = rs.getMetaData(); // 컬럼정보
int count = rsmd.getColumnCount(); 		   // 컬럼 수

%>


<table border="1">
<tr>
<%
	for(int i=1;i<count+1;i++){
	%>
		<td><%=rsmd.getColumnClassName(i) %></td>
	<%
	}
%>
</tr>

<%
	while(rs.next()){
		%>
		<tr>
			<%
			for(int i=1;i<count+1;i++){
				String cols = rs.getString(i);
				if(i==1 && !has$(cols)){
					%>
					<td>
						<a href="table.jsp?tname=<%=cols %>"><%=cols %></a>
					</td>
					<%
				}else{
					%>
					<td><%=rs.getString(i) %></td>
					<%
				}
			}
			%>		
		</tr>
	<%
	}
%>
</table>

<%
if(rs != null) rs.close();
if(psmt != null)psmt.close();
if(conn != null)conn.close();

%>

</body>
</html>