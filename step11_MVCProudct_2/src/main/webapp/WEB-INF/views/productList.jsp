<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
  table{width: 800px;border:5px green solid;}
  td,th{text-align: center; border: 1px gray solid;}
  a{text-decoration: none;}
</style>


<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.6.1.min.js"></script>

<script type="text/javascript">
  $(function(){
	  $("input[value=삭제]").click(function(){
		  if(confirm("정말 삭제할래요?")){
			  let code = $(this).attr("id");
			  location.href="${pageContext.request.contextPath}/del/"+code; //del?code=value
		  }
		  
		  
		  
	  });
  })
</script>


</head>
<body>


<table>
<caption>
  <h1>[ Product List Page ]</h1>
</caption>
 <tr>
   <th>번호</th>
   <th>상품코드</th>
   <th>상품이름</th>
   <th>상품가격</th>
   <th>상품설명</th>
   <th>삭제하기</th>
 </tr>
   
  <c:forEach items="${productList}" var="product" varStatus="state">
    <tr>
      <td>${state.count}</td>
      <td>${product.code}</td>
      <td><a href="${pageContext.request.contextPath}/read?code=${product.code}">${product.name}</a></td>
      <td><fmt:formatNumber value="${product.price}"/>원</td>
      <td>${product.detail}</td>
      <td><input type="button" value="삭제" id="${product.code}"></td>
    </tr>
  </c:forEach>
  <tr>
    <th colspan="6"><a href="${pageContext.request.contextPath}/insertForm">상품등록하기</a></th>
   </tr>
 
</table>


</body>




</html>