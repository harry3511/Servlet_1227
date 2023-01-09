<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기사</title>
</head>
<body>

	<h1>[속보] 오늘 밤 날씨 추워</h1>
	<%-- 정적방식 --%>
	<div>기사 전송시간 : <%@ include file="date.jsp" %> </div>
	
	<%--위에 date.jsp를 불러왔기 때문에 밑에서 dateString을 쓸 수 있다. --%>
	<%= dateString %>
	<hr>
	<div>(끝)</div>
	
</body>
</html>