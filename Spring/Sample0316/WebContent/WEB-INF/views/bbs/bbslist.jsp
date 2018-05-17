<%@page import="kh.com.a.model.BbsDto"%>
<%@page import="kh.com.a.model.BbsDto"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<%
List<BbsDto> bbsList = (List<BbsDto>)(Object)request.getAttribute("bbslist");
%>
<jsp:useBean id="ubbs" class="kh.com.a.arrow.BbsArrow"/>

<table  style="width:85%;">

<colgroup>
<col style="width:20%;" />
<col style="width:60%;" />
<col style="width:20%;" />							
</colgroup>	

<tr>
<th>순서</th>	<th>제목</th>	<th>작성자</th> 
</tr>

<%
if(bbsList == null || bbsList.size() == 0) {
	%>
	<tr>
		<td colspan="3">작성된 글이 없습니다.</td>
	</tr>
	<%	
}

for(int i = 0; i < bbsList.size(); i++){
	
}

for(int i=0; i < bbsList.size(); i++){
	BbsDto bbs = bbsList.get(i);
	%>
	<jsp:setProperty property="depth" name="ubbs" value="<%=bbs.getDepth()%>"/>
	<tr>
		<td><%=i+1%></td> 
		<td><jsp:getProperty property="arrow" name="ubbs"/><a href='bbsdetail.do?seq=<%=bbs.getSeq()%>'><%=bbs.getTitle()%></a></td>
		<td><%=bbs.getId()%></td> 
	</tr>
	<%
}
%>
</table>
