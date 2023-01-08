package com.seungmin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class Test09Controller extends HttpServlet {

	@Override 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String selfIntroduction = request.getParameter("selfIntroduction");
		
		out.print("<html><head><title></title></head><body>");
		
		out.print("<h1>" + name + "님 지원이 완료 되었습니다.</h1>");
		
		out.print("<hr> 지원 내용 <br>");
		
		out.print(selfIntroduction);
		
		out.print("</body></html>");
	}
}