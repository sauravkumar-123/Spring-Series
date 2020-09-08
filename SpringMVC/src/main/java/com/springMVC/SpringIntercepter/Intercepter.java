package com.springMVC.SpringIntercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Intercepter extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is Pre-Handler......>");
		String name=request.getParameter("searchpage");
		if(name.startsWith("d")||name.startsWith("D"))
		{
			response.setContentType("text/html");
			response.getWriter().println("<h2>Invalid!!  Name should  not start with D or d</h2>");
			return false;
		}
		else {
			return true;
		}
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is Post-Handler......>");
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is After Completion Method......>");
		super.afterCompletion(request, response, handler, ex);
	}
	
}
