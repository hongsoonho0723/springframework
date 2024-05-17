<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상품등록 폼</h1>
<form action="${pageContext.request.contextPath}/products" method="post">
	<table border="1">
	 <tr>
	   <th>상품코드</th>
	   <td><input type="text" name="code" ></td>
	 </tr>
	  <tr>
	   <th>상품이름</th>
	   <td><input type="text" name="name" ></td>
	 </tr>
	  <tr>
	   <th>상품가격</th>
	   <td><input type="number" name="price" ></td>
	 </tr>
	  <tr>
	   <th>상품설명</th>
	   <td><textarea name="detail" rows="10" cols="20"></textarea></td>
	 </tr>
	 <tr>
	   <th colspan="2">
	     <input type="submit" value="등록하기">
	     <input type="reset" value="취소하기">
	   </th>
	 </tr>
	</table>
</form>
</body>
</html>





