package com.springMVC.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectHandler {

	//@RequestMapping("/first")                            //1st method (Best)
	/*public String firstURL() {
		System.out.println("This is first handler...>");
		return "redirect:/second";
	}
	*/
	
	@RequestMapping("/first")                   //2nd method
	public RedirectView firstURL() {
		System.out.println("This is first handler...>");
		RedirectView rv=new RedirectView();
		rv.setUrl("second");
		rv.setUrl("https://www.google.com");
		return rv;
	}
	
	
	
	/*
	    @RequestMapping("/first")                            //3rd method (Not Recommended)
		public String firstURL(HttpServletResponse response) {
			System.out.println("This is first handler...>");
			try {
				response.sendRedirect("https://www.google.com");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "";
		}
		*/
	
	
	
	@RequestMapping("/second")
	public String secondURL() {
		System.out.println("This is second handler...>");
		return "about";
	}
}
