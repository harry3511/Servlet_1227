<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 시간</title>
	<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container" >
		<h1>날짜, 시간 링크 </h1>
		
		<div class="mt-5">
			<a class="btn btn-info" href="/jsp/test02_2.jsp?what=time">현재 시간 확인</a>
			
			<a class="btn btn-success" href="/jsp/test02_2.jsp?what=date">현재 날짜 확인</a>
		</div>
	</div>


	<%
		// 날짜가 보고 싶으면 what=date
		// 시간이 보고 싶으면 what=time 
		String what = request.getParameter("what");	
	
		Date now = new Date();
		SimpleDateFormat timeFormatter = new SimpleDateFormat("현재시간 HH시 mm분 ss");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘 날짜 yyyy년 M월 d")	
	
		String formatString = null;
		if(what.equals("date")){ // 날짜
			formatString = dateFormatter.format(now);
		} else { // 시간
			formatString = timeFormatter.format(now);
		}
				
		
		
	%>
	
	<div>
		<%= formatString %>
		
	</div>
	
</body>
</html>