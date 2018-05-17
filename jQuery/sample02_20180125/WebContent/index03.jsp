<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="./jQuery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>
	<a href="http://www.naver.com" title="naver" id="id">naver.com</a>
</p>

<p>
	<a href="http://www.tutorialspoint.com" id="w3s">tutorialspoint.com</a>
</p>

<button>href와 title변경</button>

<script type="text/javascript">
$(function() {
	$("button").click(function() {
		//setter
		$("#id").attr({
			"title":"daum",
			"href":"http://www.daum.net",
		});
		
		$("#id").text("다음");
		
		$("#w3s").attr("href", function(i, origValue) {
			//alert(origValue);
			return origValue+"/jsp";
		});
	});
});
</script>

</body>
</html>