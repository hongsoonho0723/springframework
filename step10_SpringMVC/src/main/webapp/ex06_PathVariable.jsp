<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> @PathVariable 예제</h2>


<h2>*.do 설정부분</h2>
<a href="user/jang.do">요청1</a><p/>

<a href="user/hee.do">요청2</a><p/>

<a href="user/kim.do">요청3</a><p/>

<a href="cafe/kim.do">요청4</a>
<hr/>


<h2>/blog/* 설정부분</h2>
<a href="blog/jang">요청1</a><p/>

<a href="blog/hee">요청2</a><p/>

<a href="blog/kim">요청3</a><hr/>



<h2>/blog/* 설정부분</h2>
<a href="blog/board/qna/1">요청1</a><p/>

<a href="blog/board/faq/2">요청2</a><p/>

<a href="blog/board/bbs/3">요청3</a><p/>

<a href="user/board/bbs/3">요청4</a>

<hr>

<a href="blog/board/bbs/3?name=heejung">redirect: vs forward: </a>


</body>
</html>