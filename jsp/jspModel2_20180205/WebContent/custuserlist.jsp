<%@page import="DTO.CustUserBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
List<CustUserBean> custlist = (List<CustUserBean>)request.getAttribute("custlist");

/* 
//DB조회된 데이터 custlist에 담아 확인하는 부분
for(int i=0;i<custlist.size();i++){
	System.out.println(custlist.get(i).toString());
}
 */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>custuserlist.jsp</title>

<script type="text/javascript">
function deletechecks(e) {
	var x = document.getElementsByName("delck");	
	var len = x.length;
	
	for(i = 0;i < len; i++){
		x[i].checked = e;
	}
}
</script>
</head>
<body>

<div align="center">

<form action="CustUserMulDelControl" method="get">
	<input type="hidden" name="command" value="muldel">
	
	<table style="width:700 ">
	<col width="100"><col width="300"><col width="300">
	
	<tr>
		<td height="2" bgcolor="#0000ff" colspan="3"></td>
	</tr>	
	
	<tr bgcolor="#f6f6f6">
		<td bgcolor="yellow" align="center">
			<input type="checkbox" name="alldel"
				onclick="deletechecks(this.checked)">
		</td>	
		<td>아이디</td>
		<td>이   름</td>
	</tr>
	
	<tr>
		<td height="2" bgcolor="#0000ff" colspan="3"></td>
	</tr>
	
	<%
	if(custlist.size() == 0){	
	%>
		<tr bgcolor="#f6f6f6">
			<td colspan="3" align="center">고객리스크가 존재하지 않습니다</td>
		</tr>	
	<%
	}else{
		for(CustUserBean cust : custlist){
	%>
		<tr bgcolor="#f6f6f6">
			<td align="center" bgcolor="yellow">
				<input type="checkbox" name="delck" value="<%=cust.getId() %>">
			</td>	
			
			<td><%=cust.getId() %></td>
			
			<td>
				<a href="CustUserDetailControl?command=detail&id=<%=cust.getId() %>">
					<%=cust.getName() %>
				</a>
			</td>				
		</tr>	
		<tr>
			<td height="2" bgcolor="#0000ff" colspan="3"></td>
		</tr>
	<%
		}
	}
	%>
	
	<tr>
		<td align="center" height="1" bgcolor="#c0c0c0" colspan="3">
			<input type="submit" value="고객정보 삭제">
		</td>
	</tr>
	
	<tr>
		<td height="2" bgcolor="#0000ff" colspan="3"></td>
	</tr>
	
	<tr bgcolor="#f6f6f6">
		<td colspan="3">
			<a href="CustUserAddControl?command=form">고객정보 추가</a>
		</td>	
	</tr>	
	
	</table>
	
</form>

</div>


</body>
</html>