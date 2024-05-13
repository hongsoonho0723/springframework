<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>예외발생 : ${errMsg}</h3>
<h3>예외클래스 : ${errClass}</h3>

<hr>

<a href="${pageContext.request.contextPath}/ex03_exception.html" >ex03_exception.html이동</a>

</body>
</html>