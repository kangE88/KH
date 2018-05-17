<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>체육관 이용 요금</h1>

기본 사용료(2면,4시간) 40,800원<br>
<input type="checkbox" onclick="operation()" id="1"> 야간조명(20,000원)<br>
<input type="checkbox" onclick="operation()" id="2"> 배구네트x2면(4,000원)<br>
<input type="checkbox" onclick="operation()" id="3"> 배구x10개(5,000원)<br><br>


합계금액
<input type="text" id="result" value="40800">원형

<script type="text/javascript">

   var result = 40800;
   
   function operation(n) {
      
      var ck1 = document.getElementById("1").checked;
      var ck2 = document.getElementById("2").checked;
      var ck3 = document.getElementById("3").checked;
      
      if(ck1){
         if(ck2){
            if(ck3){
               document.getElementById("result").value = result + 20000 + 4000 + 5000;
            }else{
               document.getElementById("result").value = result + 20000 + 4000;
            }
         }else if(ck3){
            document.getElementById("result").value = result + 20000 + 5000;
         }else{
            document.getElementById("result").value = result + 20000;
         }
      }else if(ck2){
         if(ck3){
            document.getElementById("result").value = result + 4000 + 5000;
         }else{
            document.getElementById("result").value = result + 4000;
         }
      }else if(ck3){
         document.getElementById("result").value = result + 5000;
      }else if(!ck1 && !ck2 && !ck3){
         document.getElementById("result").value = result;
      }

      
   }
   
   
   

</script>
</body>
</html>