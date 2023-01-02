package com.seungmin.servlet.config;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
	}
	
}
