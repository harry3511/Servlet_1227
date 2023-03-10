package com.seungmin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/test03")
public class Test03Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 타이틀 좋아 
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		String dateString = formatter.format(now);
		
		out.print("<html> <head><title>기사</title></head><body>");
		out.print("<h1>[단독] 고양이가 야옹해</h1>");
		out.print("기사 입력시간 : " + dateString);
		out.print("<hr>");
		out.print("끝");
		out.print("</body></html>");
		
	}

	
}