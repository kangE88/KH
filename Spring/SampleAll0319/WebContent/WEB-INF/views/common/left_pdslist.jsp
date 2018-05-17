<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<fmt:requestEncoding value="utf-8"/>

<div class="menu_table">
	<ul style="width:100%;">
	<li class="title">자료실</li>
	<li class="subtitle">자료실</li>
	<li class="menu_item">
		<a href="#none"  onclick="url_pdslist()" title="자료실목록">자료실목록</a>
		<a href="#none"  onclick="url_pdswrite()" title="자료등록">자료등록</a>
	</li>			
	</ul>				
</div>

<script>
function url_pdslist(){
	location.href="pdslist.do";
}

function url_pdswrite(){
	location.href="pdswrite.do";
}
</script>