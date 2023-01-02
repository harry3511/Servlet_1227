package com.seungmin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest reuqest, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
		// 주소, 카드, 가격
		// 전달받고,
		// 전달받은 주소에 서울시가 포함되어 있지 않으면, 배달 불가 지역입니다.를 출력하세요.
		// 전달받은 결제카드가 신한카드인 경우 결제 불가 카드 입니다. 를 출력하세요.
		
		out.println("<html><head><title>결제</title></head><body>>");
		
		if(!address.contains("서울시")) {
			out.println("<h1>배달 불가 지역입니다</h1>");
		} else if(card.equals("신한카드")) {
			out.println("<h1>결제 불가 카드입니다. </h1>");
		} else {
			out.println("<h2>" + address + "로 배달 중 </h2>");
			out.println("<hr> 결제 금액 :" + price + "원");
		}
		
		out.println("</body></html>");
		
	}
	
}
