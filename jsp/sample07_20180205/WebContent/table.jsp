<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
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

<%

Class.forName("oracle.jdbc.driver.OracleDriver");

String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "hr";
String pass = "hr";

Connection conn = DriverManager.getConnection(url, user, pass);

String tname = request.getParameter("tname");

tname = tname == null || tname.equals("")?"TAB":tname.toUpperCase();

String sql = "SElECT * FROM " + tname;

PreparedStatement psmt = conn.prepareStatement(sql);

ResultSet rs = psmt.executeQuery();

ResultSetMetaData rsmd = rs.getMetaData(); //컬럼정보
int count = rsmd.getColumnCount(); 		   // 컬럼 수

%>

<table border="1">
<tr>
<%
   for(int i=1; i<count +1; i++){
   %>
   <td><%=rsmd.getColumnName(i) %></td>
<%
   }
%>
</tr>
<%
while(rs.next()){
   %>
   <tr>
   <%
   for(int i = 1; i < count+1; i++){
   %>
      <td><%=rs.getString(i) %></td>
      <%
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