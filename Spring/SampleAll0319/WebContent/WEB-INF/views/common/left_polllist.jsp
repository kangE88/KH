<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:requestEncoding value="utf-8"/>

<div class="menu_table">
	<ul style="width:100%;">
		<li class="title">투표</li>
		<li class="subtitle">투표목록</li>
		<c:if test="${login.auth eq '3' }">
			<li class="menu_item">
				<a href="#none" onclick="url_polllist()" title="투표목록">투표목록</a>
			</li>
		</c:if>
		<c:if test="${login.auth eq '1' }">
			<li class="menu_item">
				<a href="#none" onclick="url_pollmake()" title="투표만들기">투표만들기</a>
			</li>
		</c:if>
	</ul>
</div>

<script>
function url_polllist() {
	alert("url_polllist.");
	location.href="polllist.do";
}

function url_pollmake(){
	alert("url_pollmake.");
	location.href="pollmake.do";
}



</script>