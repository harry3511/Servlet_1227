<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI</title>

</head>
<body>
	<%
		// 키와 몸무게
		String heightString = request.getParameter("height");
		String weightString = request.getParameter("weight");
		
		int height = Integer.parseInt(heightString);
		int weight = Integer.parseInt(weightString);
		
		double bmi = weight / ((height / 100.0) * (height / 100.0));
	
		/* 
		저체중	20 미만
		정상	20 - 24
		과체중	25 - 29
		비만	30 이상 

		체중 / (신장 * 신장 )

		*/
		String status = null;
		if(bmi <= 20) {
			status = "저체중";
		} else if(bmi <= 25) {
			status = "정상";
		} else if (bmi <= 30) {
			status = "과체중";
		} else {
			status = "비만;
		}
		
	%>
	
	<div class = "contianer">
		<h1> BMI 측정 결과</h1>
		<div class="display-4">당신은 <span class="text-info"> <%= status %> </span>입니다.</div>
		<div>BMI 수치: <%= bmi %></div>
	</div>
</body>
</html>