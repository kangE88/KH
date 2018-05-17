<%@page import="pds.PdsDao"%>
<%@page import="java.util.List"%>
<%@page import="pds.PdsDto"%>
<%@page import="pds.iPdsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pdslist.jsp</title>
</head>
<body>


<%
iPdsDao dao = PdsDao.getInstance();
List<PdsDto> list = dao.getPdsList();
%>

<h3>자료실</h3>

<table border="1">
<col width="50"><col width="50"><col width="50"><col width="50"><col width="50"><col width="50"><col width="100">

<tr>
	<th>번호</th><th>작성자</th><th>제목</th><th>다운로드</th><th>조회수</th><th>다운수</th><th>작성일</th>
</tr>

<%
	for(int i=0; i<list.size(); i++){
		PdsDto pds = list.get(i);
		
		String bgcolor = "";
		
		if(i%2 == 0){
			bgcolor = "#ddeebb";
		}else{
			bgcolor = "#ddddcc";
		}
%>
		
		<tr bgcolor="<%=bgcolor %>" align="center" height="5">
			<td><%=i+1 %></td>
			<td><%=pds.getId() %></td>
			<td align="left">
				<a href="pdsdetail.jsp?seq=<%=pds.getSeq() %>">
					<%=pds.getTitle() %>
				</a>
			</td>
			<td>
				<input type="button" name="btnDown" value="file" onclick="location.href='filedown?filename=<%=pds.getFilename()%>&seq=<%=pds.getSeq()%>'">
			</td>
			<td><%=pds.getReadcount()%></td>
			<td><%=pds.getDowncount()%></td>
			<td><%=pds.getRegdate()%></td>
		</tr>
<%
	}
%>
</table>


<a href="pdswrite.jsp">자료올리기</a>

<!-- 
자료실
게시판 + upload + download (파일명 한글명x)
 -->
 
 <br><br>
 
 <a href="bbslist.jsp">Home</a>
 
</body>
</html>