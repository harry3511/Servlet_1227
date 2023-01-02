package com.seungmin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class Test06Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest reuqest, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String numberString1 = request.getParameter("number1");
		String numberString2 = request.getParameter("number2");
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		int sum = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int div = number1 / number2;
		
		// {"addtion":135, "subtraction":105, "mutliplecation":1800, "division":8}
		
		out.println("{\"addtion\":" + sum + ", \"subtraction\":" + sub + ", \"mutliplecation\":" + mul + ", \"division\":" + div + "}");
		
		
	}

}
