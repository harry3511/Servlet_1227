package com.seungmin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class Test10Controller extends HttpServlet {
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	
		{
			put("id", "hagulu");
			put("password", "asdf");
			put("name", "김인규");
		}
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		//아이디 패스워드 전달받고 앱에 있는 정보와 확인 후 처
		
		String userID = request.getParameter("userId");
		String password = request.getParameter("password");
		
		out.print("<html><head><title>로그인</title></head><body>");
		
		if(!userID.equals(userMap.get("id"))) {
			out.print("<h1>ID가 일치하지 않습니다.</h1>");
		} else if(!password.equals(userMap.get("password"))) {
			out.print("<h1>비밀번호가 일치하지 않습니다.</h1>");
		} else {
			out.print("<h1>" + userMap.get("name") + "님 환영 합니다. </h1>");
		}
		
		out.print("</body></html>");
		
		
	}

}