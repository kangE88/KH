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

<h1>Photo Library</h1>
<img src="./image/p01.jpg" id="img1" style="border: solid 5px blue" width="30%">

<h1>▼New photos</h1>
<img src="./image/p02.jpg" id="img2" style="border: solid 5px blue">
<img src="./image/p03.jpg" id="img3" style="border: solid 5px blue">
<img src="./image/p04.jpg" id="img4" style="border: solid 5px blue">
<img src="./image/p05.jpg" id="img5" style="border: solid 5px blue">
<h1>▼Old photos</h1>
<img src="./image/p06.jpg" id="img6" style="border: solid 5px blue">
<img src="./image/p07.jpg" id="img7" style="border: solid 5px blue">
<img src="./image/p08.jpg" id="img8" style="border: solid 5px blue">
<img src="./image/p09.jpg" id="img9" style="border: solid 5px blue"><br> 
<img src="./image/p10.jpg" id="img10" style="border: solid 5px blue">
<img src="./image/p11.jpg" id="img11" style="border: solid 5px blue">
<img src="./image/p12.jpg" id="img12" style="border: solid 5px blue">
<img src="./image/p13.jpg" id="img13" style="border: solid 5px blue">

<script type="text/javascript">
	$('img').click(function () {
		$('#img1').attr("src",this.src);
	});
</script>

</body>
</html>
