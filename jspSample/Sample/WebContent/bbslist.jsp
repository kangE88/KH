<%@page import="bbs.BbsDao"%>
<%@page import="bbs.iBbsDao"%>
<%@page import="bbs.PagingBean"%>
<%@page import="bbs.BbsDto"%>
<%@page import="java.util.List"%>
<%@page import="mem.MemberDao"%>
<%@page import="mem.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bbslist</title>
<style type="text/css">

</style>
</head>

<body>


<%
String findWord = request.getParameter("findWord");
%>

<%!
//댓글
public String arrow(int depth){
	
	//ref step(row) depth(nbsp)
	String rs = "<img src='./image/arrow.png' witdh='20px' height='20px'/>";
	String nbsp = "&nbsp;&nbsp;&nbsp;&nbsp;";
	String ts = "";
	
	for(int i=0;i<depth; i++){
		ts += nbsp;
	}
	
	return depth == 0 ? "" : ts + rs;
}
%>


<h1>게시판</h1>

<%
Object ologin = session.getAttribute("login");
MemberDto mem = null;
if(ologin == null){
%>
	<script type="text/javascript">
	alert("로그인 해주세요.");
	location.href="index.jsp";
	</script>
	<%
	return;
}

mem = (MemberDto)ologin;
%>

<%-- <h3>환영합니다 <%=mem.getName() %>님 반갑습니다.</h3> --%>
<h3>환영합니다.${login.name }님 반갑습니다.</h3>

<a href="calendar.jsp">일정보기</a>

<a href="pdslist.jsp">자료실</a>

<a href="Logout.jsp">로그아웃</a>
<hr>


<%

PagingBean paging = new PagingBean();

if(request.getParameter("nowPage") == null){
	paging.setNowPage(1);
}else{
	paging.setNowPage(Integer.parseInt(request.getParameter("nowPage")));
}
%>

<%
iBbsDao bbsdao = BbsDao.getInstance();

//List<BbsDto> bbslist = bbsdao.getBbsList();

/* 2018-02-13 */
if(findWord == null) findWord = "";
List<BbsDto> bbslist = bbsdao.getBbsPagingList(paging, findWord);
/**/

%>

<div align="center">

<table border="1">
<col width="70"><col width="500"><col width="150">

<tr>
<th>번호</th><th>제목</th><th>작성자</th>
</tr>

<%
if(bbslist == null || bbslist.size() == 0){
	%>
	<tr>
		<td colspan="3">작성된 글이 없습니다</td>
	</tr>	
	<%
}

for(int i = 0;i < bbslist.size(); i++){
	BbsDto bbs = bbslist.get(i);
	%>
	<tr>
	<td><%=i+1 %></td>
	<td>
		<%=arrow(bbs.getDepth()) %>
		<a href="bbsDetail.jsp?seq=<%=bbs.getSeq() %>">
			<%=bbs.getTitle() %>
		</a>
	</td>
	<td><%=bbs.getId() %> </td>
	</tr>	
	<%
}
%>

<tr>
	<td colspan="3">
		<a href="bbswrite.jsp">글쓰기</a>
	</td>
</tr>

<tr>
	<td colspan="3">
		<jsp:include page="paging.jsp">
			<jsp:param name="actionPath" value="bbslist.jsp"/>
			<jsp:param name="nowPage" value="<%=String.valueOf(paging.getNowPage()) %>"/>
			<jsp:param name="totalCount" value="<%=String.valueOf(paging.getTotalCount()) %>"/>
			<jsp:param name="countPerPage" value="<%=String.valueOf(paging.getCountPerPage()) %>"/>
			<jsp:param name="blockCount" value="<%=String.valueOf(paging.getBlockCount()) %>"/>
		</jsp:include>
	</td>
</tr>
</table>

<!-- 2018-02-13 -->
<!-- search -->
<input type=text" id="search">
<button name="search" onclick="searchBbs()">검색</button>
</div>

<script type="text/javascript">
function searchBbs() {
	var msg = document.getElementById("search").value;
	
	alert("msg==>"+msg);
	
	location.href = "bbslist.jsp?findWord=" + msg;
	//document.getElementById("search").value = "";
}
</script>
<!--  -->


</body>
</html>