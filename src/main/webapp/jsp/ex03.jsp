<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post method</title>
</head>
<body>

	<%
		// 닉네임을 전달 받고 그대로 보여주기
		String nickname =  request.getParameter("nickname");
	
		String animal = request.getParameter("animal");
		
		String fruit = request.getParameter("fruit");
		
		/* Stirng food = request.getParameter("food"); */
		String[] foodArray = request.getParameterValues("food");
		
		// 민초,피자 선택했을 때 
		String foodString = "";
		for(int i = 0; i < foodArray.length; i ++) {
			foodString += foodArray[i] + " "; 
			// = foodString = foodString + foodArray[i] + " ";
		}
	%>

	<div><%= nickname %></div>
	<div><%= animal %></div>
	<div><%= fruit %></div>
	<div><%= food %></div>
	<div><%= foodString %></div>
	
</body>
</html>