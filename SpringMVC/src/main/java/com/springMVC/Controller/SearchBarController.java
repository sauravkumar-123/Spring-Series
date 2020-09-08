package com.springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchBarController {

	@RequestMapping("/searchbar")
	public String SearchPage()
	{
		System.out.println("Going to search Bar Page..>");
		return "SearchBar";
	}
	
	//Spring Intercepter.
	
	
	
	@RequestMapping("/search_bar")
	public String GetSearchData(@RequestParam("searchpage") String usrdata,Model model) 
	{
		System.out.println("Data is=>"+usrdata);
		model.addAttribute("name",usrdata);
		return "SearchBarWelcome";
	}
}
