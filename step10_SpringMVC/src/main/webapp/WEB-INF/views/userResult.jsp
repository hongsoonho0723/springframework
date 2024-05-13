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
<h1>회원가입 완료!</h1>
<h3>
아이디 : ${userDTO.id} / ${id} / ${param.id}<br> <!-- userDTO.getId() 호출 @Getter가 필요-->
이름 : ${userDTO.name} <br>
나이 : ${userDTO.age} <br>
주소 : ${userDTO.addr} 
</h3>
<hr>
<h1>회원가입 완료! - 가입된 정보 확인(@ModelAttribute("user"))</h1>
<h3>
아이디 : ${user.id} / ${id} / ${param.id}<br> <!-- userDTO.getId() 호출 @Getter가 필요-->
이름 : ${user.name} <br>
나이 : ${user.age} <br>
주소 : ${user.addr} 
</h3>

<hr>

info : ${info} <br>
<fieldset>
	<legend>점심메뉴는?</legend>
<c:forEach items="${menus}" var="menu">
	<input type="checkbox" name="menu" value="${menu}" >${menu}>
</c:forEach>
</fieldset>






</body>
</html>








