package com.seungmin.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex02")
public class Ex02Controller extends HttpServlet {
	
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		// 1 ~ 10까지의 합계: 1+2+3+4...+10
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		out.print("<html><head><title>합계</title></head><body>");
		out.print("합계: <strong>" + sum + "</strong>");
		out.print("</body></html>");
	}
	
}